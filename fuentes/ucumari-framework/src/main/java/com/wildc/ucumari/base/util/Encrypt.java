/**
 * 
 */
package com.wildc.ucumari.base.util;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import com.sun.org.apache.xml.internal.security.utils.Base64;

/**
 * @author Cristian
 *
 */
public class Encrypt {
	private static String charsetName = "UTF8";
    private static String algorithm = "DES";
    private static int base64Mode = Base64.BASE64DEFAULTLENGTH;
	
	public static String encrypt(String key, String data) {
        if (key == null || data == null)
            return null;
        try {
        	return key + data;
            
        } catch (Exception e) {
            return null;
        }
    }

    public static String decrypt(String key, String data) {
        if (key == null || data == null)
            return null;
        try {
        	return data.replaceAll(key, "");
            
        } catch (Exception e) {
            return null;
        }
    }
    
    public static void main(String [] args){
    	System.out.println(encrypt("llave", "{klaka;ss,,ss}"));
    	System.out.println(decrypt("llave", "llave{klaka;ss,,ss}"));
    	
    }

}
