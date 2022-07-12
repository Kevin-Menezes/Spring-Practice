package org.springMVC.controller;

import org.springMVC.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletContext;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Controller
public class HomeController
{

    @Autowired
    ServletContext context;

    // Both home and add go to the same page
    @RequestMapping(path = "/home")
    public String home(Model m)
    {
        m.addAttribute("page","home");

        List<Todo> list = (List<Todo>) context.getAttribute("list");
        m.addAttribute("todoslist",list);

        return "home";
    }

    @RequestMapping(path = "/add")
    public String addTodo(Model m)
    {
        Todo t = new Todo();
        m.addAttribute("page","add");
        m.addAttribute("todo",t);

        return "home";
    }

    // This is to get values from the form
    // By default it is GET .... Hence we have to mention here post
    @RequestMapping(value = "/saveTodo",method = RequestMethod.POST)
    public String saveTodo(@ModelAttribute Todo t , Model m)
    {
        // Setting current date
        t.setTodoDate(new Date());
        System.out.println("OBJECT : "+t);

        /* Get the list from context */
        List<Todo> list = (List<Todo>) context.getAttribute("list");
        list.add(t);
        m.addAttribute("msg","Successfully added!");
        System.out.println("LIST : "+list);

        return "home";
    }

}
