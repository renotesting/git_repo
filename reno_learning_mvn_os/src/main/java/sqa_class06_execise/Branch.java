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

public class Branch extends Bank {
	private String branchName;
	private String branchAddress;
	
	public Branch(){};//best practice. 
	
	public Branch(String bankAddress, int totalEmployee, String branchName, String branchAddress){
		super(bankAddress, totalEmployee);
		this.branchName = branchName;
		this.branchAddress = branchAddress;
		System.out.println("Branch constructor called.");	
	}
	
	@Override  //best practice to put annotation for the overriding methods.
	public void makeDeposit(int i){
		System.out.println("You deposited $"+i+" into " + getBankName() + " at "  + getBranchName()+" where the branch address is "+ getBranchAddress()+".");	
//		System.out.println("You just deposit to the branch address is at "  + getBranchName()+".");
	}
	
	public void withdrawMoney(int j){
		System.out.println("You withdrawed $"+j+" from "+getBankName() + " at "  + getBranchName()+" where the branch address is "+ getBranchAddress()+".");
//		System.out.println("You just withdraw from the branch address is at "  + getBranchAddress()+".");
	}
	
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String banchName) {
		this.branchName = banchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String bachAddress) {
		this.branchAddress = bachAddress;
	}


	
	

}
