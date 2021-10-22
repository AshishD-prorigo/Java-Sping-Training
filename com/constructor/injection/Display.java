package com.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Display {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/constructor/injection/constructor.xml");
		
		Laptop laptop=(Laptop)context.getBean("laptop");
		System.out.println(laptop);

	}

}
