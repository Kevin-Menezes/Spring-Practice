
package com.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController 
{
    @RequestMapping("/form")
    public String Form() {
        System.out.println("Go to form");
        return "Form";
    }
}
