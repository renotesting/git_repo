package sqa_class06_execise;

//Exercise 13:
//•	Write a Bank class that will have a bank name properties which is shared across all the object. Value of these properties is “MyBank”.
//•	Bank class will have these properties:
//o	Bank address
//o	totalEmployees
//•	Bank class has these function
//o	makeDeposit
//o	withdrawMoney
//•	Branch class extends Bank class, it has these properties : Brach Name, Branch address
//•	Branch class overrides the withdrawMoney function and provides its own implementation.
//•	Write a caller class that creates the object of branch and access all the properties and call all the methods.


public class Bank {
	private static String bankName = "MyBank"; 
	//class object is always independent to the object, so should be define value here rather than in the constructor
	//because constructor attaches to the object.
	private String bankAddress;
	private int totalEmployee;
	
	public Bank(){}; //best practice due to constructor overload
	
	public Bank(String bankAddress, int totalEmployee){
		this.bankAddress = bankAddress;
		this.totalEmployee = totalEmployee;
		System.out.println("Bank constructor called.");
	}
	
	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Bank.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public int getTotalEmployee() {
		return totalEmployee;
	}

	public void setTotalEmployee(int totalEmployee) {
		this.totalEmployee = totalEmployee;
	}

	public void makeDeposit(int i){
		System.out.println("You deposited $"+i+" into "+ bankName+ " at "+ getBankAddress());	
//		System.out.println("You deposit at "+ getBankAddress()+".");	
	}
	
	public void withdrawMoney(int j){
		System.out.println("You withdrawed $"+j+" from " + bankName+" at "+ getBankAddress());
//		System.out.println("You withdrawed from the branch address "+ getBankAddress()+".");	
	}

}
