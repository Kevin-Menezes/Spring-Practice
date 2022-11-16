package org.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(org..*)") // This is for all methods inside ShoppingCart class
    public void authenticatingPointCut(){

    }


    @Pointcut("within(org..*)") // This is for all classes and all methods inside aop package
    public void authorizationPointCut(){

    }

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating...");
    }

}
