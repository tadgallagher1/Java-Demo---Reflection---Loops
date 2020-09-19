package com.demo.loops;

public class ForLoop {

	public static void main(String[] args) {

		// Declare an array of numbers
		int[] numbers = { 3, 4, 5, -5, 0, 12 };

		// For loop example
		for (int j = 0; j < numbers.length; j++) {
			System.out.println("this is our index=>" + j);
			System.out.println("this is our element=>" + numbers[j]);
		}

		// Enhanced for loop example
		
		System.out.println("Now showing output for Enhanced For Loop");

		// for each loop
		for (int number : numbers) {
			System.out.println("this is our element=>" + number);
		}

	}

}
