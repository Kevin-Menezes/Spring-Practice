package org.springform.controller;

//import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springform.entities.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormController
{
//    This shows the form
    @RequestMapping("/form")
    public String showForm()
    {
        System.out.println("Go to form!");
        return "Form"; // This is the name of the view
    }

//    This gets details from the form - puts it in the getter setter automatically - and then we send that object to the success page
    @RequestMapping(path = "/RegisterUser", method = RequestMethod.POST)
    public String UserRegistrationForm(@ModelAttribute("employee") Employee emp, BindingResult result, Model m)
    {
        if(result.hasErrors())
        {
            return "Form";
        }

        System.out.println(emp);
        m.addAttribute("Employee", emp);
        return "Success";
    }

    // ---------------------------------------------- Interceptor form program -----------------------------------------------------

    //This shows the Interceptor form
    @RequestMapping("/interceptorform")
    public String showInterceptorForm()
    {
        System.out.println("Go to Interceptor form!");
        return "InterceptorForm"; // This is the name of the view
    }

    // This takes the result from the form , puts it in String name and then sends it to Success.jsp
    @RequestMapping(path = "/Welcome", method = RequestMethod.POST)
    public String executeInterceptorForm(@RequestParam("name") String name, Model m)
    {
        System.out.println("This name gets printed after the prehandler : "+name);
        m.addAttribute("Username" , name);
        return "Success";
    }




// --------------------------------------------------Error Handling---------------------------------------------------------------------
////  Handling specific errors in spring mvc
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) // This is like 404 code and others
//    @ExceptionHandler({NullPointerException.class})
//    public String exceptionHandlerNull(Model m)
//    {
//        m.addAttribute("ErrorMsg","Null Pointer error has occured");
//        return "NullPage";
//    }
//
//    //  Handling specific errors in spring mvc
//    @ExceptionHandler(value = Exception.class)
//    public String exceptionHandlerGeneric(Model m)
//    {
//        m.addAttribute("ErrorMsg","Exception has occured");
//        return "NullPage";
//    }

}