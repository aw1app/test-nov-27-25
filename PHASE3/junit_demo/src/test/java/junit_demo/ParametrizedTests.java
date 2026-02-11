package junit_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ParametrizedTests {

	@ParameterizedTest
	@CsvSource(
			{ 
				"1, 1, 2",
				"-2, 3, 1", 
				"10, -5, 5" 
			}
			)
	void testAdd(int a, int b, long expectedResult) {
		Calculator calc = new Calculator();
		

		long actualResult = calc.add(a, b);

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}

}
