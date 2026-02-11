package junit_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
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
		System.out.printf("INSIDE testAdd with a=%s b=%s expectedResult=%s \n", a,b,expectedResult);
		Calculator calc = new Calculator();
		

		long actualResult = calc.add(a, b);

		// check the output and assert it is equal to expectedResult
		assertEquals(expectedResult, actualResult);
	}
	
	
	@RepeatedTest(6)
	void testRepeatedlyAdd() {
		System.out.println("INSIDE testRepeatedlyAdd");
		Calculator calc = new Calculator();		

		long actualResult = calc.add(1, 1);

		// check the output and assert it is equal to expectedResult
		assertEquals(2, actualResult, "1 + 1 equals 2");
	}

}
