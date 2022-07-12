package org.controller;

import org.dao.StudentDAO;
import org.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StudentController
{
    @Autowired
    private StudentDAO StudentDAO;


    // Get mapping is directly used instead of RequestMapping when the method is GET
    // This displays the details of the student
    @GetMapping("/showStudent")
    public String showStudentList(Model m)
    {
        List<Student> studentList = StudentDAO.loadStudents();
        m.addAttribute("students",studentList);

        return "student_list";
    }
}
