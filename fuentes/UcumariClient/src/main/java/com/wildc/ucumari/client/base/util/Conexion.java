/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.base.util;

import com.wildc.ucumari.party.delegate.PartyDelegate;
import com.wildc.ucumari.security.delegate.SecurityDelegate;
import com.wildc.ucumari.security.model.UserLogin;
import org.hibernate.SessionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Administrador de conexiones hacia el servidor Central,usar el patron singleton
 * por sus caracteristicas.
 * @author cmontes
 */
public class Conexion{
    private static ApplicationContext conn = null;
    private static String session = null;
    private static UserLogin userLogin = null;

    public static UserLogin getUserSession() {
        return userLogin;
    }

    public static void setUserSession(UserLogin aUserLogin) {
        userLogin = aUserLogin;
    }
    
    private Conexion(){
          conn = new ClassPathXmlApplicationContext("com/wildc/ucumari/resources/properties/ucumari-client.xml");          
          session = "102";
    }

    public static ApplicationContext getInstance(){        
        if(conn == null){
            new Conexion();
        }
        return conn;
    }
    
    public static SecurityDelegate getSecurityDelegate()/* throws SessionException*/{    
        //getInstance();
        //if(session == null || session.equalsIgnoreCase("")) throw new SessionException("No hay session");
        return (SecurityDelegate) getInstance().getBean("securityDelegate");
    }
    
    public static PartyDelegate getPartyDelegate(){            
        
        return (PartyDelegate) getInstance().getBean("partyDelegate");
    }
    
   
}