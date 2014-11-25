package reno_playground;

//Play with Collection framework. 
//http://www.tutorialspoint.com/java/java_collections.htm


import java.util.*;

public class Playground3_collection {

	public static void main(String[] args) {
		List a1 = new ArrayList();
//		List<String> a1 = new ArrayList<String>();  
//		This is the right way to declare and instantiate a collection type.
//		Otherwise, the warning displaying in the compile time
		a1.add(0, "Zara");
		a1.add(1, "Mahnaz");
		a1.add(2, "Ayan");
		a1.add(1, "Reno");
		System.out.println(" ArrayList Elements");
		System.out.println("\t" + a1);
		for(int i=0; i<a1.size();i++){
			System.out.println("The ArrayList element is index "+ "i"+ ": "+ a1.get(i));
		}

		List<String> l1 = new LinkedList<String>();
//		This is the right way to declare and instantiate a collection type.
//		LinkedList<String> l1;
//		This is the right way to declare a type of collection
//		l1 = new LinkedList();
//		This is the right way to instantiate a type of collection
		
		l1.add(0, "Zara");
		l1.add(1, "Mahnaz");
		l1.add(2, "Ayan");
		l1.add(1, "Gang");
		System.out.println();
		System.out.println(" LinkedList Elements");
		System.out.println("\t" + l1);
		for(String str : l1){
			System.out.println("LinkedList element is: "+str);
		}
		for(int i=0; i<l1.size(); i++){
			System.out.println("LinkedList element is "+ l1.get(i));
		}

		Set<String> s1 = new HashSet<String>();
//		This is the right way to declare and instantiate a collection type.
		s1.add("Zara");
		s1.add("Mahnaz");
		s1.add("Ayan");
		System.out.println();
		System.out.println(" HashSet Elements");
		System.out.println("Can Set add a duplicated element in HashSet: "+ s1.add("Zara"));
		System.out.println("Can set add a new element in HashSet without sorting: "+s1.add("Bingle"));
		System.out.println("Can set add a new element in HashSet without sorting: "+s1.add("York"));
		System.out.println("\t" + s1);
		for(String s:s1){
			System.out.println("HashSet element is "+s);
		}

		
		Set<String> ts1=new TreeSet<String>();
//		TreeSet automatically sort the elements added into
		ts1.add("Ruby");
		ts1.add("Java");
		ts1.add("C#");
		ts1.add("Python");
		ts1.add("Groovy");
		System.out.println();
		System.out.println(" TreeSet Elements");
		System.out.println("\t"+ ts1);
		for(String s:ts1){
			System.out.println("TreeSet element is "+ s);
		}


		Map<String, String> m1 = new HashMap<String, String>();
//		This is the right way to declare and instantiate a collection type.
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		System.out.println();
		System.out.println(" HashMap Elements");
		System.out.print("\t" + m1);
		System.out.println();
		System.out.println("Find Ayan in HashMap: "+m1.get("Ayan"));

	}

}
