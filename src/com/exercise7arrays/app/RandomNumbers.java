package com.exercise7arrays.app;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		//Constant declaration
		final int ELEMENTS_ARRAYS = 100;
		
		//Variables declaration
		//double generatedNumber = 0;
		//int generatedNumberInt = 0;
		byte generatedNumberByte = 0;
		
		byte evenValues = 0;
		byte oddValues = 0;
		byte zeroValues = 0;
		
		//Arrays declaration
		byte[] myArray1 = new byte[ELEMENTS_ARRAYS];
		
		//Array pseudo random
		//Way 1 By means of random class
		Random randomNumbers = new Random(System.nanoTime());
		/*
		for (int i = 0; i < ELEMENTS_ARRAYS; i++ ) {
			generatedNumberInt = randomNumbers.nextInt(51) + 50;
			System.out.println(generatedNumberInt);
		}
		
		//Wait 2 By means of Math Class
		for (int i = 0; i < ELEMENTS_ARRAYS; i++) {
			generatedNumber = (Math.random() * 51) + 50;
			generatedNumberInt = (int) generatedNumber;
			System.out.println(generatedNumberInt);
		}*/
		
		for (int i = 0; i < myArray1.length; i++) {
			generatedNumberByte = (byte) randomNumbers.nextInt(101);
			myArray1[i] = generatedNumberByte;
		}
		
		//Pass 2 Process
		for (int i = 0; i < ELEMENTS_ARRAYS; i++) {
			if (myArray1[i] == 0) {
				zeroValues++;
			} else if (myArray1[i] % 2 == 0) {
				evenValues++;
			} else if (myArray1[i] % 2 > 0){
				oddValues++;
			}
		}
		
		//Pass 3 Visualization
		
		System.out.println("Zeros quantity: " + zeroValues + "\nEven quiantity: " + evenValues + "\nOdd quantity: " + oddValues);
	}
}
