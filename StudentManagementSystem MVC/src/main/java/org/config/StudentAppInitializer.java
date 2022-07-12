package org.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


// ----------------------------------- Replaces web.xml -----------------------------------------

public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        Class[] configFiles = {StudentAppConfig.class};
        return configFiles;
    }

    @Override
    protected String[] getServletMappings()
    {
        // We take a string array coz many urls get added one by one in the array
        String[] mappings = {"/"}; // This means go ahead and handle every url
        return mappings;
    }
}
