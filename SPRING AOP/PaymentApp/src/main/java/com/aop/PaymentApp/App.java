package com.aop.PaymentApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/PaymentApp/config.xml");
        PaymentService pService = context.getBean("payment",PaymentService.class);
        pService.makePayment(200);
   
    }
}
