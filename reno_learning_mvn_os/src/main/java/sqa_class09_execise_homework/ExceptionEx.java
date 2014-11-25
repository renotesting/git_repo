package sqa_class09_execise_homework;

//Write a program which takes a parameter of String
//This program throws the exception if name is of more than 10 character.
//write a main method which contains a try block and a catch block.



public class ExceptionEx {

	public static void main(String[] args) {
		try {
			takeString("Reno");
			takeString("HeloKittyHeloKittyHeloKittyHeloKitty"); //halt at within this try block
			takeString("Samuel");							//this step won't be executed.
		} catch (Exception e) {
			e.printStackTrace();	//caller can choose to print out the exception error. Recommended.
		}
		
		try {
			takeString("Samuel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			takeString("ErinDUDU Sister");
		} catch (Exception e) {
			e.printStackTrace();	//caller can choose not to print out the exception error
		}
		
		// takeString("Dongdong"); 
		// have to put "try - catch" for the delegated method. Otherwise, compile error.
		
		try {
			takeString("reno studio");
		} catch (Exception e) {
			e.printStackTrace();	//caller can choose not to print out the exception error
		}
	}
	
	public static void takeString(String str) throws Exception /*declare here*/ {
		int l = str.length();
//		Exception le = new Exception("The name is over 10 charaters. Sorry, "+str);
		if (l < 10)
			System.out.println("The name is: "+str + ". The legnth is "+str.length());
		else {
//			throw le;
			throw new Exception("The name is over 10 charaters. Sorry, "+str);
			//different implementation
		}
	}

}
