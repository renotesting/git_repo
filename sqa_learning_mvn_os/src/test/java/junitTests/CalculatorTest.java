package junitTests;

import org.junit.Assert;
import org.junit.Test;

import static_example.Calculator;

public class CalculatorTest {
	Calculator calc = new Calculator();
	
	@Test
	public void testAddint(){
//		int result = calc.add(2,2);
//		if(result == 4){
//			System.out.println("Test case passes");			
//		}else{
//			String errorMsg = "Test case failed, Expected was : 4, actual is"+result;
//			System.out.println(errorMsg);
//			throw new RuntimeException(errorMsg);
//		}
		int result = calc.add(3, 4);
		//expected result = 4, actual result is from "result" variable
		Assert.assertEquals(7, result);
		result = calc.add(-1, 10);
		Assert.assertEquals(9, result);
	}
	
	@Test
	public void testAddfloat(){
		float result = calc.add(3.5F, 5.6F);
		Assert.assertEquals(9.1F, result, 0);
	}
	
	@Test
	public void testMinus(){
		int result = calc.sub(3, 4);
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void testMultiply(){
		int result = calc.mult(5, 6);
		Assert.assertEquals(30, result);
	}

	@Test 
	//assertEquals(double expected, double actual, double delta).
	//If given any delta then it calculates the difference of 
	//expected - actual and then compares the results if they 
	//fall within the delta limit
	public void testDivide01(){
		float result = calc.divide(6.0f, 3.0f);
		Assert.assertEquals(2.0, result, 0);
	}
	
	@Test
	public void testDivide02(){
		//divide() return Float, so that can be using intValue()
		System.out.println("Casted to double: "+ calc.divide(5.0f, 3).intValue());
		System.out.println("No Casted: "+ calc.divide(5, 3));
		
		Float result = calc.divide(5,3);
		int intResult = result.intValue();
		
		//Assert.assertEquals("Expected","Acutal");
		//Assert.assertEquals("Expected","Acutal","Delta");
		System.out.println("Casted to double: "+ calc.divide(5, 3).doubleValue());
		Assert.assertEquals(calc.divide(5, 3).doubleValue(), 1.6, 0.067);
		//Assert.fail();
	}
}
