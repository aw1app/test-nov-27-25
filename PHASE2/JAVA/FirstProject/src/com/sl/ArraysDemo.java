package com.sl;

public class ArraysDemo {

	public static void main(String[] args) {

		// Declare and initialize an integer array with 10 elements
		int[] myArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		// print the first element
		System.out.print("first element is:");
		System.out.println(myArray[0]);

		// looping through all elements of this array
		System.out.print("\n\n looping through all elements of this array");
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("myArray[" + i + "] : " + myArray[i]);
		}
	}

}
