package com.package2;

import com.sl.Calculator;

public class MethodOverloadingDemo {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		System.out.println(cal.product(5, 2));
		System.out.println(cal.product(2, 3, 4));

	}

}
