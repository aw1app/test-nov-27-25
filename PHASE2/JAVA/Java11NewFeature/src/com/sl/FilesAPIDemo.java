package com.sl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FilesAPIDemo {

	public static void main(String[] args) {
		
		// Read File demo	
		String pathOfProductsTxt = "F:/Users/home/git/test-nov-27-25/PHASE2/JAVA/Java11NewFeature/src/products.txt";
		
		String contents = null;
		
		try {
			contents = Files.readString(Path.of(pathOfProductsTxt));
		} catch (IOException e) {
			System.out.println(e);
		};
		
		System.out.println("Contents of the File products.txt : "+contents);
		
		
		// Task-2: Read the contents of the file line by line
		
		// DEMO writing to a file
		String pathOfOrdersTxt = "F:/Users/home/git/test-nov-27-25/PHASE2/JAVA/Java11NewFeature/src/order.txt";
		Path path2 = Path.of(pathOfOrdersTxt);
		try {
			Files.writeString(path2, "hello\nhi",StandardOpenOption.CREATE);
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
