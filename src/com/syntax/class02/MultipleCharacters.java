package com.syntax.class02;

public class MultipleCharacters {

	public static void main(String[] args) {
		char singCharacter='c';
		String name="Dianara"; // string (not a key word. it is a class) - represents multiple characters
		String lastName="Smith";
		String anything="123"; // anything put in "" will be treated as a String !
		String oneLetter="c";
		String oneLetterAndSpace="c ";
		int age=18;
		System.out.println(age);
		// My age is 18
		System.out.println("My age is " + age);
		// My name is Olzhas
		System.out.println("My name is "+name);
		String country="Spain";
		String capital="Madrid";
		//The capital of Spain is Madrid
		
		System.out.println("The capital of "+country+" is "+capital);
		
		String item="shirt";
		double $price=19.99;
		char sign='$';
		//The shirt price is 19.99
		System.out.println("The "+item+" price is "+ sign +$price);
		int day=11;
		String month="July";
		int year=2021;
		System.out.println(day+" "+month);
		//11/July/2021
		
		System.out.println(day+" "+month+ " " +year);
	}

}
