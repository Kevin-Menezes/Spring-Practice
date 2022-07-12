package org.cars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("CarsConfig.xml");

        Cars car1 = (Cars) context.getBean("c1");
        Cars car2 = (Cars) context.getBean("c2");
        Cars car3 = (Cars) context.getBean("c3");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}

