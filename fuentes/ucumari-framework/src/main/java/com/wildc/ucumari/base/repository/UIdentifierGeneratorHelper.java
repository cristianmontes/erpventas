/**
 * 
 */
package com.wildc.ucumari.base.repository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.id.IdentifierGenerationException;
import org.hibernate.id.IdentifierGeneratorHelper;
import org.hibernate.id.IntegralDataTypeHolder;
import org.hibernate.id.IdentifierGeneratorHelper.BasicHolder;
import org.hibernate.id.IdentifierGeneratorHelper.BigDecimalHolder;
import org.hibernate.id.IdentifierGeneratorHelper.BigIntegerHolder;

/**
 * @author cmontes
 *
 */
public final class UIdentifierGeneratorHelper {
	
	public static IntegralDataTypeHolder getIntegralDataTypeHolder(Class integralType) {
		if ( integralType == Long.class
				|| integralType == Integer.class
				|| integralType == Short.class ) {
			return new BasicHolder( integralType );
		}
		else if ( integralType == BigInteger.class ) {
			return new BigIntegerHolder();
		}
		else if ( integralType == BigDecimal.class ) {
			return new BigDecimalHolder();
		}
		else if ( integralType == String.class ) {
			return new StringHolder();
		}
		else {
			throw new IdentifierGenerationException(
					"Unknown integral data type for ids : " + integralType.getName()
			);
		}
	}
	
	public static class StringHolder implements IntegralDataTypeHolder {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private String value;

		public IntegralDataTypeHolder initialize(long value) {
			this.value = String.valueOf( value );
			return this;
		}

		public IntegralDataTypeHolder initialize(ResultSet resultSet, long defaultValue) throws SQLException {
			final String rsValue = resultSet.getString( 1 );
			if ( resultSet.wasNull() ) {
				return initialize( defaultValue );
			}
			this.value = rsValue;
			return this;
		}

		public void bind(PreparedStatement preparedStatement, int position) throws SQLException {
			preparedStatement.setBigDecimal( position, new BigDecimal( value ) );
		}

		public IntegralDataTypeHolder increment() {
			checkInitialized();			
			value =  ((new BigInteger(value)).add( BigInteger.ONE )).toString();
			return this;
		}

		private void checkInitialized() {
			if ( value == null ) {
				throw new IdentifierGenerationException( "integral holder was not initialized" );
			}
		}

		public IntegralDataTypeHolder add(long increment) {
			checkInitialized();
			value =  ((new BigInteger(value)).add( BigInteger.valueOf( increment ) )).toString();			
			return this;
		}

		public IntegralDataTypeHolder decrement() {
			checkInitialized();
			value =  ((new BigInteger(value)).subtract( BigInteger.ONE )).toString();			
			return this;
		}

		public IntegralDataTypeHolder subtract(long subtrahend) {
			checkInitialized();
			value =  ((new BigInteger(value)).subtract( BigInteger.valueOf( subtrahend ) )).toString();			
			return this;
		}

		public IntegralDataTypeHolder multiplyBy(IntegralDataTypeHolder factor) {
			checkInitialized();
			value =  ((new BigInteger(value)).multiply( IdentifierGeneratorHelper.extractBigInteger( factor ) )).toString();			
			return this;
		}		

		public IntegralDataTypeHolder multiplyBy(long factor) {
			checkInitialized();
			value =  ((new BigInteger(value)).multiply( BigInteger.valueOf( factor ) )).toString();			
			return this;
		}

		public boolean eq(IntegralDataTypeHolder other) {
			checkInitialized();
			return (new BigInteger(value)).compareTo( IdentifierGeneratorHelper.extractBigInteger( other ) ) == 0;
		}

		public boolean eq(long value) {
			checkInitialized();
			return (new BigInteger(this.value)).compareTo( BigInteger.valueOf( value ) ) == 0;
		}

		public boolean lt(IntegralDataTypeHolder other) {
			checkInitialized();
			return (new BigInteger(value)).compareTo( IdentifierGeneratorHelper.extractBigInteger( other ) ) < 0;
		}

		public boolean lt(long value) {
			checkInitialized();
			return (new BigInteger(this.value)).compareTo( BigInteger.valueOf( value ) ) < 0;
		}

		public boolean gt(IntegralDataTypeHolder other) {
			checkInitialized();
			return (new BigInteger(value)).compareTo( IdentifierGeneratorHelper.extractBigInteger( other ) ) > 0;
		}

		public boolean gt(long value) {
			checkInitialized();
			return (new BigInteger(this.value)).compareTo( BigInteger.valueOf( value ) ) > 0;
		}

		public IntegralDataTypeHolder copy() {
			StringHolder copy = new StringHolder();
			copy.value = value;
			return copy;
		}

		public Number makeValue() {
			checkInitialized();
			return new BigInteger(value);
		}
		
		public String makeValueString() {
			checkInitialized();
			return value;
		}

		public Number makeValueThenIncrement() {
			final Number result = makeValue();
			value = ((new BigInteger(value)).add( BigInteger.ONE )).toString();
			return result;
		}

		public Number makeValueThenAdd(long addend) {
			final Number result = makeValue();
			value = ((new BigInteger(value)).add( BigInteger.valueOf( addend ) )).toString();
			return result;
		}

		@Override
        public String toString() {
			return "StringHolder[" + value + "]";
		}

		@Override
        public boolean equals(Object o) {
			if ( this == o ) {
				return true;
			}
			if ( o == null || getClass() != o.getClass() ) {
				return false;
			}

			StringHolder that = (StringHolder) o;

			return this.value == null
					? that.value == null
					: value.equals( that.value );
		}

		@Override
        public int hashCode() {
			return value != null ? value.hashCode() : 0;
		}
	}
	
	/*
	public static class StringHolder implements IntegralDataTypeHolder {
		
		private static final long serialVersionUID = 1L;
		
		private BigInteger value;

		public IntegralDataTypeHolder initialize(long value) {
			this.value = BigInteger.valueOf( value );
			return this;
		}

		public IntegralDataTypeHolder initialize(ResultSet resultSet, long defaultValue) throws SQLException {
			final BigDecimal rsValue = resultSet.getBigDecimal( 1 );
			if ( resultSet.wasNull() ) {
				return initialize( defaultValue );
			}
			this.value = rsValue.setScale( 0, BigDecimal.ROUND_UNNECESSARY ).toBigInteger();
			return this;
		}

		public void bind(PreparedStatement preparedStatement, int position) throws SQLException {
			preparedStatement.setBigDecimal( position, new BigDecimal( value ) );
		}

		public IntegralDataTypeHolder increment() {
			checkInitialized();
			value = value.add( BigInteger.ONE );
			return this;
		}

		private void checkInitialized() {
			if ( value == null ) {
				throw new IdentifierGenerationException( "integral holder was not initialized" );
			}
		}

		public IntegralDataTypeHolder add(long increment) {
			checkInitialized();
			value = value.add( BigInteger.valueOf( increment ) );
			return this;
		}

		public IntegralDataTypeHolder decrement() {
			checkInitialized();
			value = value.subtract( BigInteger.ONE );
			return this;
		}

		public IntegralDataTypeHolder subtract(long subtrahend) {
			checkInitialized();
			value = value.subtract( BigInteger.valueOf( subtrahend ) );
			return this;
		}

		public IntegralDataTypeHolder multiplyBy(IntegralDataTypeHolder factor) {
			checkInitialized();
			value = value.multiply( IdentifierGeneratorHelper.extractBigInteger( factor ) );
			return this;
		}

		public IntegralDataTypeHolder multiplyBy(long factor) {
			checkInitialized();
			value = value.multiply( BigInteger.valueOf( factor ) );
			return this;
		}

		public boolean eq(IntegralDataTypeHolder other) {
			checkInitialized();
			return value.compareTo( IdentifierGeneratorHelper.extractBigInteger( other ) ) == 0;
		}

		public boolean eq(long value) {
			checkInitialized();
			return this.value.compareTo( BigInteger.valueOf( value ) ) == 0;
		}

		public boolean lt(IntegralDataTypeHolder other) {
			checkInitialized();
			return value.compareTo( IdentifierGeneratorHelper.extractBigInteger( other ) ) < 0;
		}

		public boolean lt(long value) {
			checkInitialized();
			return this.value.compareTo( BigInteger.valueOf( value ) ) < 0;
		}

		public boolean gt(IntegralDataTypeHolder other) {
			checkInitialized();
			return value.compareTo( IdentifierGeneratorHelper.extractBigInteger( other ) ) > 0;
		}

		public boolean gt(long value) {
			checkInitialized();
			return this.value.compareTo( BigInteger.valueOf( value ) ) > 0;
		}

		public IntegralDataTypeHolder copy() {
			StringHolder copy = new StringHolder();
			copy.value = value;
			return copy;
		}

		public Number makeValue() {
			checkInitialized();
			return value;
		}

		public Number makeValueThenIncrement() {
			final Number result = makeValue();
			value = value.add( BigInteger.ONE );
			return result;
		}

		public Number makeValueThenAdd(long addend) {
			final Number result = makeValue();
			value = value.add( BigInteger.valueOf( addend ) );
			return result;
		}

		@Override
        public String toString() {
			return "StringHolder[" + value + "]";
		}

		@Override
        public boolean equals(Object o) {
			if ( this == o ) {
				return true;
			}
			if ( o == null || getClass() != o.getClass() ) {
				return false;
			}

			StringHolder that = (StringHolder) o;

			return this.value == null
					? that.value == null
					: value.equals( that.value );
		}

		@Override
        public int hashCode() {
			return value != null ? value.hashCode() : 0;
		}
	}
	 */
	 

}
