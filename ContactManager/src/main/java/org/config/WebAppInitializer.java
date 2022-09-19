package org.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

// This replaces the web.xml
// Registering the SpringMvcConfig.java as the Dispacher Servlet

public class WebAppInitializer implements WebApplicationInitializer
{

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException
    {
        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.register(SpringMvcConfig.class); // Registering the class as Dispacher servlet

        ServletRegistration.Dynamic dispacher = servletContext.addServlet("SpringDispacher", new DispatcherServlet(appContext));
        dispacher.setLoadOnStartup(1); // <load-on-startup> the ds should load when the server starts and not when the first request is sent to the server
        dispacher.addMapping("/"); // <servlet-mapping>

    }
}
