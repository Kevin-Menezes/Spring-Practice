package org;

import org.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class App
{

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        //JdbcTemplate template = context.getBean("JdbcTemplate", JdbcTemplate.class);

        //insert  query
        //String query="insert into student1(id,name,rollNo,courses) values (?,?,?,?)";

        //fire query
        //int result = template.update(query,123,"Hrithik",124,"jdbc");

        //insert
//        Student student = new Student();
//        student.setId(122);
//        student.setName("H");
//        student.setRollNo(34);
//        student.setCourse("SpringJdbc");
//
//        int result = studentDao.insert(student);
//
//        System.out.println("Insert: " +result);


        //update
//        Student student1 = new Student();
//        student1.setId(122);
//        student1.setName("K");
//        student1.setRollNo(54);
//        student1.setCourse("C++");
//        int result1 = studentDao.update(student1);
//        System.out.println("Update: " +result1);

        //delete
//        Student student2 = new Student();
//        student2.setName("K");
//        int result2 = studentDao.delete(student2);
//        System.out.println("Delete: " +result2);

        // select 1 row
//        Student student = studentDao.getStudent(123);
//        System.out.println(student);

        // The above part is for doing directly ...without using the DAO class
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        // inserting 1 row
        Student student = (Student) context.getBean("Student");
        student.setId(201);
        student.setName("Rohit");
        student.setRollNo(30);
        student.setCourse("Ruby");
        int r = studentDao.insert(student);
        System.out.println("Row inserted = "+r);

        // select all rows
        List<Student> student1 = studentDao.getAllStudents();
        for(Student s : student1)
        {
            System.out.println(s);
        }



    }
}
