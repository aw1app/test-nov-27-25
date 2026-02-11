package junit_demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalTesting {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	void testOnWin() {
		System.out.println("INSIDE testOnWin");
	}
	
	//Task-3: Write a test case that will run only on Mac OS systems

}
