package com.package2;

public class StringDemo {

	public static void main(String arg[]) {
		String s = "Java is programming language";

		System.out.println(s.startsWith("Java"));
		System.out.println(s.endsWith("language"));

		System.out.println(s.substring(10)); // 10 is starting index

		System.out.println(s.indexOf("programming"));

		System.out.println(s.trim());

		////
		////
		String s1 = "abc@test.com";
		String[] s2 = s1.split("@"); // divide string based on @
		for (String c : s2) // foreach loop
		{
			System.out.println(c);
		}
		;

		//////
		///
		String s4 = "Hello";
		String s5 = s4.replace('e', 'k');
		System.out.println(s5);
	}

}
