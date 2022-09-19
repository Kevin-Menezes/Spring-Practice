import Converters.CreditCardConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// VIEW RESOLVER
// This file is the java version of application-config.xml (aka view resolver)

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "Controllers")
public class ApplicationConfig implements WebMvcConfigurer {

    @Bean
    InternalResourceViewResolver viewResolver()
    {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    // This is to activate the Converter class that converts a string to a CreditCard object
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new CreditCardConverter());
    }

}
