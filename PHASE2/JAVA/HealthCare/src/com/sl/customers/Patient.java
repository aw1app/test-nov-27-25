package com.sl.customers;

public class Patient {
    //instance variables (properties)
	public String name;
	int age;
	public int patientID;

	public String ailment;
	
	// constructor
	public Patient(String name, int age , String ailment){
		this.name = name;
		this.age = age;
		this.ailment = ailment;		
	}
	

	void takePrescribedMedicine() {

	}

	void takePrescribedLabTest() {

	}
	
	public String info() {
		return "PATIENT: name:"+ this.name + ", ID:" +patientID +", age:"+ this.age + ",ailment: "+ this.ailment;
	}

}
