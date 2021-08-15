package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;

		boolean secondDose = true;

		if (vaccine) { // yes
			System.out.println("Let's check how many doses you got");
			if (secondDose) {
				System.out.println("You are fully vaccinated");

			}
		}
		System.out.println("------------------");
		
	/*
	 * Every friday is a movie day
	 * if it is the 13th---> you want to watch a scary movie
	 */
		int day=13;
		boolean isFriday=true;
		
		if(isFriday) {
			System.out.println(" I am going to watch Friday");
			
			if (day==13) {
				System.out.println("Yay, I am watching a scary movie");
			} else {
				System.out.println("I am watching whatever is popular");
			}
		} else {
			System.out.println("I am going to study");
		}
	}

}
