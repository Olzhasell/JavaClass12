package com.syntax.class08;

import java.util.Scanner;

public class BreakKeyWord {

	public static void main(String[] args) {
		System.out.println("Task 2");
		String input;
		do {
			System.out.println("Do you need a credit card ?");
			Scanner scan=new Scanner (System.in);
			input=scan.next();
			
			if(input.equals("yes")) {
				break;
			}
		} while (!input.equals("yes"));
		
		System.out.println("Task 1");
		
		for (int z=1; z<=50; z++) {
			if (z%3==0) {
				continue;
			} System.out.print(z+" ");
		}
	}

}
