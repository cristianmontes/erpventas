package com.wildc.ucumari.security;

import java.io.CharArrayWriter;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Servlet Filter implementation class UcumariFilter
 */
public class UcumariInterceptor implements HandlerInterceptor {

    /**
     * Default constructor. 
     */
    public UcumariInterceptor() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception exception)
			throws Exception {
		
		System.out.println("After completion handle");
		
		PrintWriter out = response.getWriter();
		
		CharResponseWrapper wrapper = new CharResponseWrapper(
				   (HttpServletResponse)response);
		
		CharArrayWriter caw = new CharArrayWriter();
		caw.write(wrapper.toString().substring(0,
				wrapper.toString().indexOf("</body>")-1));
		caw.write("<p>\nYou are visitor number <font color='red'>" + "blaaaaaaaaa" + "</font>");
		caw.write("\n</body></html>");
		response.setContentLength(caw.toString().length());
		out.write(caw.toString());
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView) throws Exception {
				
		System.out.println("Post-handle");
		
		
		   
		   
		//response.getOutputStream().print("agregado en el interceptor");
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
				
		System.out.println("Pre-handle");
		System.out.println("request parameters" + request.getParameterMap());
		System.out.println("request attributes" + request.getAttributeNames().toString());
		
		return true;
	}	

}
