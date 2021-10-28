package com.AopTest3.aop3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@EnableAspectJAutoProxy
@Component
@Aspect
public class Parent {
	
	@After("execution(public void wakeUp())")
	public void go() {
		System.out.println("Go To GYM");
	}

}
