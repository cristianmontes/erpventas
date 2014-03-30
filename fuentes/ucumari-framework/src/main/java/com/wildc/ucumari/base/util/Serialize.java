/**
 * 
 */
package com.wildc.ucumari.base.util;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author Cristian
 *
 */
public class Serialize {

	private static ObjectMapper mapper = new ObjectMapper();
	/**
	 * 
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String serialize(Object object){
		try {
			return mapper.writeValueAsString(object);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}
		return "";
	}
	
	public static String deserialize(String string, Class clazz){
		try {
			return null;//mapper.readValue(string, clazz);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}
		return "";
	}

}
