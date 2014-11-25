package junitTests;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static_example.Calculator;

public class CalculatorTest{
	Calculator calc = new Calculator();
	
	@Test	
	public void testAdd(){

//		int result = calc.add(2,2);
//		if(result == 4){
//			System.out.println("Test case passes");			
//		}else{
//			String errorMsg = "Test case failed, Expected was : 4, actual is"+result;
//			System.out.println(errorMsg);
//			throw new RuntimeException(errorMsg);
//		}
		int result = calc.add(2, 2);
		//actual result = 4, expected result is from "result" variable
		Assert.assertEquals(4,result);			
	}	

	@Test	
	public void testMultiply(){
		System.out.println("inside testMultiply");
		Assert.assertEquals(calc.mult(3, 3), 9);		
	}
	
	@Test
	public void testSubtract(){
		Assert.assertEquals(calc.sub(5, 2), 3);
	}

	@Ignore
	@Test	
	public void testDivide(){
		//assertEquals(double actual, double expected, double delta).
		//If given any delta then it calculates the difference of 
		//expected - actual and then compares the results if they 
		//fall within the delta limit
		System.out.println(calc.divide(5.0f, 2).intValue());
		
		Float result = calc.divide(5,2);
		int intResult = result.intValue();
		
		//Assert.assertEquals("Expected,"Acutal");
		//Assert.assertEquals("Expected,"Acutal","Delta");
		Assert.assertEquals(calc.divide(5, 2).doubleValue(), 2.5,0);
		//Assert.fail();
	}

	@Test(expected = ArithmeticException.class)
	public void divisionWithException() {		
		int i = 1/0;			
	}
//
	@Test(timeout = 1000)
	//timeout tests are usually done to test the performance.
	public void infinity() {  
		while (true);
		//logic to test the performance
	}
//	
//	@Test
//	public void testFail(){		
//		//Assert.assertNull(calc);
//		Assert.assertNotNull(calc);
//		Assert.assertTrue(calc.add(3,3)==6);
//	}
}
