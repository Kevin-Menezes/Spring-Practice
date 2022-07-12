package org.controller;

import org.dao.ContactDAO;
import org.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController
{
    @Autowired
    private ContactDAO contactDAO; // This goes to the bean class automatically coz of @Autowired

// This is to display the values in the table
    @RequestMapping(value = "/")
    public ModelAndView listContact(ModelAndView model)
    {
        List<Contact> listContact = contactDAO.list();
        model.addObject("ContactList",listContact); // This we get then through jstl in the index page
        model.setViewName("index");
        return model;
    }

// Another way of sending data across views for listContact
//    @RequestMapping(value = "/")
//    public String listContact(Model m)
//    {
//        List<Contact> listContact = contactDAO.list();
//        m.addAttribute("ContactList",listContact);
//        return "index";
//    }


// This is to display the form page and get values from the form and put it in Contact object
    @RequestMapping(value="/new", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model)
    {
        Contact newContact = new Contact();
        model.addObject("contact", newContact);
        model.setViewName("contact_form");
        return model;
    }

//    This is to insert values in the database after clicking on save / update details also
    @RequestMapping(value="/save", method = RequestMethod.POST)
    public ModelAndView saveContact(@ModelAttribute Contact contact)
    {
        if(contact.getId() == null)
        {
            contactDAO.save(contact);
        }
        else
        {
            contactDAO.update(contact);
        }

        return new ModelAndView("redirect:/");
    }

//    This is to go to the same form to edit the details
    @RequestMapping(value="/edit", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request)
    {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Contact contact = contactDAO.get(id);

        ModelAndView model = new ModelAndView("contact_form");
        model.addObject("contact",contact);

        return model;

    }

    //    This is to go to delete the details
    @RequestMapping(value="/delete", method = RequestMethod.GET)
    public ModelAndView deleteContact(@RequestParam Integer id)
    {
        contactDAO.delete(id);
        return new ModelAndView("redirect:/");

    }



}
