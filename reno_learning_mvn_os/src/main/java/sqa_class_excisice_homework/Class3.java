package sqa_class_excisice_homework;

import java.util.Random;

public class Class3 {
	public static void main(String arg[]) {

		Class3 cl3 = new Class3();

		// Exercise 1: String
		// Exercise 1 : Write a java program that has 3 string variables:
		// 1) Soccer
		// 2) Football
		// 3) Cricket
		// "Soccer" and "Cricket" are a string literal, "Football" is java
		// object.
		//
		// a) Compare 1 with 2, 1 with 3 and 2 with 3 for value equality and
		// memory address (reference).
		// b) Print out the total characters in 2.
		// c) Print second last character from 3
		// d) Print the position of first 'c' in 1.

		String soccerVar = "Soccer";
		String footballVar = new String("Football");
		String cricketVar = "Cricket";

		System.out.println("Compare soccer and football value and reference "
				+ (soccerVar.equals(footballVar)) + " and "
				+ (soccerVar == footballVar));
		System.out.println("Compare soccer and cricket value and reference "
				+ (soccerVar.equals(cricketVar)) + " and "
				+ (soccerVar == cricketVar));
		System.out.println("Compare cricket and football value and reference "
				+ (cricketVar.equals(footballVar)) + " and "
				+ (cricketVar == footballVar));

		System.out.println("the total characters in 2-Football is: "
				+ footballVar.length());
		System.out.println("the second last characters in 3-Cricket is: "
				+ cricketVar.substring(5, 6));
		System.out.println("the position of first 'c' in 1-Soccer is: "
				+ soccerVar.indexOf('c'));

		// Exercise 2: Loop
		// Exercise 2.1: Write a java program which print a counting from 1 to
		// 100
		for (int i = 1; i <= 100; i++) {
			System.out.println("for loop Print the count: " + i);
		}

		int j = 1;
		while (j <= 100) {
			System.out.println("while loop Print the count: " + j);
			j++;
		}

		int k = 1;
		do {
			System.out.println("do while loop Print the count: " + k);
			k++;
		} while (k <= 100);

		// Exercise 2.3 : CheckPassFail (if-else): Write a program called
		// CheckPassFail which prints "PASS" if
		// the int variable "mark" is more than or equal to 50; or prints "FAIL"
		// otherwise.
		checkPassFail(100);

		// Exercise 3.1:
		// Write a java program which prints all even number from 1 to 100
		// Use Java loops
		// Use % operator to check if a number is even or not.
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("For Loop Print the even number: " + i);
			}
		}

		int p = 1;
		while (p <= 100) {
			if (p % 2 == 0)
				System.out.println("while loop print event number" + p);
			p++;
		}

		int q = 1;
		do {
			if (q % 2 == 0)
				System.out.println("while loop print event number" + q);
			q++;
		} while (q <= 100);

		// Exercise 3.2 : CheckOddEven (if-else): Write a program called
		// CheckOddEven which prints "Odd Number"
		// if the int variable "number" is odd, or "Even Number" otherwise.
		checkOddeven(30);

		// Exercise 4:
		// Declare an array of char which takes 5 element
		char[] charArr = new char[] { '1', '2', '3', '4', '5' };
		printArrLength_Element(charArr);
		// Declare an array of int and initialize element in the array

		// Write a method which takes a parameter of array of int and print the
		// size of any array.
		int[] intArr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		cl3.printArrLength_Element(intArr);

		// Write a method which takes a parameter of array of String and print
		// all the items in array
		String[] stringArr = { "first", "second", "third", "fourth", "fifth",
				"sixth" };
		cl3.printArrLength_Element(stringArr);

		// Exercise 4.1 : Sum (Loop): Write a program called Sum to produce the
		// sum of 1, 2, 3, ..., to an upperbound limit of 2000;
		sumNum(2);
		sumNum(3);
		cl3.sumNum(2000);

		// Exercise 5 : Define a function that accepts two int variables and
		// returns
		// the multiplication value of that. Call this function from the main
		// method
		// and print the return value.
		System.out.println("This is the multiplication: "
				+ multiplication(2, 3));
		System.out.println("This is the multiplication: "
				+ cl3.multiplication(12, 12));

		// Exercise 6 : Define a function that accepts a String array and print
		// only
		// first 3 characters of every string value. Call this function from the
		// main method and pass a String array that has name of any 5 countries.
		String[] country = new String[] { " South Africa", "India ","Canada", "Russia", "England",
				"German", "USA", "US" };
		print3charfromcountry(country);

		// Exercise 7 : In the above example, add the validation to only do
		// substring if string length is greater than 3 and change the case of
		// all the countries to lower. (hint : String.toLowerCase()).
		// Also, remove if there are any leading or trailing white spaces in the
		// name of the country. for e.g. " USA ". hint . String.trim();
		printLowercasefromcountry(country);

	}

	// Exercise 2.3: Write a program called CheckPassFail which prints "PASS" if
	// the int variable "mark" is more than
	// or equal to 50; or prints "FAIL" otherwise.
	public static void checkPassFail(int seed) {
		Random rndGenerate = new Random();
		for (int i = 0; i < seed; i++) {
			int rnd = rndGenerate.nextInt(seed);
			if (rnd >= 50) {
				System.out.println("This random number is PASS: " + rnd);
			} else {
				System.out.println("This random number is FAIL: " + rnd);
			}
		}
	}

	// Exercise 3.1: Write a program called CheckOddEven which prints
	// "Odd Number" if the int variable "number" is odd, or "Even Number"
	// otherwise.
	public static void checkOddeven(int seed) {
		Random rndGen = new Random();
		for (int j = 0; j < seed; j++) {
			int rnd = rndGen.nextInt(seed);
			if (rnd % 2 == 0) {
				System.out.println("The random number is EVEN: " + rnd);
			} else {
				System.out.println("The random number is Odd: " + rnd);
			}
		}

	}

	// Write a method which takes a parameter of array of char and print the
	// size of any array.
	public static void printArrLength_Element(char[] charArr) {
		System.out.println("The length of array is: " + charArr.length);
		for (int i = 0; i < charArr.length; i++)
			System.out.println("The char array element index " + i + " is "
					+ charArr[i]);
	}

	// Write a method which takes a parameter of array of int and print the size
	// of any array.
	// Overloading
	public void printArrLength_Element(int[] intArr) {
		System.out.println("The length of array is: " + intArr.length);
		for (int i = 0; i <= intArr.length - 1; i++)
			System.out.println("The int array element index " + i + " is "
					+ intArr[i]);
	}

	// Write a method which takes a parameter of array of String and print all
	// the items in array
	// Overloading
	public void printArrLength_Element(String[] stringArr) {
		System.out.println("The length of array is: " + stringArr.length);
		for (int i = 0; i < stringArr.length; i++)
			System.out.println("The string array element index " + i + " is: "
					+ stringArr[i]);
	}

	// Exercise 4.1 : Sum (Loop): Write a program called Sum to produce the
	// sum of 1, 2, 3, ..., to an upperbound limit of 2000;
	public static void sumNum(int uplimit) {
		int j = 0;
		for (int i = 1; i <= uplimit; i++) {
			// j+=i;
			j += i;
		}
		System.out.println("This is the sum from 1 to " + uplimit + " : " + j);
	}

	// Exercise 5 : Define a function that accepts two int variables and returns
	// the multiplication value of that. Call this function from the main method
	// and print the return value.
	public static int multiplication(int i, int j) {
		return i * j;
	}

	// Exercise 6 : Define a function that accepts a String array and print only
	// first 3 characters of every string value. Call this function from the
	// main method and pass a String array that has name of any 5 countries.
	public static void print3charfromcountry(String[] country) {
//		for (int i = 0; i < country.length; i++) {
//			country[i] = country[i].substring(0, 3);
//			System.out.println("The new country string looks like: "+ country[i]);
//		}
		for (String strArr : country) {
			if (strArr.length() > 3){
				System.out.println("The new country string looks like: "+ strArr.substring(0, 3).toLowerCase());
			}else{
				System.out.println("The new country string looks like: "+ strArr);
			}
		}
	}
	
	
	// Exercise 7 : In the above example, add the validation to only do
	// substring if string length is greater than 3 and change the case of
	// all the countries to lower. (hint : String.toLowerCase()).
	// Also, remove if there are any leading or trailing white spaces in the
	// name of the country. for e.g. " USA ". hint . String.trim();
	public static void printLowercasefromcountry(String[] country) {
//		for (int i = 0; i < country.length; i++) {
//			country[i] = country[i].substring(0, 3);
//			System.out.println("The new country string looks like: "+ country[i]);
//		}
		for (String strArr : country) {
			if (strArr.length() > 3){
				System.out.println("The new country string looks like: "+ strArr.trim().substring(0, 3).toLowerCase());
				//method chain
			}else{
				System.out.println("The new country string looks like: "+ strArr);
			}
		}
	}

}
