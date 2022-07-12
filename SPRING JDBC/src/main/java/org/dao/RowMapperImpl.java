package org.dao;

// Row mapper is an interface that helps to convert result set into an object of that class

import org.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Student> { // Implementing the RowMapper class


    @Override
    public Student mapRow(ResultSet rs, int id) throws SQLException { // Defining the mapRow function that was declared in RowMapper class....mapRow has 2 arguments -> ResultSet and an Integer

        Student student = new Student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setRollNo((rs.getInt(3)));
        student.setCourse(rs.getString(4));
        return student;



    }
}
