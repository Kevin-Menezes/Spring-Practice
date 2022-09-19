import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// Web.xml
// Here Spring takes control and automatically links the ds for us
// This class internally implements the WebApplicationInitializer
// This is the shortest and best way to setup any application initializer
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() { // Implement methods and don't do anything to this method
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        Class[] arr = {ApplicationConfig.class}; // Link View Resolver
        return arr;

    }

    @Override
    protected String[] getServletMappings() {

        String[] arr = {"/"}; // Put <servlet-mapping>
        return arr;
    }
}
