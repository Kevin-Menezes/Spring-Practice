package com.aop.services;

public class PaymentServiceImpl implements PaymentService{

	// Join Point
	@Override
	public void makePayment(int amt) {
		
		System.out.println(amt+" Amount Debited!");
		
		
		System.out.println(amt+" Amount Credited!");
		
	}

}
