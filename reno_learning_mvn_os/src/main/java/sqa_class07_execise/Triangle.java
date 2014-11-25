package sqa_class07_execise;

//Exercise 17:  (Abstract classes)
//•	Write an abstract class Shape. 
//•	Define a String variable “name” and a getter for that variable.
//•	Shape will have 1 overloaded constructor that takes the parameter String name and sets that value to name property.
//•	Shape declares one abstract method double getArea()
//•	Write a circle class.
//•	Circle class should extend Shape class.
//•	Have a property double radius and a getter setter for that.
//•	Have one overloaded constructor that takes 2 arguments, (name and radius).
//•	Name argument should be passed to super class constructor. And radius should be assigned to radius property.
//•	Implement a double getArea() method that does the calculation of 3.14 * r*r and return the value.
//•	Implement the Triangle class similar to circle class, only different there is height and width instead of radius and getArea() will have height and width instead of radius.
//•	Create a shape caller class with a main method in it. Create the object of circle class and triangle class and pass name and radius for circle and name, height and width for triangle while creating object.
//•	Call the getName and getArea method and store the values in the variables.
//•	Print out the variables using sysout.


public class Triangle extends Shape {
	private double hight;
	private double width;

	
	public Triangle(String name, double hight, double width){
		super(name);
		this.hight = hight;
		this.width = width;
		System.out.println(super.getName()+ "constructor is created.");
		System.out.println(super.getName()+ " hight is: "+getHight() );
		System.out.println(super.getName()+ " width is: "+getWidth() );
	}
	
	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = 0.5*getHight()*getWidth();
		System.out.println(getName()+"'s area is "+ area);
		return area;
	}

}
