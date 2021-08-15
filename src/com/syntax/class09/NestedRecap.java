package com.syntax.class09;

public class NestedRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=5; i++) {
			System.out.println("Loop i");
			
			for (int j=1; j<4; j++) {
				System.out.println("Loop j");
			}
		}

		
		System.out.println("------------------------MULTIPLICATION TABLE-----------------------------");
		
		for (int a=1; a<=10; a++) {
			
			for (int b=1; b<=10; b++) {
				System.out.println(a+" X "+b+" = "+(a*b));
			}
				System.out.println("--------------");
		}
		
		for (int h=0; h<24; h++) {
			for(int a=0; a<60; a++) {
				if (h<10 && a<10) {
				System.out.println("0"+h+":0"+a);
			} else if (h>10 && a<10) {
				System.out.println(h+":0"+a);
			} else if (h<10 && a>=10) {
				System.out.println("0"+h+":"+a);
			} else {
				System.out.println(h+":"+a);
			}
		}
	}
	}
}
