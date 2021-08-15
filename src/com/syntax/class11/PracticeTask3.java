package com.syntax.class11;

public class PracticeTask3 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. Develop a program which will calculate
		 * the sum of even and odd numbers for that array.
		 */
		
		int[][] input= {
				{3,5,7,6},
				{12,2,9,16},
				{14,3,1,17}
		};
		int sumEven=0;
		int sumOdd=0;
		
		for (int r=0; r<input.length; r++) {
			for (int c=0; c<input[r].length; c++) {
				if (input[r][c]%2==0) {
					sumEven=sumEven+input[r][c];
				} else if (input[r][c]%2!=0) {
					sumOdd=sumOdd+input[r][c];
				}
			}
		}
			System.out.println(sumEven);
			System.out.println(sumOdd);
	}

}
