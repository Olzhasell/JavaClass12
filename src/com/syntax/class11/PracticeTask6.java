package com.syntax.class11;

public class PracticeTask6 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		int num=0, num1=1, sum;
		System.out.print(num+" "+num1);
		
		for (int i=2; i<10; i++) {
			sum=num+num1;
			System.out.print(" "+sum);
			num=num1;
			num1=sum;
		}
	}

}
