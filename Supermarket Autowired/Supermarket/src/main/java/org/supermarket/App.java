package org.supermarket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.supermarket.entities.Customer;
import org.supermarket.entities.Items;

public class App {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Customer customer = (Customer) context.getBean("Customer");
        System.out.println(customer);
//        Items items = (Items) context.getBean("Items");
//        Items items2 = context.getBean("Items2",Items.class);


    }
}
