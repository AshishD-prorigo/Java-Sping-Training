package com.aop.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@Aspect
public class PaymentAspect {
	
	@Before("execution(public void payment())")
	public void doPayment() {
		System.out.println("Payment Is Processing....");
	}

}
