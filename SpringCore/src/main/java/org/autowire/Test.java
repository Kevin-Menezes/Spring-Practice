package org.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutowireConfig.xml");
        Employee e = context.getBean("e1",Employee.class);
        System.out.println(e);
    }
}
