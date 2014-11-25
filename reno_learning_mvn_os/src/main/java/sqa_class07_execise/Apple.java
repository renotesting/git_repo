package sqa_class07_execise;

//Exercise 15: (Final) 
//Write a class Fruit with properties name, taste and 
//originCountry. originCountry should be a final 
//variable with value = ��USA�� and methods String 
//getSource();, getWeight() 
//getSource() should be a final method. 
//Write a sub class Apple and override getWeight 
//method and also override getSource() method. 

public class Apple extends Fruit {
	@Override
	public double getWeight(double weight){
		double w = weight+2;
		System.out.println("Apple override weight: "+ w);
		return w;
	}
	
//	@Override
//	public String getSource(){
//		return oringalCountry;
//	}
//	This is wrong because you can't override a static method.
}