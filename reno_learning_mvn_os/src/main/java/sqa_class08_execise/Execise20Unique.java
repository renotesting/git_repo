package sqa_class08_execise;

//Exercise 20: 
//1.	Store all of the objects created in exercise 19 into an array.
//2.	Write a program that will check the objects within this array 
//		and only store the unique objects into a new array.
//3.	Print out the new array.


public class Execise20Unique {

	public static void main(String[] args) {
		Country can = new Country("CAN", "Canada", 3000000, "$CAD");
		Country qbc = new Country("CAN", "Quebec", 30000, "$CAD");
		Country usa = new Country("USA", "America", 100000000, "$USD");
		Country ity = new Country("ITY", "Italy", 500000, "$ITA");
		Country spa = new Country("SPA", "Spain", 2000000, "$SPA");
		Country eng = new Country("ENG", "England", 8000000, "pound");
		Country ird = new Country("ENG", "Irland", 54000, "pound");
		
		Country[] counArr = new Country[]{can, qbc, usa, ity, spa, eng, ird};

	}
	
	public static void makeUniqueArr(Country[] countryArr){
		Country[] uniqueArr = new Country[7];

	}

}
