package com.sl.staff;

public class Doctor {
	
	public String name;
	int age;
	private float salary;
	
	public String qualification;
	
	// actions or methods
	
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

}
