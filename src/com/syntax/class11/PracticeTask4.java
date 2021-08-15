package com.syntax.class11;

public class PracticeTask4 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable.

		int i=2;
		int j=7;
		
		i=i+j;
		j=j-i;
		j=-j;
		i=i-j;
		System.out.println(i);
		System.out.println(j);
	}

}
