package org.config;

import org.dao.ContactDAO;
import org.dao.ContactDAOImpl;
import org.entities.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

// This is the View Resolver ( replaces -servlet.xml)
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.controller") // This is the path to the front controller
public class SpringMvcConfig implements WebMvcConfigurer
{
    @Bean
    public DataSource getDataSource() // getDataSource becomes the name of the bean
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        return dataSource;
    }

    @Bean
    public ViewResolver getViewResolver()
    {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public ContactDAO getContactDAO()
    {
        return new ContactDAOImpl(getDataSource());
    } // This returns the implementation along with the db connection




}
