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
	
	public static void main(String args[]){
		System.out.println(Successful.NO.getCode());
		System.out.println(Successful.YES.getCode());
	}
	
	

}
