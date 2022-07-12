package org.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController
{
    @RequestMapping(path = "/home")
    public String Home()
    {
        return "index";
    }

    @RequestMapping(path = "/about")
    public String About(Model m)
    {
        String name = "Kevin";
        m.addAttribute("K",name); // Directly sending the value to the about page
        return "about";
    }

    @RequestMapping(path = "/data" , method = RequestMethod.POST)
    public String getData(@RequestParam("name") String name,
                          @RequestParam("pass") String pass, Model model)
    {
        System.out.println("Name is "+name);
        System.out.println("Password is "+pass);

        model.addAttribute("name",name); // Key - value
        model.addAttribute("pass",pass);
        return "index";
    }

}
