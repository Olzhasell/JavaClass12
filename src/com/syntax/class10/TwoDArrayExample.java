package com.syntax.class10;

public class TwoDArrayExample {

	public static void main(String[] args) {
		
		String[] [] food= {
				{"borsh", "vareniki", "draniki"},
				{"kebabs", "palaw", "mantu"},
				{"tacos", "burito", "queso", "salsa"},
				{"pasta", "pizza", "bread", "risotto"},
		
		};
		System.out.println(food.length);
		int sizeOf1Array=food[0].length;
		System.out.println(sizeOf1Array);
		
		// how to get all values from 2D array
		
		for(int i=0; i<food.length; i++) { // iterates over rows/arrays
			
			for(int j=0; j<food[i].length; j++) { // iterate over columns/ each element from array
				System.out.println(food[i][j]);
			}                          
		}
		
		System.out.println("-------------------------2 Example------------------------------");
		

		String[] [] name= {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"},
				
		}; 
		System.out.println(name[0] [1]+" "+name [1] [0]);
		System.out.println(name[0] [0]+" "+name [1] [3]);
		System.out.println(name [0] [2]+" "+name [1] [2]);
		System.out.println(name [0] [3]+" "+name [1] [1]);
		
		for(int r=0; r<name.length; r++) {
			for(int c=0; c<name[r].length; c++) {
				System.out.print(name[r][c]+" ");
			}
			System.out.println();
		}
	}
}
