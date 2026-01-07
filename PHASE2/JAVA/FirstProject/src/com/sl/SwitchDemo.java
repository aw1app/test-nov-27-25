package com.sl;

public class SwitchDemo {

	public static void main(String[] args) {

		int number = 200;

		switch (number) {
		// Case statements
		case 100:
			System.out.println("100");
			break;
		case 200:
			System.out.println("200");
			break;
		case 300:
			System.out.println("300");
			break;
		// Default case statement
		default:
			System.out.println("Not in 100, 200 or 300");
		}

		// switch also works string expression
		System.out.println("switch also works string expression");
		String str = "abc";

		switch (str) {
		// Case statements
		case "aa":
			System.out.println("aa");
			break;
		case "bb":
			System.out.println("bb");
			break;
		case "abc":
			System.out.println("abc");
			break;
		// Default case statement
		default:
			System.out.println("Not in aa, bb or abc");
		}

	}

}
