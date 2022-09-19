package Validators;

import entities.UserRegistration;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EmailValidator implements Validator {

    // Checks if the EmailValidator supports a given object
    @Override
    public boolean supports(Class<?> aClass) {
        return UserRegistration.class.equals(aClass);
    }

    // We need to write our custom validation logic
    @Override
    public void validate(Object o, Errors errors) {

        // To check if the field is null
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"usercommunication.email","email.empty");

        // To check if the email ends with kevin.com
        String email = ((UserRegistration)o).getUsercommunication().getEmail();
        if(!email.endsWith("kevin.com")){
            errors.rejectValue("usercommunication.email","email.invalidDomain");
        }
    }
}
