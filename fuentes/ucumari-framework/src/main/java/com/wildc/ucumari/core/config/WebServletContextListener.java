/**
 * 
 */
package com.wildc.ucumari.core.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @author Cristian
 *
 */
public class WebServletContextListener implements ServletContextListener{

	private static WebApplicationContext springContext;
    

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        springContext = null;
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        springContext = WebApplicationContextUtils.getWebApplicationContext(servletContextEvent.getServletContext());
                
    }

    public static ApplicationContext getApplicationContext() {
        return springContext;
    }

}
