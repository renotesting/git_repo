package sqa_class12_homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sqa_class06_execise.Person;


//3.	HashMap
//a.	Create a class with main method.
//b.	Define a method hashMapSample()
//c.	Create object of this class inside main method and call hashMapSample() method.
//d.	This method should create 10 objects of Person class. Create a hash map and store these objects in 
//		the hash map, ssn of the person should be the key and person object should be the value.
//e.	Write a for loop and print out all the elements of hashmap.


public class HashMap_hw {

	public static void main(String[] args) {
		HashMap_hw hmhw = new HashMap_hw();
		Map<String, Person> hashmapPerson = new HashMap<String, Person>();
		hashmapPerson = hmhw.hashMapSample();
		
		for(Map.Entry<String, Person> entry : hashmapPerson.entrySet()){
			String k = entry.getKey();
			Person p = entry.getValue();
			System.out.println("The map elelment key is: "+k);
			System.out.println("The map elelment value is: "+ p.getName()+", "+p.getAge()+", "+p.getGender());
		}
		
//		Iteration loop
		Set s = hashmapPerson.entrySet();
		Iterator <Set> it = s.iterator();
		while(it.hasNext()){
			Map.Entry hsPerson = (Map.Entry)it.next();
			String k = (String)hsPerson.getKey();
			Person p = (Person)hsPerson.getValue();
			System.out.println("The map's key is: "+ hsPerson.getKey());
			System.out.println("The map's value is: "+p.getAge());	
			System.out.println("The map's value is: "+p.getGender());
			System.out.println("The map's value is: "+p.getName());
			System.out.println("The map's value is: "+p.getSsn());
		}

	}
	
	public Map hashMapSample(){
		Map <String, Person> hsP = new HashMap<String, Person>();
		
//		Person(String ssn, String gender, String name, int age)
//		below style is not recommended.
		hsP.put("333-444-555", new Person("333-444-555", "Male", "Reno", 39));
		
//		Below style is recommended.
		Person p2 = new Person("444-666-777", "Male", "Prashant", 45);
		hsP.put(p2.getSsn(), p2);
		
		Person p3 = new Person("454-366-877", "Male", "Samuel", 3);
		hsP.put(p3.getSsn(), p3);
		
		Person p4 = new Person("654-866-977", "Male", "Jian", 35);
		hsP.put(p4.getSsn(), p4);
		
		Person p5 = new Person("445-466-787", "FeMale", "Feng", 43);
		hsP.put(p5.getSsn(), p5);
		
		Person p6 = new Person("444-666-777", "Male", "Prashant", 45);
		hsP.put(p6.getSsn(), p6);
		
		Person p7 = new Person("984-666-777", "feMale", "Erin", 6);
		hsP.put(p7.getSsn(), p7);
		
		Person p8 = new Person("544-666-777", "Male", "Pras", 45);
		hsP.put(p8.getSsn(), p8);
		
		Person p9 = new Person("444-666-777", "Male", "Prant", 45);
		hsP.put(p9.getSsn(), p9);
		
		Person p10 = new Person("444-666-997", "feMale", "Grace", 45);
		hsP.put(p10.getSsn(), p10);
		
		
		return hsP;
	}

}
