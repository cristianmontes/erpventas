package com.wildc.ucumari.security;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class UcumariFilter
 */
public class SecurityFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SecurityFilter() {
        // TODO Auto-generated constructor stub
    }

    protected FilterConfig config;

    public void init(FilterConfig config) throws ServletException {
      this.config = config;
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws ServletException, IOException {
    	
    	String session = ((HttpServletRequest)request).getHeader("session");
    	String canal = ((HttpServletRequest)request).getHeader("canal");
    	String iprequest = ((HttpServletRequest)request).getHeader("ip");
    	String ipremota = request.getRemoteAddr();
    	
    	System.out.println("validando los headers "  + session +" " + canal + " " + iprequest + " " +ipremota);
    	if(validateHeaders(session, canal)){
    	chain.doFilter(request, response);
    	}else{
    		return;
    	}
    	
    	
    	
    	
    }
    
    public boolean validateHeaders(String session, String canal){
    	//Aca se realiza la valiacion para inteceptar
    	
    	return true;
    }
}
