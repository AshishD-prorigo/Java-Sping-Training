package com.StandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springTest.App;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("com/StandaloneCollection/standalone.xml");
		
		Person person=(Person)context.getBean("person");
		
		System.out.println(person);
		
		System.out.println(person.getFriends().getClass().getName());
		
		System.out.println("===============================");
		System.out.println(person);
//		System.out.println(person.getCourse().getClass().getName());
	}

}
