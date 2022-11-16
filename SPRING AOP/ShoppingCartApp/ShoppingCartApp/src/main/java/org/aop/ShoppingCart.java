package org.aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(){
        // Cross cutting concerns like
        // Logging
        // Authentication & Authorization
        System.out.println("Checkout from cart!");
    }

    public int quantity(){
        return 5;
    }
}
