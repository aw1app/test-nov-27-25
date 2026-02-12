package com.sl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sl.creators.ProductCreator;

public class App {

	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sl");
		ProductCreator pc = context.getBean(ProductCreator.class);
		
		System.out.println(pc.getTeleveison().getProductInfo());
		
	}

}
