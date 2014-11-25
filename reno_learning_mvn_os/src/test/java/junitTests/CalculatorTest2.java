package junitTests;

import org.junit.Assert;
import org.junit.Test;

import static_example.Calculator;

public class CalculatorTest2 {
	Calculator calc = new Calculator();
	
	@Test
	public void testAddint(){
		int result = Calculator.add(3, 4);
		Assert.assertEquals(7, result);
		result = Calculator.add(-1, 10);
		Assert.assertEquals(9, result);
	}
	
	@Test
	public void testAddfloat(){
		float result = Calculator.add(3.5F, 5.6F);
		Assert.assertEquals(9.1F, result, 0);
	}
	
	@Test
	public void testMinus(){
		int result = calc.sub(3, 4);
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void testMultiply(){
		int result = calc.multiply(5, 6);
		Assert.assertEquals(30, result);
	}

	@Test 
	public void testDivid(){
		double result = calc.divide(6.0d, 3.0d);
		Assert.assertEquals(2.0F, result, 0);
	}
}
