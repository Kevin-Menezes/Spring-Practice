import entities.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneNumberFormatter implements Formatter<Phone> {

    // This converts the string to phone object
    @Override
    public Phone parse(String PhoneNumber, Locale locale) throws ParseException {

        Phone phone = new Phone();
        // Splits the string given from the user based on the "-"
        String[] split = PhoneNumber.split("-");

        int index = PhoneNumber.indexOf('-');

        // If there is no 91
        if(index == -1 || PhoneNumber.startsWith("-")){
            phone.setCountrycode("91");

            if(PhoneNumber.startsWith("-")){
                phone.setUsernumber(split[1]);
            }
            else{
                phone.setUsernumber(split[0]);
            }

        }
        else{

            phone.setCountrycode(split[0]);
            phone.setUsernumber(split[1]);
        }
        return phone;
    }

    @Override
    public String print(Phone phone, Locale locale) {
        return null;
    }
}
