package testNg;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static_example.Calculator;

public class CalculatorTestNg {
	Logger log = Logger.getLogger(CalculatorTestNg.class);
	Calculator calc = new Calculator();
		
	@Test
	public void testAddByNg(){
		System.out.println("Inside testAddByNg");
		log.info("Inside testAddByNg");
		Assert.assertEquals(calc.add(3, 4), 7);
	}
}
