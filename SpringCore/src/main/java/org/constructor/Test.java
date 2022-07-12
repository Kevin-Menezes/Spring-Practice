package org.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("MobileConfig.xml");

        Mobile m1 = (Mobile) context.getBean("m1");
        System.out.println(m1);
        System.out.println(" ");

        Mobile m2 = (Mobile) context.getBean("m2");
        System.out.println(m2);
        System.out.println(" ");

        Mobile m3 = (Mobile) context.getBean("m3");
        System.out.println(m3);
        System.out.println(" ");
    }

}
