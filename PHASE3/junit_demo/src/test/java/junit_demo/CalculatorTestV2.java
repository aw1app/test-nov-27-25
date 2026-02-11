package junit_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/* This test  class is an improvement over the previous version. 
 *  Here we will use the before/after lifecycle methods
 *  */
class CalculatorTestV2 {
	Calculator calc = null;
	
	@BeforeAll
	static void myBeforeAll() {
		System.out.println(" INSIDE myBeforeAll");
		// add statements that should be executed before launching any test case in this class
		// like connecting to DB
		
	}
	
	@AfterAll
	static void myAfterAll() {
		System.out.println(" INSIDE myAfterAll");
		// add statements that should be executed after running all test cases in this class
		// like release the database connection DB
	}
	
	@BeforeEach
	void myBeforeEach() {
		System.out.println(" INSIDE myBeforeEach");
		calc = new Calculator();
	}
	
	@AfterEach
	void myAfterEach() {
		System.out.println(" INSIDE myAfterEach");
		calc = null;
	}
	
	@Test
	void testAdd1() {
		System.out.println(" INSIDE testAdd1");
		int a = 4;
		int b = 5;
		int expectedResult = 9;

		long actualResult = calc.add(a, b);

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testAdd2() {
		System.out.println(" INSIDE testAdd2");
		int a = 4;
		int b = 0;
		int expectedResult = 4;

		long actualResult = calc.add(a, b); // expect 4

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testAdd3() {
		System.out.println(" INSIDE testAdd3");
		int a = 0;
		int b = 0;
		int expectedResult = 0;

		long actualResult = calc.add(a, b);

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testAdd4() {
		System.out.println(" INSIDE testAdd4");
		int a = 4;
		int b = -1;
		int expectedResult = 3;

		long actualResult = calc.add(a, b); // expect 3

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testAdd5() {
		System.out.println(" INSIDE testAdd5");
		int a = -4;
		int b = -1;
		long expectedResult = -5;

		long actualResult = calc.add(a, b); // expect 3

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}
	
	
	@Test
	void testAdd6() {
		System.out.println(" INSIDE testAdd6");
		int a = 1000000000;
		int b = 2000000000;
		long expectedResult = 3000000000L; // exceeds int range, but within long range

		long actualResult = calc.add(a, b); // expect 3

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}

	// TASK-2: Create two unit test cases for multiply method
}
