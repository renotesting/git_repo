package sqa_class_excisice_homework;

//Exercise 8 : Create a vehicle class. Properties : String color, int make and String model. 
//Write a default and overloaded constructor that initializes these properties. 
//Write a main method that creates the object by passing these values. 
//Print the values of the properties after the object is created. 

public class Class4_vehicle {

	private String color;
	private int yearOfmake;
	private String model;

	Class4_vehicle(String color, int make, String model) {
		this.color = color;
		this.yearOfmake = make;
		this.model = model;
		System.out.println("The color, make and model is: " + this.color + " "
				+ this.yearOfmake + " " + this.model);
	}

	Class4_vehicle(String color, int make) {
		this(color, make, "NULL");
	}

	Class4_vehicle(int make, String model) {
		this("NULL", make, model);
	}

	Class4_vehicle(int make) {
		this("NULL", make, "NULL");
	}

	Class4_vehicle(String color, String model) {
		this(color, 0, model);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class4_vehicle v1 = new Class4_vehicle(2013);
		Class4_vehicle v2 = new Class4_vehicle("Yellow", 2013);
		Class4_vehicle v3 = new Class4_vehicle(2013, "Ford");
		Class4_vehicle v4 = new Class4_vehicle("Red", 2013, "Civic");
		Class4_vehicle v5 = new Class4_vehicle("White", 0, "NULL");
		Class4_vehicle v6 = new Class4_vehicle("NULL", 0, "Toyota");

	}

}
