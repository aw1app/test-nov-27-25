package com.sl;

public class Calculator {
	
	public int product(int a, int b) {
		System.out.println("INSIDE Calculator. Calling int product(int a, int b) ");
		
		return a * b;
	}

	
	public int product(int a, int b, int c) {
		System.out.println("INSIDE Calculator. Calling int product(int a, int b, int c) ");
		
		return a * b * c;
	}
}
