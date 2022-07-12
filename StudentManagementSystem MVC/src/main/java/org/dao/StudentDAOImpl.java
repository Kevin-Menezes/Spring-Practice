package org.dao;

import org.entities.Student;
import org.mapper.StudentRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // This automatically creates the object of this StudentDAOImpl class and sends it automatically whenever @Autowired is used
public class StudentDAOImpl implements StudentDAO
{
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> loadStudents()
    {
        String sql = "SELECT * FROM students";

         List<Student> studentList = jdbcTemplate.query(sql,new StudentRowMapper());

        return studentList;
    }
}
