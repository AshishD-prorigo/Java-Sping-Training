package com.diffConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisplayDetails {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/diffConstructor/diffConstructor.xml");
		
		Bike bike=(Bike)context.getBean("bike");
		
		System.out.println(bike);
		
		Bike bike1=(Bike)context.getBean("bike2");
		
		System.out.println(bike1);

	}

}
