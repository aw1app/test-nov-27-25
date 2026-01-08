package com.sl;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		int a=10;
		int b;
		
		System.out.println("enter value for b:");
		b=scanner.nextInt();
		
		int result=-1;
		
		try {
		result = a/b;
		}catch(ArithmeticException ex) {
			System.out.println("caught an exception " +ex.getMessage());
		}
		
		System.out.println("a/b result =" + result);
		
		scanner.close();
		System.out.println("End. Thank you for using this Java program!");

	}

}
