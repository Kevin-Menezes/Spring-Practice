package org.springform;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler
{
    //  Handling specific errors in spring mvc
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) // This is like 404 code and others
    @ExceptionHandler({NullPointerException.class})
    public String exceptionHandlerNull(Model m)
    {
        m.addAttribute("ErrorMsg","Null Pointer error has occured");
        return "NullPage";
    }

    //  Handling specific errors in spring mvc
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public String exceptionHandlerGeneric(Model m)
    {
        m.addAttribute("ErrorMsg","Exception has occured");
        return "NullPage";
    }

}
