package com.autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Display {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/autowireannotation/annotation.xml");
		
		Car car=(Car)context.getBean("car");
		System.out.println(car);

	}

}
