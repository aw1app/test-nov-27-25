package com.package2;

import com.sl.MethodsDemo;

public class AppDemo {

	public static void main(String[] args) {
		
		// Normally this is what you will do
		// That is create objects using new operator
		// and invoke methods on that object.
		MethodsDemo md2 = new MethodsDemo();
		
		double tax = md2.calculateTax(50000);
		System.out.println("Tax on salary 50000 is "+tax);
		
		
		// But if something (varaible of a method) is static
		// then we can access such variale or method just 
		// using the class name.
		double tax1 = MethodsDemo.calculateTax(25000d);
		System.out.println("Tax on salary 25000d is "+tax1);

	}

} 
