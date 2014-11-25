package basic_learning;

public class ForLoopExample {

	public static void main(String[] args) {		
		
		int[] intArr = new int[]{1,2,3,4,5,6,7,8,9,10};
		String[] nameArr = new String[]{"india","usa","russia","japan"};
		Integer k = 0;	//wrapper because it is initialized by Class, it will come with many class methods.
		int myInt =0;	//Primitive data type. it will not come with class methods.
		
		
//		System.out.println("Incrementing for loop **************");
//		for(int i=1; i<=10; i++){
//			System.out.println("Value of i is : "+i);
//		}
//		
//		System.out.println("Decrementing for loop **************");
//		for(int j=10; j>0; j--){
//			System.out.println("Value of j is : "+j);
//		}
		
		System.out.println("for each loop **************");
		// For Each loop is a short cut as For Loop for array.
		for(int arrValue : intArr){
			System.out.println("Value of array element is : "+arrValue);
		}
		
		//String[] nameArr = new String[]{"india","usa","russia","japan"};
		for(String countryName : nameArr){
			System.out.println("Name of the country is : "+countryName);			
		}
	}

}
