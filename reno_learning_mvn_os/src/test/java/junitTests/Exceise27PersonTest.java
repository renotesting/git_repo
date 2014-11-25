package junitTests;

//Exercise 27: Junit Life cycle:
//1.	Write a test class for testing Person class.
//2.	Write test case for testing weather name is assigned properly in constructor.
//3.	Write test case for testing weather age is assigned properly in constructor.
//4.	Write test case for testing weather ssn is assigned properly in constructor.
//5.	Define a member variable for Person class.
//6.	Before the class loads, initialize the logger
//7.	Before every test case, assign the person reference to a new person object.
//8.	After every test case, assign the person reference to null;

		
import org.junit.Assert;
import org.junit.Test;

import sqa_class06_execise.Person;

//@
//private static final logger= Logger.getLogger(PersonTest);

public class Exceise27PersonTest {
//	Person(String ssn, String gender, String name, int age)
	
	@Test 
	public void testPersonConstructorSsn(){
		Person p = new Person("112-334-009", "Male", "Reno", 35);
		Assert.assertEquals("112-334-009", p.getSsn());
	}
	
	@Test
	public void testPersonConstructorAge(){
		Person p = new Person("112-334-009", "Male", "Reno", 35);
		Assert.assertEquals(35,  p.getAge());
	}
	
	@Test
	public void testPersonConstructorGender(){
		Person p = new Person("112-334-009", "Male", "Reno", 35);
		Assert.assertEquals("Male", p.getGender());
	}

	@Test
	public void testPersonConstructorName(){
		Person p = new Person("112-334-009", "Male", "Reno", 35);
		Assert.assertEquals("Reno", p.getName());
	}
	
	@Test
	public void testPersons00(){
		Person p1 = new Person("112-334-009", "Male", "Reno", 35);
		Person p2 = new Person("112-334-009", "Male", "Reno", 35);
		Assert.assertEquals(p1, p2); 
		//pass when override equals() in Person class
		//fail when use default equals() in Person class.
	}
	
	@Test
	public void testPersonsWithSameReference(){
		Person p1 = new Person("112-334-009", "Male", "Reno", 35);
		Person p2 = p1;  //p2 refers to p1, both object have same reference.
		Assert.assertSame("They might not be the same person", p1, p2);
	}
	
	@Test
	public void testPersonsWithDiffReference(){
		Person p1 = new Person("112-334-009", "Male", "Reno", 35);
		Person p2 = new Person("112-334-009", "Male", "Reno", 35);
		Assert.assertSame("They might not be the same person.", p1, p2);
	}
	
	@Test
	public void testTwoPersonsWDiffRef(){
		Person p1 = new Person("112-334-009", "Male", "Reno", 35);
		Person p2 = new Person("112-334-009", "Male", "Reno", 35);
		Assert.assertNotSame(p1, p2);
	}
	
	@Test
	public void testTwoPersonsWDiffRef01(){
		Person p1 = new Person("112-334-009", "Male", "Reno", 35);
		Person p2 = new Person("112-334-009", "Male", "Re", 40);
		Assert.assertEquals(p1, p2);
	}
	
	@Test
	public void testPersonConstructorWithNull(){
		Person p = new Person(null, "Male", "Reno", 35);
		Assert.assertNull(p.getSsn());
	}
	
	@Test
	public void testPersonConstructorNotNull(){
		Person p = new Person(null, "Male", "Reno", 35);
		Assert.assertNotNull(p.getGender());
	}
	
//	@Test
//	public void testNullPerson(){
//		
//	}


}
