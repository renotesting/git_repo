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


public class Excerise13Caller {

	
	
	//	String bankAddress, int totalEmployee
	Bank bk = new Bank("02 West George St.", 100);
	
	public void printProp(Branch br){
		System.out.println("The bank address is "+br.getBankAddress());
		System.out.println("The branch address is "+br.getBranchAddress());
		System.out.println("The total employee is "+br.getTotalEmployee());
		System.out.println("The branch name is "+br.getBranchName());
		System.out.println("The bank name is "+Branch.getBankName());
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String bankAddress, int totalEmployee, String branchName, String branchAddress
		Branch br1 = new Branch("01 West George St", 5, "Burnaby BRANCH", "1234 Canada Way");
		Branch br2 = new Branch("01 West George St",10,"Vancouver Branch", "123 waterfront st");
		Branch br3 = new Branch("03 W George St.", 3000, "Richmond Branch", "1 Denman St.");
		
		Excerise13Caller exbr= new Excerise13Caller();
		exbr.printProp(br1);
		exbr.printProp(br2);
		exbr.printProp(br3);
		
		
		br1.makeDeposit(30);
		br1.withdrawMoney(20);

		br2.makeDeposit(33);
		br2.withdrawMoney(44);
		

	}

}
