package org.mapper;

import org.entities.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

// Rowmapper converts a result set into an object
public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int i) throws SQLException {

        Student s = new Student();
        s.setId(rs.getInt(1));
        s.setName(rs.getString(2));
        s.setMobile(rs.getLong(3));
        s.setCountry(rs.getString(4));


        return s;
    }
}
