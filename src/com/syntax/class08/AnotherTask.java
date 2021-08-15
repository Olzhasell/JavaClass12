package com.syntax.class08;

import java.util.Scanner;

public class AnotherTask {

	public static void main(String[] args) {
		
		Scanner scan;
		
		int start, end, evenSum=0, oddSum=0;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter starting integer");
		start=scan.nextInt();
		System.out.println("Please enter ending integer");
		end=scan.nextInt();
		
		for (int i=start; i<=end; i++) {
			
			if (i%2==0) {
				evenSum+=i;
			} else {
				oddSum+=i;
			}
		}
		System.out.println("Sum of even numbers from range "+start+" till "+end+" equals "+evenSum);
		System.out.println("Sum of even numbers from range "+start+" till "+end+" equals "+oddSum);
	}

}
