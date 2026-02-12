package com.sl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyProductConfig.class);
		
		IProduct x1 = context.getBean(IProduct.class);
		
		System.out.println(x1.getProductInfo());

	}

}
