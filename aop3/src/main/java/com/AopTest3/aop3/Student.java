package com.AopTest3.aop3;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	public void wakeUp() {
		System.out.println("Good Morning");
		
		System.out.println("Good Night");
	}

}
