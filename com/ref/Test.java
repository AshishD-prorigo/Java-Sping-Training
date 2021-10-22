package com.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ref/ref.xml");
		
		A aref=(A)context.getBean("aref");
		System.out.println(aref);
		
		System.out.println(aref.getY());
		
		System.out.println(aref.getOb().getX());
		
	}

}
