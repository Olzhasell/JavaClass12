package com.syntax.class03;

public class moreExapmles {
public static void main(String[] args) {
	double a=30;
	double b=20;
	if (a==b) {
		System.out.println("My numers are equal");// condition always must be a boolean value
	}
	else {
		System.out.println("My numbers are not equal");
	}
		System.out.println("----------------------");
	// if it is a break time--> I will get a coffee otherwise I will focus on the class
	boolean isBreakTime=true;
	if (isBreakTime) {
		System.out.println("I am getting my coffee");
	} else {
		System.out.println("I am focusing on the class");
	}
	/*
	 * if you are hungry--> I will go eat
	 * 			otherwise-->I will go have a tea
	 */
	boolean isHungry=true;
	if (isHungry) {
		System.out.println("I will go eat");}
		else {
			System.out.println("I will go have a tea");
		}

	}
}

