package org.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.aop.ShoppingCart.checkout())") // This is for only checkout method
    public void beforeLogger(JoinPoint jp){
        System.out.println(jp.getSignature());
        System.out.println("Before Loggers");
    }

    @After("execution(* *.*.checkout())")
    public void afterLogger(){
        System.out.println("After Loggers");
    }

    // =========================================================

    @Pointcut("execution(* org.aop.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut="afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning : "+retVal);
    }
}
