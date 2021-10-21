package com.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("ConstructorConfig.xml");
        
        Car car1=(Car)context.getBean("car1");
        System.out.println(car1);
        
        Car car2=(Car)context.getBean("car2");
        System.out.println(car2);
    }


}
