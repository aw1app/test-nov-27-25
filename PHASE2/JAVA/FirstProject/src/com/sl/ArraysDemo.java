package com.sl;

public class ArraysDemo {

	public static void main(String[] args) {

		// Declare and initialize an integer array with 10 elements
		int[] myArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		// print the first element
		System.out.print("first element is:");
		System.out.println(myArray[0]);

		// looping through all elements of this array
		System.out.print("\n\n looping through all elements of this array\n");
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("myArray[" + i + "] : " + myArray[i]);
		}
		
		
		//Multi-Dimensional Array
		System.out.print("\n\n Multi-Dimensional Array\n");
		int[][] numbers = {
				 {1, 2, 3, 4, 5},
				 {11, 12, 13, 14, 15}
				 };
		
		// print the 0,0 (row=0, col=0) element
		System.out.println("0,0 (row=0, col=0) element is : " + numbers[0][0]); // 1
		System.out.println("1,3 (row=1, col=3) element is : " + numbers[1][3]); // 14 
		
	}

}
