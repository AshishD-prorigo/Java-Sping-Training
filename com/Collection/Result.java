package com.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Result {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/Collection/Collection.xml");
		
		Employee emp1=(Employee)context.getBean("emp1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getMo_no());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());
	}

}
