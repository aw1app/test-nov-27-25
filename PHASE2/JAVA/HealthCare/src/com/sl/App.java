package com.sl;

import com.sl.staff.Doctor;

public class App {

	public static void main(String[] args) {
		// Create two doctor instances
		
		Doctor doctor1 = new Doctor();
		
		doctor1.name="Sudhakar";
		doctor1.qualification="MBBS (London)";
		
		
		System.out.println("INFO of doctor1 object" + doctor1.info());
		
		doctor1.performSurgery();
		
		//TASK-1: Create a Patient class inn this project just like we created Doctor class.
		// Then create a Patient instance here and invoke some methods.

	}

}
