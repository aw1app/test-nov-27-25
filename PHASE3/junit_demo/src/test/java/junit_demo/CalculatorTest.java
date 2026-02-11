package junit_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd1() {
		Calculator calc = new Calculator();
		int a = 4;
		int b = 5;
		int expectedResult = 9;

		long actualResult = calc.add(a, b);

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testAdd2() {
		Calculator calc = new Calculator();
		int a = 4;
		int b = 0;
		int expectedResult = 4;

		long actualResult = calc.add(a, b); // expect 4

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testAdd3() {
		Calculator calc = new Calculator();
		int a = 0;
		int b = 0;
		int expectedResult = 0;

		long actualResult = calc.add(a, b);

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testAdd4() {
		Calculator calc = new Calculator();
		int a = 4;
		int b = -1;
		int expectedResult = 3;

		long actualResult = calc.add(a, b); // expect 3

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testAdd5() {
		Calculator calc = new Calculator();
		int a = -4;
		int b = -1;
		long expectedResult = -5;

		long actualResult = calc.add(a, b); // expect 3

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}
	
	
	@Test
	void testAdd6() {
		Calculator calc = new Calculator();
		int a = 1000000000;
		int b = 2000000000;
		long expectedResult = 3000000000L; // exceeds int range, but within long range

		long actualResult = calc.add(a, b); // expect 3

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}

}
