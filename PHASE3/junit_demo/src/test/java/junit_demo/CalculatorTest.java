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

		int actualResult = calc.add(a, b);

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testAdd2() {
		Calculator calc = new Calculator();
		int a = 4;
		int b = 0;
		int expectedResult = 4;

		int actualResult = calc.add(a, b); // expect 4

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}

}
