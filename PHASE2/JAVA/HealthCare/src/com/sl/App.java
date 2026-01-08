package com.sl;

import com.sl.customers.Patient;
import com.sl.staff.Doctor;
import com.sl.staff.SpecialistDoctor;

public class App {

	public static void main(String[] args) {
		// Create two doctor instances
		
		Doctor doctor1 = new Doctor();
		
		doctor1.name="Sudhakar";
		doctor1.qualification="MBBS (London)";
		
		
		System.out.println("INFO of doctor1 object " + doctor1.info());
		
		doctor1.performSurgery();
		
		//TASK-1: Create a Patient class inn this project just like we created Doctor class.
		// Then create a Patient instance here and invoke some methods.
		
//		Patient patient1 = new Patient();
//		patient1.name="Sundar";
//		patient1.patientID=2206;
//		
//		System.out.println("INFO of patient1 object " + patient1.info());
		
		
		Patient patient2 = new Patient("Manohar",24, "High Fever");
		
		System.out.println("INFO of patient2 object " + patient2.info());
		
		System.out.println("\n INHERITANCE DEMO\n");
		SpecialistDoctor spDoctor1 = new SpecialistDoctor();
		spDoctor1.name="Prakash";
		spDoctor1.diagonse(); // diagonse method is inherited from superclass Doctor
		spDoctor1.performSpecialDiagonis();//performSpecialDiagonis method is in SpecialistDoctor.

	}

}
