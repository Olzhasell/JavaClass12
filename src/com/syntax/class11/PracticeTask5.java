package com.syntax.class11;

public class PracticeTask5 {

	public static void main(String[] args) {
		// Write a program to check whether a given number is prime or not
		
		int[] numbers= {11,13,15,23,26,29};
		
		for (int r=0; r<numbers.length; r++) {
			if (numbers[r]%1==r || numbers[r]%r==0) {
				
			}
			System.out.println(numbers[r]);
		}

	}

}
