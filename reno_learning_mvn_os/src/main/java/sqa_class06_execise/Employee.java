package sqa_class06_execise;

//Exercise 12: 
//•	Create a Person Class with gender, age and name. 
//•	Create an Employee Class with IdNum, exprYr. Define a default and overloaded constructor for Person class and Employee Class. 
//•	Employee class constructor should have all 5 properties.(2 of child and 3 of parent)
//•	Write an Employee class caller. Create 2 objects one without any arguments and other with setting all the properties.
//•	Print out all the properties for both the objects.


public class Employee extends Person{
	private int idNum;
	private int exprYr;
	

	public Employee() {}
	//It's good practice to still define empty default constructor when we override constructors
	
	public Employee(String ssn, String gender, String name, int age, int idNum, int exprYr){
		super(ssn, gender, name, age);
		this.idNum = idNum;
		this.exprYr = exprYr;
		System.out.println("This is Employee overloaded constructor"+"\n");
	}
	
	@Override
	public String eatFood(String intake){
		System.out.println("Empployee eat " +intake);
		return intake.toUpperCase();
	}


	public int getIdNum() {
		return idNum;
	}


	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}


	public int getExprYr() {
		return exprYr;
	}


	public void setExprYr(int exprYr) {
		this.exprYr = exprYr;
	}
	
	

}
