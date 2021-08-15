package com.syntax.class03;

public class WhatHappens {

	public static void main(String[] args) {
		// int i=1.99;error
		
		double d=1000;//widening or implicit casting
		System.out.println(d);
		
		int i=(int)1.99;//narrowing or explicit casting
		System.out.println(i);
		
		byte b=(byte)128;//
		System.out.println(b);
		
		int num=20;
		int num1=3;
		System.out.println(num/num1);// we divide 2 int values and they do not have decimals
		
		double num2=20;
		double num3=3;
		System.out.println(num2/num3);//dividing 2 double value 
		
		int n1=20;
		int n2=3;	
		double dd = n1 / n2;
		System.out.println(dd);//we divide 2

	}

}
