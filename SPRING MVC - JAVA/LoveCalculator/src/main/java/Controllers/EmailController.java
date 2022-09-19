package Controllers;

import DAO.EmailService;
import DAO.EmailServiceImpl;
import entities.Email;
import entities.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class EmailController {

    @Autowired
    private EmailServiceImpl emailService;

    // To display the email page
    @RequestMapping("/send-email")
    public String sendEmail( Model m){

        m.addAttribute("email",new Email());

        return "send_email";
    }

    // To process the email after user enters his email id
    @RequestMapping("/process-email")
    public String processEmail(@SessionAttribute("UserDetails") UserDetails us, @ModelAttribute("email")Email email){

        emailService.sendEmail(us.getUsername(),email.getUseremail(),"FRIEND");

        return "email_success";
    }

}
