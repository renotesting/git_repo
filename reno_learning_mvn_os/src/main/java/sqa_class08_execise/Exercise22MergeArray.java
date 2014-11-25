package sqa_class08_execise;

import java.util.Random;
import java.util.*;

//Exercise22
//1.	Define 2 integer array
//a.	Arr1 = {345,32,65,24,65,765,242,765,43}
//b.	Arr2 = {3,547,65,243,877,34,98,543,23,32,24}
//2.	Write a function to merge these 2 arrays into 1 array in ascending order and store only unique numbers in it.
//3.	Print the array.

public class Exercise22MergeArray {

	public static void main(String args[]) {
		Integer[] intArr1 = new Integer[4];
		Integer[] intArr2 = new Integer[5];

		Random randomGenerator = new Random();
		for (int i = 0; i < intArr1.length; i++) {
			intArr1[i] = randomGenerator.nextInt(100);
			System.out.println(" The intArr1 elements are: " + intArr1[i]);
		}
		
		for (int i = 0; i < intArr2.length; i++) {
			intArr2[i] = randomGenerator.nextInt(100);
			System.out.println(" The intArr2 elements are: " + intArr2[i]);
		}
		
		merge(intArr1, intArr2);
		
	}

	public static void merge(Integer[] arr1, Integer[] arr2) {
		int size = arr1.length + arr2.length;
		Integer[] masterArr = new Integer[size];

		for (int j = 0; j < arr1.length; j++) {
			masterArr[j] = arr1[j];
		}

		for (int j = 0; j < arr2.length; j++) {
			masterArr[arr1.length + j] = arr2[j];
		}

		for (Integer arr : masterArr) {
			System.out.println(" The MasterArr elements are: " + arr);
		}
	}

}
