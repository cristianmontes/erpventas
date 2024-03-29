/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.delegate;

import com.wildc.ucumari.party.model.Person;
import com.wildc.ucumari.security.model.UserLogin;
import com.wildc.ucumari.server.framework.to.BResult;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Cristian
 */
@Service("partyDelegate")
public class PartyDelegate {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${url.base}")
    private String urlBase;
    @Value("${url.contexto.party}")
    private String urlPartyRelativo;
    //private String urlConsultas = "http://localhost:8082/ucumari-server/services/person/";
    
    public List<Person> findWorkers() throws Exception{
        //Person[] list = restTemplate.postForObject(urlConsultas+"find/workers", Person[].class,"sss");
        
        Person[] list = restTemplate.postForObject(urlBase+urlPartyRelativo+"find/workers", "", Person[].class);
	return Arrays.asList(list);        
    }
    
    public void saveNewWorker(UserLogin userLogin){
        //Person[] list = restTemplate.postForObject(urlConsultas+"find/workers", Person[].class,"sss");
        
        BResult bResult = restTemplate.postForObject(urlBase+urlPartyRelativo+"save/worker", userLogin, BResult.class);
	//return Arrays.asList(list);        
    }
}
