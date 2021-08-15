package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {

		/*
		 * using scanner to create an array of integer elements
		 */
		
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		
		int[] numbers=new int[size];
		
		for (int i=0; i<size; i++) {
			numbers[i]=scan.nextInt();
		}
		
	}
}
