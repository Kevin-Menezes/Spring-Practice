import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

// Whichever class implements WebApplicationInitializer -> it becomes a replacement for web.xml
public class ApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {

        XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
        webApplicationContext.setConfigLocation("classpath:application-config.xml");

        DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext); // Putting the webApplicationContext object inside the constructor of DispatcherServlet
        ServletRegistration.Dynamic myCustomDispatcherServlet= servletContext.addServlet("myDispatcherServlet",dispatcherServlet); // Register dispatcher servlet with servlet context

        myCustomDispatcherServlet.setLoadOnStartup(1);
        myCustomDispatcherServlet.addMapping("/mywebsite.com/*");

    }
}