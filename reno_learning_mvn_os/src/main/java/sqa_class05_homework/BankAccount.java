package sqa_class05_homework;

//if a class only properties and setters and getters, no any other logic, 
//the class is called POJO or Java Bean

public class BankAccount {
	private String actHolderName;   
	private Integer accountNumber = 100000000; //accountNumber should only belongs to that object
	
	private static int incrementAccountNumber; //class instance
	
	private float initialAmount;
	
	public BankAccount(float initiAlamount, String actHolderName){
		this.actHolderName = actHolderName;
		this.initialAmount = initiAlamount;
		incrementAccountNumber ++;
		
		this. accountNumber += incrementAccountNumber;
		
		System.out.println("This is constructor when new bank acouunt created: ");
		System.out.println("Account holder name is: "+ this.actHolderName);
		System.out.println("Account number is: "+ this.accountNumber);
		System.out.println("Account initial amount is: "+ this.initialAmount);
		System.out.println("###############################");
	}
	
	public static int getIncrementAccountNumber() {
		return incrementAccountNumber;
	}

	public static void setIncrementAccountNumber(int incrementAccountNumber) {
		BankAccount.incrementAccountNumber = incrementAccountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getActHolderName() {
		return actHolderName;
	}
	public void setActHolderName(String actHolderName) {
		this.actHolderName = actHolderName;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(float initialAmount) {
		this.initialAmount = initialAmount;
	} 
	
	

}
