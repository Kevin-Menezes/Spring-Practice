package Validators;

import entities.UserRegistration;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class NameValidator implements Validator {

    // Checks if the NameValidator supports a given object
    @Override
    public boolean supports(Class<?> aClass) {

        return UserRegistration.class.equals(aClass);
    }

    // We need to write our custom validation logic
    @Override
    public void validate(Object o, Errors errors) {

        // To check if the field is null
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"username","username.empty","Username can't be empty!");

        // The string should contain a _
        String userName = ((UserRegistration)o).getUsername();

        if(!userName.contains("_")){
            errors.rejectValue("username","username.invalidString","Username must contain a _");
        }
    }
}
