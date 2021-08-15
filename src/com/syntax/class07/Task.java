package com.syntax.class07;

public class Task {

	public static void main(String[] args) {
		
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
			System.out.println("next");
		for(int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
			System.out.println("next");
		for(int i=20; i>=1; i--) {
			if(i%2==0) {
			System.out.println(i);
			}
		}
			System.out.println("---------");
			
		for(int i=20; i>=1; i+=2) {
			System.out.println(i);
			}
			System.out.println("-----------");
			
		for (int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
			System.out.println("-----------");
			
		for (int i=21; i<=50; i++) {
			if(i%2 !=0) {
				System.out.println(i);
			}
		}
	}

}
