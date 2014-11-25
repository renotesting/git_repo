package sqa_class08_execise;

import sqa_class07_execise.Shape;

//Exercise 19: 
//1.	Write a class Country
//2.	Properties String countryCode, String countryName, long population, String currency.
//3.	Define overloaded constructor that takes all these arguments as parameter and sets all the properties.
//4.	Write a CountryCaller and a main method.
//5.	Create two-two country objects for each of the below country: Canada, America, Italy, Spain, England. 
//	Use 3 letters code for these countries and set other properties while creating objects
//6.	 Compare the same country objects with each other and print out the results.
//7.	Implement the equals and hashcode using countryCode as criteria.
//8.	Repeat step 6.

public class countryCaller {

	public static void main(String[] args) {
		// String countryCode, String countryName, long population, String
		// currency
		Country can = new Country("CAN", "Canada", 3000000, "$CAD");
		Country qbc = new Country("CAN", "Quebec", 30000, "$CAD");
		Country usa = new Country("USA", "America", 100000000, "$USD");
		Country ity = new Country("ITY", "Italy", 500000, "$ITA");
		Country spa = new Country("SPA", "Spain", 2000000, "$SPA");
		Country eng = new Country("ENG", "England", 8000000, "pound");
		Country ird = new Country("ENG", "Irland", 54000, "pound");

		Country[] countryArr = new Country[] { can, qbc, usa, ity, spa, eng,
				ird };
		
		comparelist(can, countryArr);
		comparelist(usa, countryArr);
		comparelist(ity, countryArr);
		comparelist(spa, countryArr);
		comparelist(eng, countryArr);

		// System.out.println(" Compare "+can.getCountryName()+" and "+usa.getCountryName()+": "+can.equals(usa)+".");
		// System.out.println(" Compare "+can.getCountryName()+" and "+qbc.getCountryName()+": "+can.equals(qbc)+".");
		// System.out.println(" Compare "+can.getCountryName()+" and "+can.getCountryName()+": "+can.equals(can)+".");
		// System.out.println(" Compare "+ity.getCountryName()+" and "+usa.getCountryName()+": "+ity.equals(usa)+".");
		// System.out.println(" Compare "+spa.getCountryName()+" and "+eng.getCountryName()+": "+spa.equals(eng)+".");
		// System.out.println(" Compare "+eng.getCountryName()+" and "+ird.getCountryName()+": "+eng.equals(ird)+".");

	}

	// Shape[] shapeArr= new Shape[]{c1, t1};
	// for (Shape sh: shapeArr){
	// System.out.println("Area of : " + sh.getName()+ " is " + sh.getArea());
	// }

	public static void comparelist(Country country, Country[] countryArr) {

		for (Country countryinstance : countryArr) {
			System.out.println("Compare country " + country.getCountryName()
					+ " with Country Array element " + countryinstance.getCountryName()
					+ ": " + country.equals(countryinstance));
		}

	}

}
