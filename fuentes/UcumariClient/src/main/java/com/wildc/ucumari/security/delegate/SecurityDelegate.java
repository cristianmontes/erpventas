/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.security.delegate;

import com.wildc.ucumari.security.model.UserLogin;
import java.io.StringWriter;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.springframework.beans.factory.annotation.Autowired;
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

    
    /*private final String urlConsultas = AppResources.getInstance().get(Constantes.URL_BASE) + 
            AppResources.getInstance().get(Constantes.URL_CONTEXTO) +
            AppResources.getInstance().get(Constantes.URL_CONTEXTO_SEGURIDAD);*/
    
    private String urlConsultas = "http://localhost:8082/UcumariServer/services/security/";
    
    public UserLogin login(UserLogin userLogin) throws Exception{
        /*
        RestTemplate restTemplate = new RestTemplate();
        //Create a list for the message converters
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        //Add the Jackson Message converter
        messageConverters.add(new MappingJacksonHttpMessageConverter());
        //Add the message converters to the restTemplate
        restTemplate.setMessageConverters(messageConverters); */
        // Create a new RestTemplate instance
        //RestTemplate restTemplate = new RestTemplate();

        // Add the Jackson and String message converters
        /*
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        */

        //HttpHeaders headers = new HttpHeaders();
        //headers.setContentType(MediaType.APPLICATION_JSON);
        //HttpEntity<String> entity = new HttpEntity<String>(requestJson,headers);
        //headers.setContentType(new MediaType("application","json"));
        /*HttpEntity<UserLogin> requestEntity = new HttpEntity<UserLogin>(userLogin, headers);
        
        String strUser = "{\"userLoginId\":\"admin\",\"currentPassword\":\"a8c323ed5c6d3c9b5ba5fa13e75939de954de085\",\"partyCompanyId\":\"Company\"}";
        System.out.println(strUser);*/
        //restTemplate.exchange(urlConsultas+"login", HttpMethod.POST, requestEntity, UserLogin.class);
        return (UserLogin) restTemplate.postForObject(urlConsultas+"login",userLogin, UserLogin.class);
        
        /*
        HttpPost postRequest = new HttpPost(urlConsultas+"login");
        postRequest.addHeader("content-type", "application/json");
        
        StringWriter writer = new StringWriter();
        writer.append("{\"userLoginId\":\"admin\",\"currentPassword\":\"a8c323ed5c6d3c9b5ba5fa13e75939de954de085\",\"partyCompanyId\":\"Company\"}");        
        StringEntity userEntity = new StringEntity(writer.getBuffer().toString());
        postRequest.setEntity(userEntity);
        
        HttpClient httpClient = new DefaultHttpClient();
        HttpContext localContext = new BasicHttpContext();        
        HttpResponse response = httpClient.execute(postRequest, localContext);
        
        return null;*/
    }
}
