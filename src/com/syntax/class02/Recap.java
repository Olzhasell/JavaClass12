package com.syntax.class02;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=1;
		short s=10;
		int i=100; // declare variable and we assign the value
		long l=100000000;
		float f=10.99f;
		double d=111.11;
		char c='@';
		boolean bool=false;
		System.out.println(d);
		
		// how to change a value of the variable ?
		
		//int i=200; we cannot declare same variable twice!!
		
		i=200; //reassign value
		bool=true;
		System.out.println(bool);
		
		//can I do this ?
		int number=i;
		System.out.println(number);
		number=500;
		System.out.println(number);
		//number=1.99; error: type missmatch! Why - variable number can only integet type of value
		//to format code for windows use - ctrl+shift+f
		
	}

}
