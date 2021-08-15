package com.syntax.class07;

import java.util.Scanner;

public class Lotterey {

	public static void main(String[] args) {
		/*
		 *  we have a secret number (any number from 1 till 20)
		 *  ask user to guess your secret number
		 *  continue guessing a number UNTILL user enters your secret number
		 *   once guessed lets say "Congratz you got it"
		 */

		Scanner in;
		int secretNumber, userNumber;
		secretNumber=15;
		
		in=new Scanner (System.in);
		
		do {
			System.out.println("Please guess my secret number");
			userNumber=in.nextInt();
		} while (userNumber != secretNumber);
			System.out.println("Congratz you got it");
		
	}

}
