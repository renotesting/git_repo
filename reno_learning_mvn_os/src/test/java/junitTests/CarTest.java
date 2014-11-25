package junitTests;

import inheritence.Car;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

public class CarTest {
	
	@Test	
	public void testConstructors(){
		//int engineCap, boolean isFourWheel, int maxSpeed, String color, String model
		Car car = new Car(3,true,120,"black","vw");		
		Assert.assertEquals(3,car.getEngineCap());
	}
	
//	@BeforeClass
//	public static void oneTimeSetUp() {
//		// one-time initialization code	
//		System.out.println("@BeforeClass - oneTimeSetUp");
//	}
//
//	@AfterClass
//	public static void oneTimeTearDown() {
//		// one-time cleanup code
//		System.out.println("@AfterClass - oneTimeTearDown");
//	}
//	
//	@Before
//	public void setUp() {		
//		System.out.println("@Before - setUp");		
//	}
//
//	@After
//	public void tearDown() {		
//		//collection.clear();
//		System.out.println("@After - tearDown");
//	}
}
