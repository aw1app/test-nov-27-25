package com.sl;

public class FinalKeywordDemo {

	public static void main(String[] args) {

		A a1 = new A();
		// a1.x=500; // error because final varaibles cannot be re-assigned.

	}

}

class A {
	public final int x = 100;

	final void m1() {
	}
}

class B  extends A{ 
	// error because final method inherited from super class cannot be overriden
//	void m1() {
//	}
}