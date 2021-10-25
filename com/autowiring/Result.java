package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Result {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/autowiring/autowiring.xml");
		Employee emp=(Employee)context.getBean("emp");
		System.out.println(emp);

	}

}
