/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.util;

import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author cmontes
 */
public class AppBundle {
    
    private static AppBundle appBundle = null;
    //private ResourceBundle mapresource = null;
    private Properties mapresource;
    private AppBundle(){        
        //mapresource = ResourceBundle.getBundle(Constantes.FILE_APP_CONTEXT);
        try{
            InputStream is = AppBundle.class.getResourceAsStream(Constantes.FILE_APP_CONTEXT);
            mapresource.load(is);
            is.close();
        }catch(Exception e){
            throw new NullPointerException("Los parámetros del contexto aun no se inicializaron");
        }
    }
    
    public static AppBundle getInstance(){
        if(appBundle == null){
            appBundle = new AppBundle();
        }
        return appBundle;
    }
    
    public String get(String key){
        if(mapresource == null){
            throw new NullPointerException("Los parámetros del contexto aun no se inicializaron");
        }
        return mapresource.getProperty(key);
    }

}
