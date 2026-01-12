package com.sl;

import java.util.ArrayList;
import java.util.List;

public class StreamsAPIDemo {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Orange");
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
		
		// filter those fruits that are having names lenght < 5
		System.out.println("\n names of fruits LT 5 chars using .filter of Streams API");
		List<String> fruitsNamesLengthLT5 = fruits.stream().filter(  frt ->  frt.length() <= 5  ).toList();
		fruitsNamesLengthLT5.stream().forEach(  frt -> System.out.println(frt)  );
		
		// mapping or transformations
		System.out.println("\n\n mapping or transformations demo using .map of Streams API");
		List<String> fruitsinCaps= fruits
		.stream()
		.map (frt -> frt.toUpperCase())
		.toList();
		
		fruitsinCaps.stream().forEach(  frt -> System.out.println(frt)  );
		
		// Chaining of stream ops
		System.out.println("\n\n Chaining of stream ops");
		fruits
		.stream()
		.map (frt -> frt.toUpperCase())
		.filter (frt -> frt.startsWith("A"))
		.forEach(  frt -> System.out.println(frt)  );
		
		
	}

}
