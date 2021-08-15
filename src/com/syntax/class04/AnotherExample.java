package com.syntax.class04;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String city=input.nextLine();
		System.out.println("Please enter your city");
		
		System.out.println("Please enter temperature in your city");
		double temp=input.nextDouble();
		System.out.println(temp);
		
		System.out.println("It is "+temp+" in "+city);
	}
}
