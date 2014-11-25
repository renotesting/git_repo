package exercise;

public class Exercise22MergeArray {
	/*
	 * Step 1:
	 * Define a method that will just merge 2 arrays. 
	 * 	-Define master array with size of both the arrays.
	 * 	-Loop through first array and store that in master array
	 * 	-Loop through second array and store that in master array.
	 * 
	 * Step 2:
	 * Define a method that will take an array as parameter and sort it asc.
	 * 	-hint You will need 2 loops to sort
	 * 	-loop through the array take first element, compare it with all remaining
	 * 	- if any element is lower than next element keep it on left.
	 * 
	 * Step 3: 
	 * 	Remove duplicates and store the entries into a new array
	 * 	-Loop through the array, if previous entry is == next then it is duplicate.
	 * don't copy that into new array
	 */
	public static void main(String args[]){
		int[] testArr = new int[]{54,576,432,8843,8,34,2};
		
//		for(int i=0; i<testArr.length; i++){			
//			for(int j=1; j<testArr.length-i; j++){
//				if(testArr[j-1] > testArr[j]){
//					int temp = testArr[j-1];
//			        testArr[j-1] = testArr[j];
//			        testArr[j] = temp;
//				}				
//			}			
//		}
		
		//compare 2 arrays.
		
		for(Integer ele : testArr){
			System.out.println(ele);
		}
	}
}
