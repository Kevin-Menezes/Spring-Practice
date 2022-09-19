package Controllers;

import PropertyEditors.NamePropertyEditor;
import Validators.EmailValidator;
import Validators.NameValidator;
import entities.UserRegistration;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;
import java.util.List;

@Controller
public class RegistrationController {

    // This displays the signup form
    @RequestMapping("/register")
    public String showRegistrationPage(@ModelAttribute("UserRegistration") UserRegistration ur){

        ur.setName("Kevin");
        return "user_registration";

    }

    // This displays the result page after the signup form is submitted
    @RequestMapping("/process-registration")
    public String processUserRegistration(@Valid @ModelAttribute("UserRegistration") UserRegistration ur, BindingResult result){

        if(result.hasErrors()){
            System.out.println("==============================Errors================================");
            List<ObjectError> allErrors = result.getAllErrors();
            for(ObjectError temp : allErrors){
                System.out.println(temp);
            }
            return "user_registration";
        }

        System.out.println("==============Success================");

        return "user_registration_success";

    }

    // This gets called everytime before a function gets executed
    @InitBinder
    public void initBinder(WebDataBinder binder){
        //binder.setDisallowedFields("name");

        // To link the custom editor of Username
        // This converts an empty string entered by user into a null object
        // Eg. if the user enters only spaces as the name -> then this converts the empty spaces into a null object
        StringTrimmerEditor editor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,"name",editor);

        NamePropertyEditor nameEditor = new NamePropertyEditor();
        binder.registerCustomEditor(String.class,"name",nameEditor);

        // To link the custom validator of Username
        binder.addValidators(new NameValidator());

        // To link the custom validator of Email
        binder.addValidators(new EmailValidator());


    }
}
