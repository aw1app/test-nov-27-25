package com.sl;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Everyone!! Today is our first session on Core Java.");
		
		// Unary operator demo	
		System.out.println("Unary operator demo");
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10 
		
		
		//Illustration for Left Shift Operator
		 System.out.println("Illustration for Left Shift Operator");
		System.out.println(8<<2);//8*2^2=8*4=32  
		System.out.println(8<<3);//8*2^3=8*8=64  
		
		
		// Illustration for AND Operator	
		 System.out.println("Illustration for AND Operator");
		int a=9;  
		int b=4;  
		int c=19;  
		System.out.println(a>b&&a<c);// true  
		System.out.println(a<b&a<c);// false 

	}

}
