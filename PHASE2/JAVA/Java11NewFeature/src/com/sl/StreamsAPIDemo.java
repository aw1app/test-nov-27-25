package com.sl;

import java.util.ArrayList;
import java.util.List;

public class StreamsAPIDemo {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Gauva");
		fruits.add("Pineapple");
		fruits.add("Avacodo");
		
		// print all fruits
		System.out.println("print all fruits using .forEach of Streams API");
		fruits.stream().forEach(  frt -> System.out.println(frt)  );
		
		// Get only the first 3 fruits
		List<String> fruitsFirstThree = fruits.stream().limit(3).toList();

		//print them (first three)
		System.out.println("\n first three fruits using .limit of Streams API");
		fruitsFirstThree.stream().forEach(  frt -> System.out.println(frt)  );
		
	}

}
