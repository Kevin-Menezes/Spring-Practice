package Controllers;

import Formatters.CreditCardFormatter;
import PropertyEditors.CurrencyPropertyEditor;
import entities.Bill;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;

@Controller
public class TestController {

    @RequestMapping("/")
    public String goToIndex(){
        return "index";
    }

    // Displays the bill
    @RequestMapping("/bill")
    public String goToBill(@ModelAttribute("BillDetails") Bill bill){
        return "bill";
    }


    // Processes the details from the bill form -> and sends to the bill_receipt.jsp
    @RequestMapping("/process-bill")
    public String processBill(@ModelAttribute("BillDetails") Bill bill){
        return "bill_receipt";
    }


    // This gets called everytime before a function gets executed
    @InitBinder
    public void initBinder(WebDataBinder binder){

        // This is to restrict the user to only enter the date in this format (dd-mm-yyyy)
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        CustomDateEditor customDateEditor = new CustomDateEditor(dateFormat,true);
        binder.registerCustomEditor(Date.class,"date",customDateEditor);

        // This is to restrict the user to only enter the currency in this form (10,00,000) (put commas)
        NumberFormat numberFormat = new DecimalFormat("##,###.00");
        CustomNumberEditor editor = new CustomNumberEditor(BigDecimal.class,numberFormat,true);
        binder.registerCustomEditor(BigDecimal.class,"amount",editor);

        // Linking the custom editor for currency
        CurrencyPropertyEditor cpe = new CurrencyPropertyEditor();
        binder.registerCustomEditor(Currency.class,"currency",cpe);

        // Linking the custom formatter for credit card
        //binder.addCustomFormatter(new CreditCardFormatter());

    }



}
