package sqa_class_excisice_homework;

public class Class2 {

	public static void main(String arg[]) {
		compare_Float_Variable(1.3333333333333333f, 1.3333333333333333f);
		compare_Float_Variable(1.7777777f, 1.77777777788888f);
		compare_Float_Variable(3.99999999f, 3.99999f);
		
		compare_Float_Variable(3.0, 3.0);

		logicOperator(2, 5, 4, 7);
		logicOperator(9, 9, 1, 5);
		
		if_Method(5);
		if_Method(11);
		if_Method(10);

		switchMonth(12);
		switchMonth(13);
		switchMonth(4);
		switchMonth(10);
		
	}

	// 1) Write a java class that compares two float variables (1.4 and 2.3 for
	// :
	// equality, non equality, greater than, less than.
	public static void compare_Float_Variable(float a, float b) {
		boolean equality = (a == b);
		boolean nonEquality = (a != b);
		boolean greaterThan = (a > b);
		boolean lessThan = (a < b);

		if (a == b) {
			System.out.println("a and b is " + equality + " and " + nonEquality
					+ '\n');
		} else if (a > b) {
			System.out.println("a is great than b is " + greaterThan + " and "
					+ nonEquality + '\n');
		} else {
			System.out.println("a is less than b is " + lessThan + " and "
					+ nonEquality + '\n');
		}
	}
	
	//Overriding the above method compare_Float_Variable(float a, float b)
	public static void compare_Float_Variable(double a, double b) {
		boolean equality = (a == b);
		boolean nonEquality = (a != b);
		boolean greaterThan = (a > b);
		boolean lessThan = (a < b);

		if (a == b) {
			System.out.println("a and b is " + equality + " and " + nonEquality
					+ '\n');
		} else if (a > b) {
			System.out.println("a is great than b is " + greaterThan + " and "
					+ nonEquality + '\n');
		} else {
			System.out.println("a is less than b is " + lessThan + " and "
					+ nonEquality + '\n');
		}
	}

	// 2) Given a = 2, b=5, c=4 and d=7. Write logical operator || , && and !
	// for
	// check if a+b is greater than 20 or c+d is greater than 10;
	public static void logicOperator(int a, int b, int c, int d) {
		boolean ab_Gt = ((a + b) > 20);
		boolean cd_Gt = ((c + d) > 10);

		boolean or_Operator = (ab_Gt || cd_Gt);
		boolean and_Operator = (ab_Gt && cd_Gt);
		boolean not_Operator = !(ab_Gt || cd_Gt);
		System.out.println("result of or_Operator is : " + or_Operator);
		System.out.println("result of and_Operator is : " + and_Operator);
		System.out
				.println("result of not_Operator is : " + not_Operator + '\n');
	}

	// Homework:
	// 1. Write a function which takes a int parameter and print the message on
	// screen that
	// ¡°number is greater than 10¡± otherwise it should print ¡°number is smaller
	// then 10¡±
	public static void if_Method(int n) {
		if (n > 10) {
			System.out.println(" Number " + n + " is greater than 10"+'\n');
		} else if (n < 10) {
			System.out.println(" Number " + n + " is less than 10"+'\n');
		} else {
			System.out.println(" Number " + n + " is equal to 10"+'\n');
		}
	}

	// 2. Write a java program to print the name of month using switch statement
	public static void switchMonth(int month){
		switch(month){ //this is not supported in JDK6 but in JDK7.
			case 1: 
				System.out.println("this is case 1 "+month);
			case 2: 
				System.out.println("this is case 2 "+month);
			case 3: System.out.println("this is case 3 "+month);break;
			case 4: System.out.println("this is case 4 "+month);break;
			case 5: System.out.println("this is case 5 "+month);break;
			case 6: System.out.println("this is case 6 "+month);break;
			case 7: System.out.println("this is case 7 "+month);break;
			case 8: System.out.println("this is case 8 "+month);break;
			case 9: System.out.println("this is case 9 "+month);break;
			case 10: System.out.println("this is case 10 "+month);break;
			case 11: System.out.println("this is case 11 "+month);break;
			case 12: System.out.println("this is case 12 "+month);break;
			default: System.out.println("this is case default "+month);
		}
	
	}

}
