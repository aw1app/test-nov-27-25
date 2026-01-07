package com.sl;

public class OverloadingExample {
// overloaded function
	void overloadedfunction(int i) {
		System.out.println("In overloaded function with int parameter- " + i);
	}

// overloaded function
	void overloadedfunction(int x, String str) {
		System.out.println("In overloaded function with int and string parameters- integer ,  string");
	}

	public static void main(String args[]) {
		OverloadingExample obj = new OverloadingExample();
		obj.overloadedfunction(8);
		obj.overloadedfunction(8, "Hello");
	}
}
