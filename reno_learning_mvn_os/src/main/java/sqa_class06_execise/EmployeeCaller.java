package sqa_class06_execise;

//Exercise 12: 
//•	Create a Person Class with gender, age and name. 
//•	Create an Employee Class with IdNum, exprYr. Define a default and overloaded constructor for Person class and Employee Class. 
//•	Employee class constructor should have all 5 properties.(2 of child and 3 of parent)
//•	Write an Employee class caller. Create 2 objects one without any arguments and other with setting all the properties.
//•	Print out all the properties for both the objects.


public class EmployeeCaller {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em1=new Employee();
		Employee em2=new Employee("123-435-098", "male", "reno", 38, 11188822, 10);
		
		System.out.println("em1's infomation are:");
		System.out.println("Ssn is: "+em1.getSsn());
		System.out.println("Gener is " + em1.getGender()+" and name is " +em1.getName());
		System.out.println("Age is " + em1.getAge() + " and Id Number is " + em1.getIdNum() + " and YOE is " + em1.getExprYr()+'\n');
		
		System.out.println("em2's infomation are:");
		System.out.println("Ssn is: "+em2.getSsn());
		System.out.println("Gener is " + em2.getGender()+" and name is " +em2.getName());
		System.out.println("Age is " + em2.getAge() + " and Id Number is " + em2.getIdNum() + " and YOE is " + em2.getExprYr()+'\n');

		Person p1=new Person();
		//below is calling override methods.
		p1.eatFood("Apple");
		em1.eatFood("a");
		em2.eatFood("b");
		em1.eatFood("fish");
		em2.eatFood("meat");
	}

}
