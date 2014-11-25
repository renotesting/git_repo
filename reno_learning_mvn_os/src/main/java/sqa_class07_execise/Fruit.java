package sqa_class07_execise;

//Exercise 15: (Final) 
//Write a class Fruit with properties name, taste and 
//originCountry. originCountry should be a final 
//variable with value = ��USA�� and methods String 
//getSource();, getWeight() 
//getSource() should be a final method. 
//Write a sub class Apple and override getWeight 
//method and also override getSource() method. 

public class Fruit {
	private String name;
	private String taste;
	final String oringalCountry = "USA";
	
	public final String getSource(){
		return oringalCountry;
	}
	
	public double getWeight(double weight){
		return weight;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getOringalCountry() {
		return oringalCountry;
	}
	

}
