package org.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); // Give the file path and name where u have written the beans

        Student s1 = (Student) context.getBean("student1"); // bean 1
        Student s2 = context.getBean("student2",Student.class); // bean 2
        Student s3 = (Student) context.getBean("student3"); // bean 3

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
