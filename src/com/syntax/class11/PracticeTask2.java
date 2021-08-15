package com.syntax.class11;

public class PracticeTask2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer type where you will store ODD and EVEN numbers.
		 * Develop a program which will identify/print the EVEN numbers ONLY.
		 */
		
		int[][] input= {
				{3,5,7,6},
				{12,2,9,16},
				{14,3,1,17}
		};
		
		 for (int i=0; i<input.length; i++){
		     for (int j=0; j<input[i].length; j++){
		       if (input[i][j]%2==0){
		    	   System.out.println(input[i][j]); 
		    	   }  
		     }	
		     } 	
	}

}
