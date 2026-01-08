package com.sl;

// Child class
class Circle extends Shape {
//constructor to initialize length
	Circle(double radius) {
		super(radius); // calling the superclass constructor
	}

//Overriding the area() method
	void area() {
		System.out.println("In area method of circle");
		System.out.println("Area of circle - " + 22 / 7 * length * length);
		;
	}
}