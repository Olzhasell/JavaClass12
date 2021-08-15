package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		/* I want to say hello 5 times
		 * 
		 * 	for(initialization; condition; increment/decrement)
		*/
		
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
		}
			System.out.println(" Want to print numbers from 1 to 10");
		
		for (int i=1; i<=10; i++) {
			System.out.print(i);
		}
			System.out.println(" Want to print numbers from 20 to 10");
			
		for(int i=20; i>=10; i--) {
			System.out.print(i+" ");
		}
			System.out.println("Want to print even numbers from 10 to 100");
			
		for(int i=10; i<=100; i+=2) {
			System.out.print(i+" ");
		}
		
		
	}
}
