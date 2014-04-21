/**
 * 
 */
package com.wildc.ucumari.base.repository;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.id.IntegralDataTypeHolder;
import org.hibernate.id.enhanced.AccessCallback;
import org.hibernate.id.enhanced.OptimizerFactory.OptimizerSupport;
import org.hibernate.internal.CoreMessageLogger;
import org.jboss.logging.Logger;

import com.wildc.ucumari.base.repository.UIdentifierGeneratorHelper.StringHolder;

/**
 * @author cmontes
 *
 */
public class UOptimizerFactory {
	 private static final CoreMessageLogger LOG = Logger.getMessageLogger(
				CoreMessageLogger.class,
				UOptimizerFactory.class.getName()
		);
	
	public static class LegacyHiLoAlgorithmOptimizer extends OptimizerSupport {
		private long maxLo;
		private long lo;
		private IntegralDataTypeHolder hi;

		private IntegralDataTypeHolder lastSourceValue;
		private IntegralDataTypeHolder value;


		public LegacyHiLoAlgorithmOptimizer(Class returnClass, int incrementSize) {
			super( returnClass, incrementSize );
			if ( incrementSize < 1 )
				throw new HibernateException( "increment size cannot be less than 1" );
			if ( LOG.isTraceEnabled() ) {
				LOG.tracev( "Creating hilo optimizer (legacy) with [incrementSize={0}; returnClass={1}]", incrementSize, returnClass.getName() );
			}
			maxLo = incrementSize;
			lo = maxLo+1;
		}

		@Override
		public synchronized Serializable generate(AccessCallback callback) {
			/*if ( lo > maxLo ) {
				lastSourceValue = callback.getNextValue();
				lo = lastSourceValue.eq( 0 ) ? 1 : 0;
				hi = lastSourceValue.copy().multiplyBy( maxLo+1 );
			}
			value = hi.copy().add( lo++ );*/
			value = callback.getNextValue();			
			if(value instanceof StringHolder){
				return ((StringHolder) value).makeValueString();
			}
			return value.makeValue();
		}

		@Override
		public IntegralDataTypeHolder getLastSourceValue() {
			return lastSourceValue.copy();
		}

		@Override
		public boolean applyIncrementSizeToSourceValues() {
			return false;
		}

		/**
		 * Getter for property 'lastValue'.
		 * <p/>
		 * Exposure intended for testing purposes.
		 *
		 * @return Value for property 'lastValue'.
		 */
		@SuppressWarnings( {"UnusedDeclaration"})
		public IntegralDataTypeHolder getLastValue() {
			return value;
		}
	}

}
