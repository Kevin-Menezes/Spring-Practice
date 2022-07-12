package org.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ProductConfig.xml");

        // Calling for Noodles
        Product p1 = context.getBean("p1", Product.class);
        System.out.println("Noodles Menu : "+p1);
        System.out.println(" ");

        // Calling for Chicken
        Product p2 = context.getBean("p2",Product.class);
        System.out.println("Chicken Menu : "+p2);

       // Original way of calling classes
//        Product product = new Product();
//        product.setProductName("Pizza");
//        System.out.println(product);
    }

}
