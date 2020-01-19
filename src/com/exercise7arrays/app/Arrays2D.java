package com.exercise7arrays.app;

//import java.util.Arrays;

public class Arrays2D {
	public static void main(String[] args) {
		//Constants declaration
		final int ROWS = 10;
		final int COLS = 10;
		
		//Variables declaration
		int count = 1;
		
		//Array 2D
		int[][] matrix = new int[ROWS][COLS];
		
		for (int i = 0; i < ROWS; i++) {
			for (int x = 0; x < COLS; x++) {
				matrix[i][x] = count++;
			}
		}
		
		for (int i = 0; i < ROWS; i++) {
			for (int x = 0; x < COLS; x++) {
				System.out.print(matrix[i][x] + " ");
			}
			System.out.println(" ");
		}
		
	}
}
