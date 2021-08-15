package com.syntax.class07;

import java.util.Scanner;

public class TestingReplit {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		boolean thirsty;
		boolean sleepy;
		String drink;
		System.out.println("Are you thirsty?");
		thirsty=input.nextBoolean();
		
		System.out.println("Are you sleepy?");
		sleepy=input.nextBoolean();
		
		if (thirsty==true && sleepy==false) {
			drink="water";
		} else if (thirsty==true && sleepy==true) {
			drink="coffee";
		} else if (thirsty==false && sleepy==true) {
			drink="tea";
		} else {
			drink="nothing";
		} 
			System.out.println("Looks like you need to drink "+drink);
}
}
