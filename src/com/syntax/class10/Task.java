package com.syntax.class10;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan;
		double[] array;
		double sum=0.0;
		
		scan=new Scanner (System.in);
		System.out.println("How many element do you want to store inside an array?");
		int size=scan.nextInt();
		
		array=new double[size];
		
		for(int i=0; i<size; i++) {
			array[i]=scan.nextDouble();
			sum+=array[i];
		}
			System.out.println("Total: "+sum);
	}

}
