package com.sl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyProductConfig.class);

		IProduct x1 = context.getBean(Television.class);
		System.out.println(x1.getProductInfo());
		
		IProduct i1 = context.getBean("i1", IProduct.class);
		System.out.println(i1.getProductInfo());
		
		IProduct i2 = context.getBean("i2", TelevisionInfy.class);
		System.out.println(i2.getProductInfo());
		

		IProduct x2 = context.getBean(Monitor.class);
		System.out.println(x2.getProductInfo());
		
		
		// Ask for IProduct
		System.out.println("--Ask for IProduct object. \n If many bean methods return IProduct object \n then it will choose @Primary one--");
		IProduct iproduct = context.getBean(IProduct.class);
		System.out.println(iproduct.getProductInfo());
		
		
	}

}
