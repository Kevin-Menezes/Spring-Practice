package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{

    @Autowired
    JavaMailSender mailSender;
    @Override
    public void sendEmail(String UserName,String UserEmail, String s) {

        SimpleMailMessage newEmail = new SimpleMailMessage();
        newEmail.setTo(UserEmail);
        newEmail.setSubject("Project Result");
        newEmail.setText("Hi"+UserName);

        mailSender.send(newEmail);

    }
}
