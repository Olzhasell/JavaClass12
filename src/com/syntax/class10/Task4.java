package com.syntax.class10;

public class Task4 {

	public static void main(String[] args) {
		
		String[] [] name= {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"},
				}; 
		for(String[] arr:name) {
			for(String a:arr) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}

}
