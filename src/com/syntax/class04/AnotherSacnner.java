package com.syntax.class04;

import java.util.Scanner;

public class AnotherSacnner {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//let's capture first and last name
		System.out.println("Please enter your name");
		String name=input.nextLine();
		
		System.out.println("Please enter your last name");
		String lastName=input.nextLine();
		
		System.out.println("Please tell me country where are you from");
		String country=input.nextLine();
		
		System.out.println("Nice to meet you "+name+" "+lastName+" from "+country);
		

	}
}
