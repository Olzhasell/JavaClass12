package com.syntax.class07;

public class ForLoopMoreExamples {

	public static void main(String[] args) {
		/*
		 * I want to print multiplication table 
		 * 
		 * 1x1=1;
		 * 1x2=2;
		 * .....
		 * 1x10=10
		 */
		
		int num=1;
		
		for (int i=1; i<=10; i++) {
			System.out.println(num+" X "+i+" = "+num*i);
		}
			System.out.println(" What is the output ?");
			
		int sum=0;
		
		for (int i=1; i<=5; i++) {
			sum=sum+i;
		}
			System.out.println(sum);
		
			System.out.println("-----------------");
		
		sum=0;
		
		for (int i=0; i<=40; i+=10) {
			sum+=i;
		}
			System.out.println(sum);
	}
}
