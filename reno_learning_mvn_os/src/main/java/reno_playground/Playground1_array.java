package reno_playground;

//Play with Array, to understand reference of Array and Array instantiation.

public class Playground1_array {
	public static void main(String[] args) {
		// We define and instantiate the int array object with size 3
		int[] intArr = new int[3];
		int[] intArr2 = new int[3];
		int[] intArr3 = new int[] { 22, 33, 44 };
		// http://www.tutorialspoint.com/java/java_arrays.htm

		// We start populating individual array elements with values
		intArr[0] = 32;
		intArr[1] = 54;
		intArr[2] = 23;
		//intArr2 = intArr; // This is not the good way to copy contents of one
							// array to another array.

		System.out.println("Compare reference of two array is "
				+ (intArr2 == intArr));
		System.out.println(intArr2);
		System.out.println(intArr);

		System.out.println("Compare referenceo f two array is "
				+ (intArr == intArr3) + intArr + " and " + intArr3);
		intArr3 = intArr;
		System.out.println("Compare referenceo f two array is "
				+ (intArr == intArr3) + " and " + (intArr3 == intArr2));

		// Use For loop would be avoid the same reference
		for (int i = 0; i < intArr.length; i++) {
			intArr2[i] = intArr[i];
			System.out.println("After For Loop: " + intArr2[i]);
		}
		System.out.println("Compare reference of two array is "
				+ (intArr2 == intArr));
		System.out.println(intArr2);
		System.out.println(intArr);

		// We read the individual array elements
		int secondIndex = intArr[1];
		System.out.println("Value at 1st index is : " + intArr[0]);
		System.out.println("Value at 2nd index is : " + secondIndex);

		// We loop through the lenght of array and read every element
		for (int i = 0; i < intArr.length; i++) {
			System.out.println("Value at " + i + " index is : " + intArr[i]);
		}

		// another way to define, instantiate and initialize the array
		int[] anotherIntArr = new int[] { 90, 23, 76 };

		// populate the array using for loop
		for (int i = 0; i < anotherIntArr.length; i++) {
			anotherIntArr[i] = i + 1;
		}
		
	}

}
