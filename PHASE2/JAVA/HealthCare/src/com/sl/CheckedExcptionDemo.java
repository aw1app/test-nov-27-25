package com.sl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExcptionDemo {

	public static void main(String[] args) {

		FileReader fr = null;

		try {
			fr = new FileReader("a.txt");

			int ch = fr.read(); // read a byte , a single char
			System.out.println("Read a char : " + (char) ch);

		} catch (FileNotFoundException e) {
			System.out.println("inside exception block .." + e);
		} catch (IOException e) {
			System.out.println("inside exception block .." + e);
		} finally {
			System.out.println("inside finally block .." );
			if (fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

		System.out.println("END. Program exit.");

	}

}
