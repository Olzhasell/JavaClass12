package com.syntax.class11;

public class PracticeTask1 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] input= {
				{3,5,7,6},
				{12,2,9,16},
				{14,3,1,17}
		};
		
		int sum=0;
		
		for (int r=0; r<input.length; r++) {
			
			for (int c=0; c<input[r].length; c++) {
				sum=sum+input[r][c];
			}
		}
		System.out.println(sum);
	}

}
