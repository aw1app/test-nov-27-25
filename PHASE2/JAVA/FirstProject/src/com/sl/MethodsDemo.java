package com.sl;

public class MethodsDemo {

	public static void main(String[] args) {

		int result1 = add(4, 5);
		System.out.println("result1=" + result1);

		double salary = 50000d;
		double tax = calculateTax(salary);
		System.out.println("Tax on "+ salary + " is "+ tax);
		
		int salary1=100;
		double tax1 = calculateTax(salary1);
		System.out.println("Tax on "+ salary1 + " is "+ tax1);
		
		double salary2 = 50000d;
//		double tax2 = calculateTax2(salary2);
//		System.out.println("Tax on "+ salary2 + " is "+ tax2);

	}

	// method example
	static int add(int x, int y) {
		int c = x + y;
		return c;
	}

	// TASK-1: write a method that will accept salary and will compute
	// & return the 15% tax amount to be paid.
	public static double calculateTax(double salary) {
		return salary * 0.15;
	}
	
	public static double calculateTax2(int salary) {
		return salary * 0.15;
	}

}
