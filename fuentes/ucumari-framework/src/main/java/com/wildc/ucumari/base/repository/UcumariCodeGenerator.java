/**
 * 
 */
package com.wildc.ucumari.base.repository;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.MappingException;
import org.hibernate.cfg.ObjectNameNormalizer;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.jdbc.internal.FormatStyle;
import org.hibernate.engine.jdbc.spi.JdbcServices;
import org.hibernate.engine.jdbc.spi.SqlStatementLogger;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IntegralDataTypeHolder;
import org.hibernate.id.PersistentIdentifierGenerator;
import org.hibernate.id.enhanced.AccessCallback;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.jdbc.AbstractReturningWork;
import org.hibernate.jdbc.WorkExecutorVisitable;
import org.hibernate.mapping.Table;
import org.hibernate.type.Type;

import com.wildc.ucumari.base.repository.UIdentifierGeneratorHelper.StringHolder;

/**
 * @author cmontes
 *
 */
public class UcumariCodeGenerator implements PersistentIdentifierGenerator, Configurable  {

	public static final String ID_TABLE = "table";
	public static final String PK_COLUMN_NAME = "primary_key_column";
	public static final String PK_VALUE_NAME = "primary_key_value";
	public static final String VALUE_COLUMN_NAME = "value_column";
	public static final String PK_LENGTH_NAME = "primary_key_length";

	private static final int DEFAULT_PK_LENGTH = 255;
	public static final String DEFAULT_TABLE = "hibernate_sequences";
	private static final String DEFAULT_PK_COLUMN = "sequence_name";
	private static final String DEFAULT_VALUE_COLUMN = "sequence_next_hi_value";

	private String tableName;
	private String pkColumnName;
	private String valueColumnName;
	private String query;
	private String insert;
	private String update;
	
	//hilo params
	public static final String MAX_LO = "max_lo";

	private int maxLo;
	private UOptimizerFactory.LegacyHiLoAlgorithmOptimizer hiloOptimizer;
	
	private Class returnClass;
	private int keySize;
	
	public String[] sqlCreateStrings(Dialect dialect) throws HibernateException {
		return new String[] {
			new StringBuilder( dialect.getCreateTableString() )
					.append( ' ' )
					.append( tableName )
					.append( " ( " )
					.append( pkColumnName )
					.append( ' ' )
					.append( dialect.getTypeName( Types.VARCHAR, keySize, 0, 0 ) )
					.append( ",  " )
					.append( valueColumnName )
					.append( ' ' )
					.append( dialect.getTypeName( Types.INTEGER ) )
					.append( " ) " )
					.toString()
		};
	}

	public String[] sqlDropStrings(Dialect dialect) throws HibernateException {
		return new String[] { dialect.getDropTableString( tableName ) };
	}

	public Object generatorKey() {
		return tableName;
	}

	public synchronized Serializable generate(final SessionImplementor session, Object obj) {
		final WorkExecutorVisitable<IntegralDataTypeHolder> work = new AbstractReturningWork<IntegralDataTypeHolder>() {
			@Override
			public IntegralDataTypeHolder execute(Connection connection) throws SQLException {
				IntegralDataTypeHolder value = UIdentifierGeneratorHelper.getIntegralDataTypeHolder( returnClass );
				SqlStatementLogger statementLogger = session
						.getFactory()
						.getServiceRegistry()
						.getService( JdbcServices.class )
						.getSqlStatementLogger();
				int rows;
				do {
					statementLogger.logStatement( query, FormatStyle.BASIC.getFormatter() );
					PreparedStatement qps = connection.prepareStatement( query );
					PreparedStatement ips = null;
					try {
						ResultSet rs = qps.executeQuery();
						boolean isInitialized = rs.next();
						if ( !isInitialized ) {
							value.initialize( 0 );
							statementLogger.logStatement( insert, FormatStyle.BASIC.getFormatter() );
							ips = connection.prepareStatement( insert );
							value.bind( ips, 1 );
							ips.execute();
						}
						else {
							value.initialize( rs, 0 );
						}
						rs.close();
					}
					catch (SQLException sqle) {
						//LOG.unableToReadOrInitHiValue( sqle );
						sqle.printStackTrace();
						throw sqle;
					}
					finally {
						if (ips != null) {
							ips.close();
						}
						qps.close();
					}

					statementLogger.logStatement( update, FormatStyle.BASIC.getFormatter() );
					PreparedStatement ups = connection.prepareStatement( update );
					try {
						value.copy().increment().bind( ups, 1 );
						value.bind( ups, 2 );
						rows = ups.executeUpdate();
					}
					catch (SQLException sqle) {
						//LOG.error( LOG.unableToUpdateHiValue( tableName ), sqle );
						sqle.printStackTrace();
						throw sqle;
					}
					finally {
						ups.close();
					}
				} while ( rows==0 );

				return value;
			}
		};

		
		// maxLo < 1 indicates a hilo generator with no hilo :?
		if ( maxLo < 1 ) {
			//keep the behavior consistent even for boundary usages
			IntegralDataTypeHolder value = null;
			while ( value == null || value.lt( 1 ) ) {
				value = session.getTransactionCoordinator().getTransaction().createIsolationDelegate().delegateWork( work, true );
			}
			if(value instanceof StringHolder){
				return ((StringHolder) value).makeValueString();
			}
			return value.makeValue();
		}

		return hiloOptimizer.generate(
				new AccessCallback() {
					public IntegralDataTypeHolder getNextValue() {
						return session.getTransactionCoordinator().getTransaction().createIsolationDelegate().delegateWork( work, true );
					}
				}
		);
	}

	public void configure(Type type, Properties params, Dialect dialect) throws MappingException {
		ObjectNameNormalizer normalizer = ( ObjectNameNormalizer ) params.get( IDENTIFIER_NORMALIZER );

		tableName = normalizer.normalizeIdentifierQuoting( ConfigurationHelper.getString( ID_TABLE, params, DEFAULT_TABLE ) );
		if ( tableName.indexOf( '.' ) < 0 ) {
			tableName = dialect.quote( tableName );
			final String schemaName = dialect.quote(
					normalizer.normalizeIdentifierQuoting( params.getProperty( SCHEMA ) )
			);
			final String catalogName = dialect.quote(
					normalizer.normalizeIdentifierQuoting( params.getProperty( CATALOG ) )
			);
			tableName = Table.qualify( catalogName, schemaName, tableName );
		}
		else {
			// if already qualified there is not much we can do in a portable manner so we pass it
			// through and assume the user has set up the name correctly.
		}

		pkColumnName = dialect.quote(
				normalizer.normalizeIdentifierQuoting(
						ConfigurationHelper.getString( PK_COLUMN_NAME, params, DEFAULT_PK_COLUMN )
				)
		);
		valueColumnName = dialect.quote(
				normalizer.normalizeIdentifierQuoting(
						ConfigurationHelper.getString( VALUE_COLUMN_NAME, params, DEFAULT_VALUE_COLUMN )
				)
		);
		keySize = ConfigurationHelper.getInt(PK_LENGTH_NAME, params, DEFAULT_PK_LENGTH);
		String keyValue = ConfigurationHelper.getString(PK_VALUE_NAME, params, params.getProperty(TABLE) );

		query = "select " +
			valueColumnName +
			" from " +
			dialect.appendLockHint( LockMode.PESSIMISTIC_WRITE, tableName ) +
			" where " + pkColumnName + " = '" + keyValue + "'" +
			dialect.getForUpdateString();

		update = "update " +
			tableName +
			" set " +
			valueColumnName +
			" = ? where " +
			valueColumnName +
			" = ? and " +
			pkColumnName +
			" = '" +
			keyValue
			+ "'";

		insert = "insert into " + tableName +
			"(" + pkColumnName + ", " +	valueColumnName + ") " +
			"values('"+ keyValue +"', ?)";


		//hilo config
		//maxLo = ConfigurationHelper.getInt(MAX_LO, params, Short.MAX_VALUE);
		maxLo = ConfigurationHelper.getInt(MAX_LO, params, 1);
		
		returnClass = type.getReturnedClass();

		if ( maxLo >= 1 ) {
			hiloOptimizer = new UOptimizerFactory.LegacyHiLoAlgorithmOptimizer( returnClass, maxLo );
		}
	}

}
