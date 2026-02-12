package com.sl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyProductConfig.class);

		System.out.println("Products in @Order sequence:");
		
		List<IProduct> iProducts = context.getBeanProvider(IProduct.class).orderedStream().toList();
		
		iProducts.forEach( prod -> System.out.println(prod.getProductInfo()));
		
		
	}

}
