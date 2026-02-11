package junit_demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AssertionsDemo {
	
	@Test
	void myTest() {
		System.out.println("INSIDE myTest");
		
		String str = null;
		String str2 = "some value";
		
		assertNull(str);
		assertNotNull(str2);
		
		
		String[] a1 = { "A", "B" };
		String[] a2 = { "A", "B" };
		
		assertArrayEquals(a1, a2); // true
		
		
		int a = 4;
		int b = 0;
		
		assertTrue(a>b);
		
		assertFalse(10>100);
		
		assertSame(str, str);
		//assertNotSame(str, str); // Fail
		assertNotSame(str, str2);
		
		
		assertEquals(5, 5);
		assertNotEquals(5, 6);
		
		// assertThrows(RuntimeException.class, () -> new Calculator()); // false
		assertThrows(RuntimeException.class, () -> { new Calculator().multiply(2, 3); } ); 
	}
	
	
	@Test
	@Disabled
	void test2() {
		System.out.println("INSIDE test2");
	}
	
	
}
