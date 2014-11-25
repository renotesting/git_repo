package junitTests;


import org.junit.Assert;
import org.junit.Test;

import static_example.Calculator;

public class CalculatorTest {
	Calculator calc = new Calculator();
	
	@Test
	public void testAdd(){
		int result = Calculator.add(1, 2);
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void testMinus(){
		Assert.assertEquals(5, calc.sub(6,1));
	}
	
	@Test
	public void testMultiply(){
		int result = calc.multiply(5, 6);
		Assert.assertEquals(30, result);
	}

	@Test 
	public void testDivid01(){
		double result = calc.divide(6.0d, 3.0d);
		Assert.assertEquals(2.0F, result, 0);
	}
	
	@Test 
	public void testDivid02(){
		Double result = calc.divide(6.0d, 4.0d);
		Assert.assertEquals(2.0F, result.floatValue(), 0.5);
	}
	

}
