package sqa_class08_execise;
//Static/Non Static
//a)
//1.	Write a class that has static printName() method
//2.	Define non static method getName() in the same class
//3.	Call getName inside the printName() method.
//
//b)
//1.	in the same class that has non static method printAddress();
//2.	Define a static method getAddress(); in the class.
//3.	Call getAddress() from printAddress() method.


public class StaticNonStaticTest {
	//execise 1
	public static void printName(StaticNonStaticTest sns){
		System.out.println("static method printName called.");
		sns.getName();
	}
	
	private void getName(){
		System.out.println("non static method getName called.");
	}
	
	//execise 2
	private void printAddress(){
		getAddress();
		System.out.println("non static method printAddress called.");
	}
	
	private static void getAddress(){
		System.out.println("static method  getAddress called.");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStaticTest sns = new StaticNonStaticTest();
		sns.printAddress();
		printName(sns);
		
		
		//String:
		//1.	Write a class with main method.
		//2.	Define String str = new String("abc");
		//3.	String test = "abc";
		//4.	String test1 = "abc";
		//5.	String test2 = new String("abc");
		//6.	Compare 2 and 3, 2 and 4, 2 and 5, 3 and 4, 3 and 5, 4 and 5 using "=" operator and also using 
		//       "equal" operator.
	String str = new String ("abc");
	String test = "abc";
	String test1="abc";
	String test2= new String("abc");
	System.out.println("Compare reference of str and test: " + (str == test));
	System.out.println("Compare value of str and test: " + (str.equals(test)));
	
	System.out.println("Compare reference of str and test1: " + (str == test1));
	System.out.println("Compare value of str and test1: " + (str.equals(test1)));
	
	System.out.println("Compare reference of str and test2: " + (str == test2));
	System.out.println("Compare value of str and test2: " + (str.equals(test2)));
	
	System.out.println("Compare reference of test and test1: " + (test == test1));
	System.out.println("Compare value of test and test1: " + (test.equals(test1)));
	
	System.out.println("Compare reference of test and test2: " + (test == test2));
	System.out.println("Compare value of test and test2: " + (test.equals(test2)));
	
	System.out.println("Compare reference of test1 and test2: " + (test1 == test2));
	System.out.println("Compare value of test and test2: " + (test1.equals(test2)));	

	}

}
