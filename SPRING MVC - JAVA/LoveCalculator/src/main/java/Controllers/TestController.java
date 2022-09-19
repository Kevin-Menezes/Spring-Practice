package Controllers;

import DAO.LoveServiceImpl;
import entities.UserDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.Cookie;;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
@SessionAttributes("UserDetails")
public class TestController {

    @Autowired
    LoveServiceImpl ls;

    // This goes to the index page
    @RequestMapping("/")
    public String goToIndex(Model m){

        return "index";
    }

    // This goes to the home page
    @RequestMapping("/home")
    public String goToHome(Model m){

        m.addAttribute("UserDetails",new UserDetails());

        return "home";
    }

//    @RequestMapping("/process-form")
//    public String processForm(@RequestParam String username, @RequestParam String crushname, Model m){
//
//        m.addAttribute("User",username);
//        m.addAttribute("Crush",crushname);
//
//        return "result";
//    }

    // After submitting the form on the home page.... it gets processed here
    @RequestMapping("/process-form")
    public String processForm(Model m, @Valid UserDetails u, BindingResult result){

        m.addAttribute("UserDetails",u);
        m.addAttribute(BindingResult.MODEL_KEY_PREFIX +"UserDetails",result); // This is to activate Validation as we are not using @Model Attribute

        // This prints all the errors in the form ( If the conditions are not satisfied )
        if(result.hasErrors()){
            System.out.println("==============================Errors================================");
            List<ObjectError> allErrors = result.getAllErrors();
            for(ObjectError temp : allErrors){
                System.out.println(temp);
            }
            return "home";
        }

        // Putting the answer in the setter
        String answer = ls.calculateLove(u.getUsername(), u.getCrushname());
        u.setAnswer(answer);

        System.out.println("==============Success================");

        return "result";
    }


}
