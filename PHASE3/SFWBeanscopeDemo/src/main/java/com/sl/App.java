package com.sl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sl.creators.ProductCreator;

public class App {

	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sl");
		
		System.out.println("**creating t1**");
		Television t1 = context.getBean(Television.class);
		
		System.out.println(t1.getProductInfo());
		
		System.out.println("**creating t2**");
		Television t2 = context.getBean(Television.class);
		System.out.println(t2.getProductInfo());
		
		System.out.println("\n t1 object memory ref "+ t1);
		System.out.println("t2 object memory ref "+ t2);
	}

}
