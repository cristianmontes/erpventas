/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameter.delegate;

import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.party.model.Person;
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
@Service("parameterDelegate")
public class ParameterDelegate {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${url.base}")
    private String urlBase;
    @Value("${url.contexto.parameter}")
    private String urlParameterRelativo;
    
    
    public List<RoleType> findByParentType(RoleType roleType){
        //Person[] list = restTemplate.postForObject(urlConsultas+"find/workers", Person[].class,"sss");
        
        RoleType[] list = restTemplate.postForObject(urlBase+urlParameterRelativo+"findByParentTypeId", roleType, RoleType[].class);
	return Arrays.asList(list);        
    }
    
    
}
