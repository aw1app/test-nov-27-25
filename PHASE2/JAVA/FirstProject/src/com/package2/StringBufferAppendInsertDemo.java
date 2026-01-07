package com.package2;

public class StringBufferAppendInsertDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		StringBuffer sb1 = sb.append("Java").append("is").append("powerful ").append("programming")
				.append(" language ");
		
		System.out.println("After append -- " + sb.toString());
		
		if (sb == sb1) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
		
		String str = new String();
		String str1 = str.concat("This").concat(" is");
		if (str == str1) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
	}
}
