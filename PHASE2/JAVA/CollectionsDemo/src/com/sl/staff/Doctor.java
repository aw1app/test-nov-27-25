package com.sl.staff;

import com.sl.customers.Patient;

public class Doctor {
	
	public String name;
	int age;
	private float salary;
	
	public String qualification;
	
	boolean available=false;
	
	
	public Doctor(String name, int age, float salary, String qualification, boolean available) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.qualification = qualification;
		this.available = available;
	}

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

	public void consult(Patient patient) {
		System.out.println("Doctor: INSIDE consult method to consult a patient " + patient.info());
	}

	public void presribe(Patient patient) {
		System.out.println("Doctor: INSIDE presribe method to presribe a patient " + patient.info());
		
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	

}