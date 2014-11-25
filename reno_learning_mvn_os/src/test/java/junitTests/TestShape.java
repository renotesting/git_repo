package junitTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sqa_class07_execise.Circle;
import sqa_class07_execise.Shape;
import sqa_class07_execise.Triangle;

//Exercise 28 : (In Class) JUnit
//1.	Write a test case to test Shape class
//2.	Write test case to test the area of a circle with radius 5.
//3.	Write a test case to test the area of triangle with height = 2 and width=2.

public class TestShape {
	private Shape cir;
	private Shape tri;
	
	@Before
	public void setUp(){
		cir = new Circle("Reno cirlce", 5);
		tri = new Triangle("Reno triagnle", 2, 3);
	}
	
	@After
	public void tearDown(){
		cir = null;
//		System.out.println("Cirle is "+cir.getName());
		tri = null;
//		System.out.println("Triangle is "+ tri.getName());
	}
	
	@Test
	public void testCircle(){
		Assert.assertEquals(78.5d, cir.getArea(), 0);
	}
	
	@Test
	public void testTriangle(){
		Assert.assertEquals(3.0d, tri.getArea(), 0);
	}

}
