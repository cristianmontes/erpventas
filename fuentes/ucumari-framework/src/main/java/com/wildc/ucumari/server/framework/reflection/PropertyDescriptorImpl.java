/**
 * 
 */
package com.wildc.ucumari.server.framework.reflection;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @author cmontes
 *
 */
public class PropertyDescriptorImpl extends PropertyDescriptor {

	/**
	 * @param propertyName
	 * @param beanClass
	 * @throws IntrospectionException
	 */
	public PropertyDescriptorImpl(String propertyName, Class<?> beanClass)
			throws IntrospectionException {
		super(propertyName, beanClass);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param propertyName
	 * @param readMethod
	 * @param writeMethod
	 * @throws IntrospectionException
	 */
	public PropertyDescriptorImpl(String propertyName, Method readMethod,
			Method writeMethod) throws IntrospectionException {
		super(propertyName, readMethod, writeMethod);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param propertyName
	 * @param beanClass
	 * @param readMethodName
	 * @param writeMethodName
	 * @throws IntrospectionException
	 */
	public PropertyDescriptorImpl(String propertyName, Class<?> beanClass,
			String readMethodName, String writeMethodName)
			throws IntrospectionException {
		super(propertyName, beanClass, readMethodName, writeMethodName);
		// TODO Auto-generated constructor stub
	}
	
	

}
