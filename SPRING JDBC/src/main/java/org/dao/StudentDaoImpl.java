package org.dao;

import org.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao
{
    public JdbcTemplate jdbcTemplate;

    // The setter has the JdbcTemplate object through setter injection
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {

        //insert  query
        //String query="insert into student1(id,name,rollNo,courses) values (?,?,?,?)";

        //fire query
        //int result = this.jdbcTemplate.update(query,123,"Hrithik",124,"jdbc");

        String query="insert into student1(id,name,rollNo,courses) values (?,?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getRollNo(),student.getCourse());
        return r;
    }

    @Override
    public int update(Student student)
    {
        String query = "update student1 set name=? , rollNo=? , courses=? where id=?";
        // We can directly use return ....instead of putting into another variable
        return this.jdbcTemplate.update(query,student.getName(),student.getRollNo(),student.getCourse(),student.getId());
    }

    @Override
    public int delete(Student student) {
        String query = "delete from student1 where name=?";
        int r = this.jdbcTemplate.update(query,student.getName());
        return r;
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "select * from student1";
        List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl()); //  Result Set is made into a student object
        return students; // In this 1 object we have many values
    }

    @Override
    public Student getStudent(int studentId) {
        String query = "select * from student1 where id=?";

        // Creating object of RowMapper class to access it
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student student = this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
        return student;
    }


}
