/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.security.delegate;

import com.wildc.ucumari.security.model.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Cristian
 */
@Service("securityDelegate")
public class SecurityDelegate {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${url.base}")
    private String urlBase;
    @Value("${url.contexto.seguridad}")
    private String urlSecurityRelativo;
    
    
    public UserLogin login(UserLogin userLogin) throws Exception{
        
        return (UserLogin) restTemplate.postForObject(urlBase+urlSecurityRelativo+"login",userLogin, UserLogin.class);        
    }
}
