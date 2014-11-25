package reno_playground;

//Play with Enumeration, Vector,  
//http://www.tutorialspoint.com/java/java_data_structures.htm
//The Enumeration interface isn't itself a data structure, but it is very important within the context of 
//other data structures. The Enumeration interface defines a means to retrieve successive elements from a data structure.

//For example, Enumeration defines a method called nextElement that is used to get the next element 
//in a data structure (i.e. Vector) that contains multiple elements.

import java.util.Enumeration;
import java.util.Vector;



public class Playground2_enumeratioin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr=new String[]{"Sheng", "Ta"};
		
		Enumeration days;
		
		Vector dayNames = new Vector();
		System.out.println("This vector's size is "+dayNames.capacity());
		System.out.println("This vector's size is "+dayNames.size()); //Returns the number of components in this vector.
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		System.out.println("This vector's size is "+dayNames.capacity());
		System.out.println("This vector's size is "+dayNames.size());
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		System.out.println("This vector's size is "+dayNames.capacity());
		System.out.println("This vector's size is "+dayNames.size());

		days = dayNames.elements(); // Vector returns an enumeration of the components of this vector.
		
		while (days.hasMoreElements()) {
			System.out.println("The vector's element is: "+days.nextElement());
		}
		
		dayNames.addElement(7.0);
		dayNames.addElement(1.3F);
		System.out.println("This vector's size is "+dayNames.capacity());
		
		while (days.hasMoreElements()) {
			System.out.println("The vector's element is: "+days.nextElement() + " ");
		}
		
		dayNames.clear();	//Removes all of the elements from this Vector.	
		System.out.println("This vector's capacity is "+dayNames.capacity());
		System.out.println("This vector's size is "+dayNames.size());
		System.out.println("This vector is empty: "+dayNames.isEmpty());
		
		while (days.hasMoreElements()) {
			System.out.println("The vector's element is: "+days.nextElement() + " ");
		}
		
		dayNames.addElement(7.0);
		dayNames.addElement(1.3F);
		dayNames.add(strArr);
		System.out.println("This vector's size is "+dayNames.size());
		days = dayNames.elements();
		while (days.hasMoreElements()) {
			System.out.println("The vector's element is: "+days.nextElement());
		}
	}
}
