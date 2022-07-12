package org.dao;

import org.entities.Student;

import java.util.List;

public interface StudentDAO
{
    List<Student> loadStudents();
}
