package com.syntax.class11;

public class PracticeTask8 {

	public static void main(String[] args) {
		// Write a Java program to find the second largest number in the array.
		
		int[] input= {10, 20 ,120, 40, 180};
		int largest=0;
		int secondlargest=0;
		
		for (int i=0; i<input.length; i++) {
			if (input[i]>largest) {
				secondlargest=largest;
				largest=input[i];	
			} else if (input[i]>secondlargest) {
				secondlargest=input[i];
			}
		}
			System.out.println(secondlargest);
	}

}
