package com.sl;

// Child class
class Square extends Shape {
	
//constructor to initialize length
	Square(double side) {
		super(side); // calling the superclass constructor
	}

//Overriding the area() method
	void area() {
		System.out.println("In area method of square");
		System.out.println("Area of square - " + length * length);
	}
}
