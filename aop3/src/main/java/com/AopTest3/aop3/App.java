package com.AopTest3.aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
    	
      Student student= context.getBean(Student.class);
      student.wakeUp();
    }
}
