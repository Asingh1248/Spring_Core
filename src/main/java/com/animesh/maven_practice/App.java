package com.animesh.maven_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
//
public class App 
{
    public static void main( String[] args )
    {
//        Car car=new Car();
//        car.drive();
    	  
//    	Bike obj =new Bike(); Left and Right Dependency
//        obj.drive();
//        
        // If I update my class I want to chnage my source code
        // I want to run in such way that main is independent of Bike and Car Class
        //I Create a Interface
    	
    	
    	
//    	Vehicle obj=new Car(); //Just Change the Right Part
//    	//But Why to change that way also
//    	
//    	obj.drive();
    	
    	//If have i have car ya toh bike
    	// What is getBean
//    	
//    	BeanFactory--Small Application
//    	ApplicationContext--Enterprise level 
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	//Error 2:IIgeak State Exception which object you need whenever you call Vehicle
    	
    	//Whenever you call xml it goes for Car
    	Car obj =(Car)context.getBean("car");
    	obj.drive();
    	

    	
    	
    }
}
