package com.sl;

public class PolymorphismDemoApp {

	public static void main(String[] args) {

		Shape shape;

		Square square = new Square(5.0);
		Circle circle = new Circle(5.0);

		// shape dynamically bound to the Square object referenced by square
//		shape = square;
//		shape.area();
		
		
		shape = circle;
		shape.area();

	}
}
