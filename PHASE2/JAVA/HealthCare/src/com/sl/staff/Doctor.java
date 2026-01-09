package com.sl.staff;

import com.sl.Consultant;
import com.sl.customers.Patient;

public class Doctor implements Consultant{
	
	public String name;
	int age;
	private float salary;
	
	public String qualification;
	
	boolean available=false;
	
	// actions or methods
	
	public boolean isAvailable() {
		return available;
	}
	
	public void performSurgery(){
		System.out.println("Doctor: INSIDE performSurgery method ");		
	}
	
	public void diagonse() {
		System.out.println("Doctor: INSIDE diagonse method ");
	}
	
	public void prescribe(){
		System.out.println("Doctor: INSIDE prescribe method ");
	}
	
	public String info() {
		return "DOCTOR: name:"+ this.name +", age:"+ this.age + ",qualification: "+ this.qualification;
	}

	@Override
	public void consult(Patient patient) {
		System.out.println("Doctor: INSIDE consult method to consult a patient " + patient.info());
	}

	@Override
	public void presribe(Patient patient) {
		System.out.println("Doctor: INSIDE presribe method to presribe a patient " + patient.info());
		
	}

}
