package exercise;

import java.util.HashMap;
import java.util.Map;

import class_object.Person;

public class Exercise26HashMap {

	public static void main(String[] args) {
		Exercise26HashMap obj = new Exercise26HashMap();
		obj.hashMapSample();
	}
	
	public void hashMapSample(){
		Map<String,Person> personMap = new HashMap<String,Person>(); 
		
		Person p1 = new Person("p1",32,"243-543-5343");		
		personMap.put(p1.getSsn(), p1);
		//personMap.put("243-543-5343", p1);
		
		Person p2 = new Person();
		p2.setName("p2");
		p2.setAge(33);
		p2.setSsn("345-354-7575");
		personMap.put(p2.getSsn(), p2);
		
		//Similarly create p3 to p9		
		Person p10 = new Person("p10",52,"543-788-6889");		
		personMap.put(p10.getSsn(), p10);
		
		for(Map.Entry<String, Person> entry : personMap.entrySet()){
			String key = entry.getKey();
			Person p = entry.getValue();
			System.out.println("*************************");
			System.out.println("Key is : "+key);
			System.out.println("Person name is : "+p.getName()+", age is : "+p.getAge());
		}
	}

}
