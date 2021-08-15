package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		 int int1;
		 int int2;
		 String word1;
		 String word2;
		 
		Scanner input=new Scanner(System.in);

		System.out.println("Please enter two strings");
		word1=input.next();
		word2=input.next();

		System.out.println("Please enter two numbers");
		int1=input.nextInt();
		int2=input.nextInt();

		if (int1==int2 && word1.equals(word2)) {
		  System.out.println("AND");
		  } else if (int1==int2 || word1.equals(word2)) {
		  System.out.println("OR");
		  } else if (int1!=int2 && !word1.equals(word2)) {
		    System.out.println("NONE");
		  }
	}

}
