/**
 * 
 */
package com.wildc.ucumari.base.util;


/**
 * @author Cristian
 *
 */
public class Constantes {
	
	public static enum Successful {
		YES('Y'),
		NO('N');
		
		private char value;
		
		Successful(char value){
			this.value = value;			
		}		
		//@Override
		public char getCode() {		       
		  return value;
		}		
    }
	
	public static enum TaskStatus {
		OK("OK"),
		ERROR("ERROR");
		
		private String value;
		
		TaskStatus(String value){
			this.value = value;			
		}		
		//@Override
		public String getCode() {		       
		  return value;
		}		
    }
	
	public static void main(String args[]){
		System.out.println(StatusItem.PARTY_DISABLED.getCode());
		System.out.println(StatusItem.PARTY_ENABLED.getCode());
	}
	
	
	public static enum StatusItem {
		PARTY_DISABLED("PARTY_DISABLED"),
		PARTY_ENABLED("PARTY_ENABLED");
		
		private String value;
		
		StatusItem(String value){
			this.value = value;			
		}		
		//@Override
		public String getCode() {
		  return value;
		}		
    }
	
	public static enum PartyType {
		PERSON("PERSON"),
		PARTY_GROUP("PARTY_GROUP");
		
		private String value;
		
		PartyType(String value){
			this.value = value;			
		}		
		//@Override
		public String getCode() {
		  return value;
		}		
    }
	
	public static enum RoleType {
		EMPLOYEE("EMPLOYEE"),
		ADMIN("ADMIN"),
		NA("_NA_");
		
		private String value;
		
		RoleType(String value){
			this.value = value;			
		}		
		//@Override
		public String getCode() {
		  return value;
		}		
    }
	
	public static enum PartyRelationshipType {
		EMPLOYMENT("EMPLOYMENT");
		
		private String value;
		
		PartyRelationshipType(String value){
			this.value = value;			
		}		
		//@Override
		public String getCode() {
		  return value;
		}		
    }
	

}
