package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		/*
		 *  Create an array of countries. While retrieving all values from an array 
		 *  print capital for each country. (use 2 different loops)
		 */
		
		
		String[] country= {"Kazakhstan", "Tajikistan", "USA", "Japan"};
		String capital="";
		for (String countries:country) {
			if (countries.equals("Kazakhstan")) {
				capital="Nur-Sultan";
			} else if (countries.equals("Tajikistan")) {
				capital="Kabul";
			} else if (countries.equals("USA")) {
				capital="Washington DC";
			} else if (countries.equals("Japan")) {
				capital="Tokyo";
			}
				System.out.println("The capital of "+countries+" is "+capital);
		} 
			
		
	}
}
