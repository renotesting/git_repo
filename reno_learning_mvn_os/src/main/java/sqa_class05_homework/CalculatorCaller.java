package sqa_class05_homework;

//Exercise 10: Write a Calculator class. It provides 4 methods. Add, subtract, multiply and divide. 
//All the methods take two integer parameter and performs the respective operation and returns the 
//result. Write a CalculatorCaller class. Call the add, subtract, multiply and divide methods and print
//the result values without creating the object of Calculator class.

public class CalculatorCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculator calc = new Calculator();
		// Others can just use class to invoke the static method, like utility
		// method.
		System.out.println("Calculator addition function returns: "
				+ Calculator.add(5, 10));

		System.out.println("Calculator addition function returns: "
				+ Calculator.minus(5, 10));

		System.out.println("Calculator addition function returns: "
				+ Calculator.multiply(5, 10));

		System.out.println("Calculator addition function returns: "
				+ Calculator.divide(10, 3));

	}

}
