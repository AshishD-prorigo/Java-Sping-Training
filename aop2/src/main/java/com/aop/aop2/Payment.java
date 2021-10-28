package com.aop.aop2;

import org.springframework.stereotype.Component;

@Component
public class Payment {
	
	public void payment() {
		
		System.out.println("Amount is Depibeted...");
		
		System.out.println("Payment is Successfully Done....");
	}

}
