package sqa_class_excisice_homework;

//Exercise 9 : Write a fruit class that defines 4 constructors:
//a)	default constructor
//b)	constructor with 1 argument (String name)
//c)	constructor with 2 arguments (String name, String taste)
//d)	constructor with 3 arguments (String name, String taste, String color);
//Only one of the constructor should have the initialization code and rest of the constructors 
//should use “this(…)” syntax. From the main method, create 4 objects one for each constructor 
//type and print the properties after each object is created.

public class Class4_fruit {
	private String name;
	private String taste;
	private String color;
	
	Class4_fruit(){
		this(null, null, null); //this constructor caller should be the first line within constructor
		System.out.println("Default constructor of fruit."+"\n");
//		this(null, null, null);  //if you put constructor call here will be compilation failed.
	}
	
	Class4_fruit(String name){
		this(name, null, null);
	}
	
	Class4_fruit(String name, String taste){
		this(name, taste, null);
	}
	
	Class4_fruit(String name, String taste, String color){
		this.name = name;
		this.taste = taste;
//		Using setter is NOT the best practice. setter and getter mostly used outside of class
//		this.setColor(color);
		this.color=color;
		System.out.println("The fuite's name is: "+ this.name);
		System.out.println("The fuite's name is: "+ this.taste);
//		System.out.println("The fuite's name is: "+ this.color);
		System.out.println("The fuite's name is: "+ this.getColor());
		System.out.println();
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class4_fruit f1 = new Class4_fruit();
		Class4_fruit f2 = new Class4_fruit("Apple");
		Class4_fruit f3 = new Class4_fruit("Apple", "Machintosh");
		Class4_fruit f4 = new Class4_fruit("Pepper", "Spice", "Green");
		
		

	}

}
