package com.sl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//IProduct t1 = new TelevisionInfy("Phillips",12000.99f);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		IProduct t1 = (IProduct) context.getBean("t1") ;
		
		System.out.println(t1.getProductInfo());

	}

}
