package com.sl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//IProduct t1 = new TelevisionInfy("Phillips",12000.99f);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		IProduct t1 = (IProduct) context.getBean("t1") ; // dependency injection using CDI
		
		System.out.println(t1.getProductInfo());
		
		
		IProduct t2 = (IProduct) context.getBean("t2") ; // t2 is a bean that uses SDI 
		System.out.println(t2.getProductInfo());
		
		// access the beans without type casting
		IProduct t3 = context.getBean("t2", IProduct.class) ;
		System.out.println(t3.getProductInfo());

	}

}
