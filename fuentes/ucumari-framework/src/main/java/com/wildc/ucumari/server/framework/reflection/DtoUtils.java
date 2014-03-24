/**
 * 
 */
package com.wildc.ucumari.server.framework.reflection;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.FatalBeanException;
//import org.ucumari.administracion.model.to.TablatablaTO;

import com.wildc.ucumari.server.framework.dto.BaseDtoPersistent;
import com.wildc.ucumari.server.framework.to.BaseTO;

/**
 * @author cmontes
 *
 */
public class DtoUtils extends BeanUtils {
	private static final Log logger = LogFactory.getLog(DtoUtils.class);
	
	private static String SEPARADOR_PROPERTIES_PUNTO = ".";
	
	public static void setProperty(Object target, String propertyname, Object value){
		try{
			if(propertyname.indexOf(SEPARADOR_PROPERTIES_PUNTO) != -1){
				PropertyDescriptor targetPd = getPropertyDescriptor(target.getClass(), propertyname.substring(0,propertyname.indexOf(SEPARADOR_PROPERTIES_PUNTO)));
				Method readMethod = targetPd.getReadMethod();
				Object subValue = readMethod.invoke(target);
				if(subValue == null){
					subValue = targetPd.getPropertyType().newInstance();
					Method writeMethod = targetPd.getWriteMethod();
					writeMethod.invoke(target, subValue);
				}
				setProperty(subValue, propertyname.substring(propertyname.indexOf(SEPARADOR_PROPERTIES_PUNTO)+1), value);
				
			}else{
				PropertyDescriptor targetPd = getPropertyDescriptor(target.getClass(), propertyname);
				Method writeMethod = targetPd.getWriteMethod();
				writeMethod.invoke(target, value);
			}
		}catch(Exception e){
			logger.error(e.getMessage());
			throw new FatalBeanException("Could not set property to target", e);
		}
	}
	
	public static Object getProperty(Object source, String propertyname){
		try{
			if(propertyname.indexOf(SEPARADOR_PROPERTIES_PUNTO) != -1){
				PropertyDescriptor targetPd = getPropertyDescriptor(source.getClass(), propertyname.substring(0,propertyname.indexOf(SEPARADOR_PROPERTIES_PUNTO)));
				Method readMethod = targetPd.getReadMethod();
				Object subValue = readMethod.invoke(source);
				if(subValue == null){
					return null;
				}
				return getProperty(subValue, propertyname.substring(propertyname.indexOf(SEPARADOR_PROPERTIES_PUNTO)+1));
				
			}else{
				PropertyDescriptor targetPd = getPropertyDescriptor(source.getClass(), propertyname);
				Method readMethod = targetPd.getReadMethod();
				return readMethod.invoke(source);
			}
		}catch(Exception e){
			logger.error(e.getMessage());
			throw new FatalBeanException("Could not set property to target", e);
		}		
	}
	
	public static <T> T copyProperties(Object source, Class<T> clazz)//{
			throws BeansException, InstantiationException, IllegalAccessException {

		//Assert.notNull(source, "Source must not be null");
		if(source == null) return null;

		Class<T> actualEditable = clazz;
		T target = clazz.newInstance();
		PropertyDescriptor[] targetPds = (PropertyDescriptor[]) getPropertyDescriptors(actualEditable);
		
		for (PropertyDescriptor targetPd : targetPds) {
			if (targetPd.getWriteMethod() != null) {
				PropertyDescriptor sourcePd = getPropertyDescriptor(source.getClass(), targetPd.getName());
				if (sourcePd != null && sourcePd.getReadMethod() != null) {
					try {
						Method readMethod = sourcePd.getReadMethod();
						if (!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
							readMethod.setAccessible(true);
						}
						Object value = readMethod.invoke(source);
						Method writeMethod = targetPd.getWriteMethod();
						if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
							writeMethod.setAccessible(true);
						}
						if(value instanceof BaseTO || value instanceof BaseDtoPersistent){						
							//copyProperties(value,targetPd.getClass());
							writeMethod.invoke(target, copyProperties(value,targetPd.getPropertyType()));
						}else if(value instanceof Collection){
							//System.out.println("es una lista no se carga");
							/*
							for (Iterator<?> iterator = ((Collection<?>) value).iterator(); iterator
									.hasNext();) {
								//type type = (type) iterator.next();
								writeMethod.invoke(target, copyProperties(iterator.next(),Object.class));								
							}*/							
						}else{
							writeMethod.invoke(target, value);
						}
					}
					catch (Throwable ex) {
						logger.error(ex.getMessage());
						throw new FatalBeanException("Could not copy properties from source to target", ex);
					}
				}
			}
		}
		return target;
	}
	
	public static void copyPropertiesWithoutNewInstace(Object source, Object target)//{
		throws BeansException, InstantiationException, IllegalAccessException {

		//Assert.notNull(source, "Source must not be null");
		//if(source == null) return null;
		
		//Class<T> actualEditable = clazz;
		//T target = clazz.newInstance();
		PropertyDescriptor[] targetPds = (PropertyDescriptor[]) getPropertyDescriptors(target.getClass());
		
		for (PropertyDescriptor targetPd : targetPds) {
			if (targetPd.getWriteMethod() != null) {
				PropertyDescriptor sourcePd = getPropertyDescriptor(source.getClass(), targetPd.getName());
				if (sourcePd != null && sourcePd.getReadMethod() != null) {
					try {
						Method readMethod = sourcePd.getReadMethod();
						if (!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
							readMethod.setAccessible(true);
						}
						Object value = readMethod.invoke(source);
						Method writeMethod = targetPd.getWriteMethod();
						if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
							writeMethod.setAccessible(true);
						}
						if(value instanceof BaseTO || value instanceof BaseDtoPersistent){						
							//copyProperties(value,targetPd.getClass());
							writeMethod.invoke(target, copyProperties(value,targetPd.getPropertyType()));
						}else if(value instanceof Collection){
							//System.out.println("es una lista no se carga");
							/*
							for (Iterator<?> iterator = ((Collection<?>) value).iterator(); iterator
									.hasNext();) {
								//type type = (type) iterator.next();
								writeMethod.invoke(target, copyProperties(iterator.next(),Object.class));								
							}*/							
						}else{
							
							if(!readMethod.getReturnType().equals(Collection.class)
									&&!readMethod.getReturnType().equals(List.class)
									&&!readMethod.getReturnType().equals(Set.class)){
								System.out.println(readMethod.getReturnType());
								writeMethod.invoke(target, value);
							}
						}
					}
					catch (Throwable ex) {
						logger.error(ex.getMessage());
						throw new FatalBeanException("Could not copy properties from source to target", ex);
					}
				}
			}
		}
		//return target;
	}
	
	public static <T> List<T> copyPropertiesList(List<?> source, Class<T> clazz)
		throws BeansException, InstantiationException, IllegalAccessException {
		
		//Assert.notNull(source, "Source must not be null");	
		if(source == null) return null;
		
		List<T> target = new ArrayList<T>();		
		
		for (Object object : source) {
			target.add(DtoUtils.copyProperties(object, clazz));
		}				
		return target;
	}
	
	public static <T> Map<Object,T> converListToMap(List<T> source, String propertynamekey)
		throws BeansException, InstantiationException, IllegalAccessException {
		
		if(source == null) return null;
		Map<Object, T> mapTarget = new HashMap<Object, T>();
		
		for (int i = 0; i < source.size(); i++) {
			if(source.get(i)!= null)
				mapTarget.put(
						DtoUtils.getProperty(source.get(i), propertynamekey),
						source.get(i));
		}			
		return mapTarget;
	}
	
	
	public static void main(String args[]){
		String strvalor = "asdfasf.sss.zdfffdff";
		System.out.println(strvalor.indexOf("."));
		System.out.println(strvalor.substring(strvalor.indexOf(".")+1));
		System.out.println(strvalor.substring(0,strvalor.indexOf(".")));
		
		//try {
			//TablatablaTO nopcion = DtoUtils.copyProperties(tablatabla, TablatablaTO.class);
			//System.out.println(nopcion.getCodigo());
			/*
			TablatablaTO tablatabla = new TablatablaTO();			
			setProperty(tablatabla, "tabla.descripcionCorta", "0005");
			setProperty(tablatabla, "tabla.codigo", "009");
			setProperty(tablatabla, "codigo", "0091");
			System.out.println(tablatabla.getCodigo());
			System.out.println(tablatabla.getTabla().getDescripcionCorta());
			*/
			/*
			Opcion nopcion2 = DtoUtils.copyProperties(nopcion, Opcion.class);
			System.out.println(nopcion2.getCodigo());*/
			/*
		} catch (BeansException e) {			
			e.printStackTrace();*/
		/*} catch (InstantiationException e) {			
			e.printStackTrace();*/
		//}		
	}

}
