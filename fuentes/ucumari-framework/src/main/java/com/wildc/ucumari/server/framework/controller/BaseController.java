/**
 * 
 */
package com.wildc.ucumari.server.framework.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.wildc.ucumari.core.config.WebServletContextListener;

/**
 * @author Cristian
 *
 */


@Component
public class BaseController {
	
	/*@Autowired
	private static HttpServletRequest request;*/
	
	/*@Autowired
	private ApplicationContext appContext;*/
	
	private String seed = "13245";

	
	public String getSeed() {
		return seed;
	}

	public void setSeed(String seed) {
		this.seed = seed;
	}

	/*
	public static HttpServletRequest getRequest() {		
		return (HttpServletRequest) WebServletContextListener.getApplicationContext().getBean("request");
				
	}*/
		
		
	

}
