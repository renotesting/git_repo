package sqa_class05_homework;

public class BankAccountCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1 = new BankAccount(10, "Reno Liu");
		System.out.println("Welcome to XXX Bank "+ba1.getActHolderName());
		System.out.println("your account numer is "+ba1.getAccountNumber());
		System.out.println("you deposit $"+ba1.getInitialAmount()+"when you open account with us."+"\n");
		System.out.println("______________________________________________________________");
		
		
		BankAccount ba2 = new BankAccount(100.99F, "Pranshant Nager");
		System.out.println("Welcome to XXX Bank "+ba2.getActHolderName());
		System.out.println("your account numer is "+ba2.getAccountNumber());
		System.out.println("you deposit $"+ba2.getInitialAmount()+"when you open account with us."+"\n");
		System.out.println("______________________________________________________________");

		BankAccount ba3 = new BankAccount(123.0F, "John Doe");
		System.out.println("Welcome to XXX Bank, "+ba3.getActHolderName());
		System.out.println("your account numer is "+ba3.getAccountNumber());
		System.out.println("you deposit $"+ba3.getInitialAmount()+"when you open account with us."+"\n");
		System.out.println("______________________________________________________________");

		BankAccount ba4 = new BankAccount(188.0F, "Joe Foo");
		System.out.println("Welcome to XXX Bank, "+ba4.getActHolderName());
		System.out.println("your account numer is "+ba4.getAccountNumber());
		System.out.println("you deposit $"+ba4.getInitialAmount()+"when you open account with us."+"\n");
		System.out.println("______________________________________________________________");
		
		BankAccount ba5 = new BankAccount(100000000.0F, "Bat Man");
		System.out.println("Welcome to XXX Bank, "+ba5.getActHolderName());
		System.out.println("your account numer is "+ba5.getAccountNumber());
		System.out.println("you deposit $"+ba5.getInitialAmount()+"when you open account with us."+"\n");
		System.out.println("______________________________________________________________");
	}

}
