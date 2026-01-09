package com.sl.customers;

public class Patient {
	// instance variables (properties)
	public String name;
	int age;
	public int patientID;

	public String ailment;

	// constructors
	// default constructor
	public Patient() {

	}

	public Patient(String name, int age, String ailment) {
		this.name = name;
		this.age = age;
		this.ailment = ailment;
	}

	public Patient(String name, int age, String ailment, int patientID) {
		this(name,age,ailment); // call the other constructor.
		this.patientID = patientID;
	}

	public void takePrescribedMedicine() {

	}

	void takePrescribedLabTest() {

	}

	public String info() {
		return "PATIENT: name:" + this.name + ", ID:" + patientID + ", age:" + this.age + ",ailment: " + this.ailment;
	}

}