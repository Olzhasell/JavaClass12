package com.syntax.class04;

import java.util.Scanner;

public class ManAndWoman {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");
		  String gender=scan.nextLine();
		  System.out.println("Please enter your age");
		  int age=scan.nextInt();
		  if (age>25) {
		    System.out.println("Man");
		  } else if (age<25) {
		    System.out.println("Boy");
		  }

	}

}
