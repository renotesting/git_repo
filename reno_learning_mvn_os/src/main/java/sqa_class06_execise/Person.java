package sqa_class06_execise;

public class Person {
	private String gender;
	private String name;
	private int age;
	private String ssn;
	
	public Person(){}
	
	public Person(String ssn, String gender, String name, int age){
		this.gender = gender;
		this.name = name;
		this.age=age;		
		this.ssn=ssn;
		System.out.println("This is Person overloaded constructor"+"\n");
	}
	
	public String eatFood(String food){
		System.out.println("Person eat " + food);
		return food.toUpperCase();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
