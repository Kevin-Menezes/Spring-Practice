//package org.dao;
//
//import org.entities.Contact;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.fail;
//
//public class ContactDAOTest
//{
//    private DriverManagerDataSource dataSource;
//    private ContactDAO dao;
//
//    @BeforeEach
//    void setupBeforeEach()
//    {
//        dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
//        dataSource.setUsername("root");
//        dataSource.setPassword("password");
//
//        dao = new ContactDAOImpl(dataSource);
//    }
//
//
//    @Test
//    void testSave()
//    {
//        Contact contact = new Contact("Kevin","niv7@gmail.com","Vikhroli","9384758697");
//        int result = dao.save(contact);
//
//        assertTrue(result>0,"Save done");
//    }
//
//    @Test
//    void testUpdate()
//    {
//        Contact contact = new Contact("Kevin","niv7@gmail.com","Vikhroli","9384758697");
//        int result = dao.update(contact);
//
//        assertTrue(result>0,"Update done");
//    }
//
//    @Test
//    void testGet()
//    {
//        Integer id = 0;
//        Contact contact = dao.get(id);
//
//        if(contact!=null)
//        {
//            System.out.println(contact);
//        }
//
//        assertNotNull(contact);
//    }
//
//
//    @Test
//    void testDelete()
//    {
//        Integer id = 2;
//        int result = dao.delete(id);
//
//        assertTrue(result>0);
//    }
//
//    @Test
//    void testList()
//    {
//        List<Contact> listContacts = dao.list();
//
//        for(Contact a:listContacts)
//        {
//            System.out.println(a);
//        }
//
//        assertTrue(!listContacts.isEmpty());
//    }
//
//
//}
