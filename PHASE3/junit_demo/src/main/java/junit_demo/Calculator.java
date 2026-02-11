package junit_demo;

public class Calculator {
	
	long add(int a, int b) {
		
		return (long) (a + b);
		
		//throw new RuntimeException("Method not implemented");
	}
	
	int multiply(int a, int b) {
		throw new RuntimeException("Method not implemented");
	}

}
