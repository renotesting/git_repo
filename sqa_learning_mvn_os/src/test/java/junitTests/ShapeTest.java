package junitTests;

import inheritence.Circle;
import inheritence.Shape;
import inheritence.Triangle;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {	
	@Test
	public void testCircleArea(){
		Circle cir = new Circle("myCir",5);
		Assert.assertEquals(79,cir.getArea(),1);
	}
	
	@Test	
	public void testTriangleArea(){
		//Name, base, height
		Shape tr = new Triangle("myTriange",2,2);
		Assert.assertEquals(2,tr.getArea(),0);
	}
}
