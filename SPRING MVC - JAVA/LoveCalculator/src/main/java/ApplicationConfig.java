import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Properties;
import java.util.logging.Logger;

// VIEW RESOLVER
// This file is the java version of application-config.xml (aka view resolver)

@EnableWebMvc
@Configuration
@ComponentScan({"DAO","Controllers"})
@PropertySource("classpath:email.properties")
public class ApplicationConfig implements WebMvcConfigurer {

    @Autowired
    private Environment env; // For fetching data from the .properties file

    Logger logger = Logger.getLogger(ApplicationConfig.class.getName()); // For printing things in log rather than using sout

    @Bean
    InternalResourceViewResolver viewResolver()
    {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    // --------------------------------------------------------------------------------------------------

    // This is to link the properties file to get the dynamic error message
    @Bean
    public MessageSource messageSource(){

        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");

        return messageSource;
    }

    @Bean
    public LocalValidatorFactoryBean validator(){

        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.setValidationMessageSource(messageSource());

        return localValidatorFactoryBean;
    }

    @Override
    public Validator getValidator(){
        return validator();
    }

    // ------------------------------------------------------------------------------------------------
    // This sends an email
    @Bean
    public JavaMailSender getJavaMailSender(){

        logger.info("Fetching host value"+env.getProperty("mail.host"));

        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(env.getProperty("mail.host"));
        mailSender.setUsername(env.getProperty("mail.username"));
        mailSender.setPassword(env.getProperty("mail.password"));
        mailSender.setPort(getIntProperty("mail.port"));
        mailSender.setJavaMailProperties(getMailProperties());
        return mailSender;
    }

    // Function to return property class
    private Properties getMailProperties() {
        Properties mailProperties = new Properties();
        mailProperties.put("mail.smtp.starttls.enable",true);
        mailProperties.put("mail.smtp.ssl.trust","smtp.gmail.com");
        return mailProperties;
    }

    // Function to convert String to int
    int getIntProperty(String key){
        String s = env.getProperty(key);
        return Integer.parseInt(s);
    }

    // ------------------------------------------------------------------------------------------------

    // This is to activate the Formatter class that converts a string to a phone object
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new PhoneNumberFormatter());
    }

    // ------------------------------------------------------------------------------------------------


}
