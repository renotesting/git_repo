package basic_learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionExample {
 //It is recommended to put template with collection when declaration.
 //when dealing with or comparing the elements within collection, always override equals() method.
 private List<String> myArrList;   //Declaration: only define. object is assigned null at this step.
 private Set<Integer> myHashSet;
 private Map<String,String> myHashMap;

 public static void main(String args[]){
  CollectionExample myCollections = new CollectionExample();
  myCollections.arrayListExample();
  myCollections.hashSetExample();
  myCollections.hashMapExample();;
 }
 
 /*
  * ArrayList class is a member of the Java Collections Framework.
  * Its a dynamic array, Accessed using indexes and allows Null
  */
 public void arrayListExample(){
  //instantiate the object of type ArrayList of type String
  myArrList = new ArrayList<String>();  //instantiated: creating a object.
  //start inserting data into Arraylist
  myArrList.add("red");
  myArrList.add("blue");
  myArrList.add("green");
  myArrList.add("yellow");
  myArrList.add("blue");  

  System.out.println("I remove index of 3: "+myArrList.remove(3));
  
  //Read through the arrayList
  System.out.println("Size of my array list is : "+myArrList.size());
  System.out.println("2nd element of my arraylist is : "+myArrList.get(1));  
  for(String myColor : myArrList){  //For-Each loop
   System.out.println("Color is "+myColor);
  }

  //Using an iterator to access any collection (very useful when collection object without index).
  Iterator<String> itr = myArrList.iterator(); 
  //retrieve the object from ArrayList, assigned to itr, whose type is Iterator<String>.   
  while(itr.hasNext()){
   String color = itr.next();
   System.out.println("Color using iterator : "+color);
   if(color.equalsIgnoreCase("blue")){
    itr.remove();
   }   
  }  
  System.out.println("Size of my array list after iterator is : "+myArrList.size());
 }
 
 public void hashSetExample(){
  //instantiate the object of HashSet of type Integer
  myHashSet = new HashSet<Integer>();

  //populate HashSet. HashSet can automatically REMOVE the duplicated elements.
  //this is tricky insert object. By default, use hashcode() to compare the memory referece.
  //so we have to override equals() method to compare the one of the properties in the object.
  //see Execise19Country.jave example
  System.out.println("The HashSet add result is: "+myHashSet.add(100));
  myHashSet.add(250);
  myHashSet.add(null);
  myHashSet.add(250);
  myHashSet.add(-100);
  myHashSet.add(null);
  myHashSet.add(300);

  System.out.println("size of hashset is : "+myHashSet.size());

  //loop through the hashset which has no index 
  for(Integer myInt : myHashSet){
   System.out.println("Integer from loop is "+myInt);
  }

  //use iterator
  Iterator<Integer> setItr = myHashSet.iterator();
  while(setItr.hasNext()){   
   System.out.println("Integer from iterator is : "+setItr.next());   
  }  
 }
 
 public void hashMapExample(){
  myHashMap = new HashMap<String,String>();
  myHashMap.put("name","Joe"); //key - value pair.
  myHashMap.put("age","33");
  myHashMap.put("age","34");  //will override the previous element value due to same keys.
  myHashMap.put("country","India");

  for(Map.Entry<String, String> entry : myHashMap.entrySet()){
   //mapItr is a variable. It's type is Entry type, returned from the entrySet() method.
   String key = entry.getKey();
   String value = entry.getValue();
   System.out.println("key is :"+key+" and value is : "+value);
  }

  Iterator<Entry<String,String>> mapItr = myHashMap.entrySet().iterator();
  //mapItr is a variable. It's type is Entry type, return from the iteration.
  while(mapItr.hasNext()){
   Entry<String,String> entrySet = mapItr.next();
   String key = entrySet.getKey();
   String value = entrySet.getValue();
   System.out.println("Using iterator key is :"+key+" and value is : "+value);
  }  
  System.out.println("Reading directly using key : "+myHashMap.get("name"));  
 }
}