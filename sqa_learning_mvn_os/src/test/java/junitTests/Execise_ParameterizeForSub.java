package junitTests;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static_example.Calculator;

@RunWith(value = Parameterized.class)
public class Execise_ParameterizeForSub {
	private int op1;
	private int op2;
	private int result;
	
	Calculator calc = new Calculator();
	
	public Execise_ParameterizeForSub(int op1, int op2, int result){
		this.op1=op1;
		this.op2=op2;
		this.result=result;
	}
	
	@Test
	public void subTest(){
		Assert.assertEquals(result, Calculator.sub(op1, op2));
	}
	
	@Parameters(name="{index}-getTestdata({0},{1}, {2}")
	public static Collection<Integer[]> getTestdata(){
		Integer[][] testData = null;
		testData = new Integer[][]{{4,2,2},{100,4,96}, {45, 3, 42}};
		List <Integer[]> arrList = Arrays.asList(testData);
		printOutArrList(arrList);
		return arrList;
	}
	
	public static void printOutArrList(List<Integer[]> intArrList){
//		This method to print out 2D array.
		int index = 0;
		for(Integer[] intArr : intArrList){
			System.out.println("Printing array at index : "+index);
			for(Integer arr : intArr){
				System.out.print(arr);
				System.out.print("-");
			}
			index++;
			System.out.println();
		}
	}
	

}
