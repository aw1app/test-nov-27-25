package junit_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ConditionalTesting {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	void testOnWin() {
		System.out.println("INSIDE testOnWin");
	}
	
	//Task-3: Write a test case that will run only on Mac OS systems
	
	@Test
    @EnabledOnOs({OS.MAC})
    void testOnMac() {
        System.out.println("INSIDE testOnMac");
    }
	
	@Test
	@EnabledOnOs({ OS.LINUX })
	public void testAddOnLinux() {
		
		System.out.println("INSIDE testAddOnLinux");
		
		Calculator cal = new Calculator();

		int x = 2;
		int y = 5;

		assertEquals(7, cal.add(x, y));
	}
	
	
	// based JRE
	@Test
	@EnabledOnJre({JRE.JAVA_21})
	public void testAddJRE21() {
		
		System.out.println("INSIDE testAddJRE21");
		
		Calculator cal = new Calculator();

		int x = 2;
		int y = 5;

		assertEquals(7, cal.add(x, y));
	}
	
	@Test
	@EnabledOnJre({JRE.JAVA_26})
	public void testAddJRE26() {
		
		System.out.println("INSIDE testAddJRE26");
		
		Calculator cal = new Calculator();

		int x = 2;
		int y = 5;

		assertEquals(7, cal.add(x, y));
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named = "x1", matches = "\\d{3}")
	public void testAddEnvVariable() {
		
		System.out.println("INSIDE testAddEnvVariable for variable x1 which is a 3 digit number");
		
		Calculator cal = new Calculator();

		int x = 2;
		int y = 5;

		assertEquals(7, cal.add(x, y));
	}

}
