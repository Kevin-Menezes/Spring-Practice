package Formatters;

import entities.CreditCard;
import org.springframework.format.Formatter;
import java.text.ParseException;
import java.util.Locale;

public class CreditCardFormatter implements Formatter <CreditCard>{

    // Converting the string from the user into the CreditCard object
    @Override
    public CreditCard parse(String CardNumber, Locale locale) throws ParseException {

        String[] arr = CardNumber.split("-");

        CreditCard cc = new CreditCard();
        cc.setFirstfourdigits(Integer.valueOf(arr[0]));
        cc.setSecondfourdigits(Integer.valueOf(arr[1]));
        cc.setThirdfourdigits(Integer.valueOf(arr[2]));
        cc.setLastfourdigits(Integer.valueOf(arr[3]));

        return cc;
    }

    @Override
    public String print(CreditCard cc, Locale locale) {
        return null;
    }
}
