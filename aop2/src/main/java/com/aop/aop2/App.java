package com.aop.aop2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext context=new AnnotationConfigApplicationContext(PaymentConfig.class);
    	Payment payment=context.getBean("payment", Payment.class);
    	
    	payment.payment();
    }
}
