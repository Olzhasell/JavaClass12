package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner scan;
		
		
		scan=new Scanner(System.in);
		System.out.println("Enter your height");
		int height=scan.nextInt();
		if (height<60) {
			System.out.println("Short");
		} else if(height>=60 && height<=72) {
			System.out.println("Medium");
		} else if (height>72) {
			System.out.println("Tall");
		} else {System.out.println("Please enter valid input");
		}
		System.out.println("--------------------------------");
		
		
	}

}
