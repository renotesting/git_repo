package sqa_class08_execise;

//Exercise 21:
//1.	Write a java program that reverses the given input string.
//2.	For e.g. If I call the function with argument “Prashant”. It should print “tnahsarP”.
//Hint : try to use String function to convert to char array and then loop through the array 
//backwords.


public class Execise21Reverse {

	public static void main(String[] args) {
		reverseString("reno");
		reverseString("Pranshant");

	}
	
	public static void reverseString(String str){
		System.out.println("The original string is: "+str);
		char[] letterArr = null;
		letterArr = str.toCharArray();
		int size = letterArr.length;
		char[] reverseArr = new char[size];
		for (int i = 0; i< size; i++){
			reverseArr[i]= letterArr[size-1-i];
		}
		String reverseString = new String(reverseArr);
		
		System.out.println("The reversed string is: "+reverseString);
	}

}
