package Converters;

import entities.CreditCard;
import org.springframework.core.convert.converter.Converter;

// Converter is the same as Formatter
public class CreditCardConverter implements Converter<String, CreditCard> {

    @Override
    public CreditCard convert(String s) {

        String[] arr = s.split("-");

        CreditCard cc = new CreditCard();
        cc.setFirstfourdigits(Integer.valueOf(arr[0]));
        cc.setSecondfourdigits(Integer.valueOf(arr[1]));
        cc.setThirdfourdigits(Integer.valueOf(arr[2]));
        cc.setLastfourdigits(Integer.valueOf(arr[3]));

        return cc;

    }
}
