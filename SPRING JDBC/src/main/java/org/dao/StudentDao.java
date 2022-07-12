package org.dao;

import org.Student;

import java.util.List;

public interface StudentDao
{
    public int insert(Student student);

    public int update(Student student);

    public int delete(Student student);

    public List<Student> getAllStudents();

    public Student getStudent(int studentId);





}
