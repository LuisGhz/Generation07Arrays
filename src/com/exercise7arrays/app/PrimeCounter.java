package com.exercise7arrays.app;

import java.util.Random;

public class PrimeCounter {

	public static void main(String[] args) {
		//Constant declaration
		final int ELEMENTS_ARRAYS = 10;
		
		//Variables declaration
		boolean isPrime;
		byte counter = 0;
		
		//Arrays declaration
		byte[] myArray1 = new byte[ELEMENTS_ARRAYS];
		
		Random randomNumbers = new Random(System.nanoTime());
		
		
		for (int i = 0; i < ELEMENTS_ARRAYS; i++) {
			myArray1[i] = (byte) randomNumbers.nextInt(14);
		}
		
		for (int i = 0; i < ELEMENTS_ARRAYS; i++) {
			
			isPrime = true;
			
			for (int j = 2; j < myArray1[i]; j++) {
				if ( myArray1[i] % j == 0 ) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) { 
				counter++;
				isPrime = false;
			}
		}
		
		System.out.println("Quiantity of primes numbers is: " + counter);
		
		
		
		
	}

}
