package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter value for sale: yes or no
		 * if there is no sale---> you are not going for shopping
		 * if there is sale ask user for the item and price of the item
		 * Based on the price you have to calculate the price of the item after discount
		 * if price is less than $20--->apply 10%
		 * if price between $20-$100---> 20%
		 * if price between $100-$500---> 30%
		 * otherwise apply 50% discount
		 * 
		 * After discount __ the price of the item reduced from __ to
		 */

		Scanner scan=new Scanner(System.in);
		String sale;
		double price;
		int discount=0;
		double finalPrice;
		System.out.println("Is there a sale now?");
		sale=scan.nextLine();
		
		if (sale.equals("yes")) {
			System.out.println("What you would like to purchase?");
			String item=scan.nextLine();
			
			System.out.println("What is the price for item?");
			price=scan.nextDouble();
			
			if(price<20) {
				discount=10;
			} else if (price>=20 && price<100) {
				discount=20;
			} else if (price>=100 && price<500) {
				discount=30;
			} else if(price>=500) {
				discount=50;
			} finalPrice=price-(price*discount/100);
			System.out.println("After discount "+discount+" % the price of the "+item 
			+ " reduced from $ "+price+" to "+finalPrice );
		} else {
			System.out.println("Sorry, no shopping today!");
		}
		
	}
}
