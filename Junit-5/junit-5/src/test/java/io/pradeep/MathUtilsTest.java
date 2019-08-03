package io.pradeep;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When running MathUils")
class MathUtilsTest {

	MathUtils mu;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("This needs to be run before all");
	}
	
	@BeforeEach
	void init() {
		mu=new MathUtils();
	}
	
	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up.....");
	}
	
	@Nested
	@DisplayName("Running nested class AddTest ")
	class AddTest{
		@Test
		@DisplayName("Test to add two Positive numbers")
		void testPAdd() {
			int expected = 2;
			int actual = mu.add(1, 1);
			assertEquals(expected, actual,"Add method should add two numbers");
			System.out.println("Excecuted Add ");		
		}
		
		
		@Test
		@DisplayName("Test to add two Negative numbers")
		void testNAdd() {
			int expected = -2;
			int actual = mu.add(-1, -1);
			assertEquals(expected, actual,"Add method should add two numbers");
			System.out.println("Excecuted Add ");		
		}
		
	}
	
	
	@Test
	@Disabled
	@DisplayName("Test to find quotient of  two numbers")
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mu.divide(1, 0) , "Divide by zero should throw");
		System.out.println("Excecuted divide");		
	}
	
	@Test
	@DisplayName("Test to find product of  two numbers")
	void testMultiply() {
		assertAll(
				()-> assertEquals(4, mu.multiply(2,2)),
				()-> assertEquals(-1, mu.multiply(1,-1)),
				()-> assertEquals(0, mu.multiply(9,0))
				);
		
			
	}
	
	@Test
	@DisplayName("Test to find radius of a circle")
	void testCircleRadius()	{
		assertEquals(314.1592653589793, mu.computeCircleArea(10),"Should return the right radius");
		System.out.println("Excecuted testCircleRadius");
	}

}