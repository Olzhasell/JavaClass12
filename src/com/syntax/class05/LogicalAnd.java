package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		boolean understandJava=false;
		boolean enjoy=false;
		if (understandJava && enjoy) {
			System.out.println("That is awesome");
		} else {
			System.out.println("Please try to spend more time with Java");
		}
		
		/*
		 * declare a number
		 * if number is larger than 1 and smaller than 10 --> Small
		 * if number is larger than 10 but smaller than 100 --> Medium
		 * if number is larger than 100 but smaller than 1000 --> large
		 * otherwise number is huge
		 */
		
		int num=54;
		
		if (num>1 && num<10) {
			System.out.println("Number is small");
		} else if (num>10 && num<100) {
			System.out.println("Number is medium");
		} else if (num>100 && num<1000) {
			System.out.println("Number is large");
		} else {
			System.out.println("Number is HUGE");
		}
	}

}
