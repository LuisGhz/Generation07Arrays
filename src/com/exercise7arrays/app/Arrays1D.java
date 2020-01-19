package com.exercise7arrays.app;

public class Arrays1D {

	public static void main(String[] args) {
		//Constants declaration
		//I want 10 elements because it's a practice project
		final int ELEMENTS_ARRAYS = 10;
		//Variable Declarations
		int[] intArray = new int[ELEMENTS_ARRAYS];
		
		int[] intArray2 = {10, 20, 30, 40, 50, 60};
		
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
	}

}
