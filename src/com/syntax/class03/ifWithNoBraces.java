package com.syntax.class03;

public class ifWithNoBraces {

	public static void main(String[] args) {
		System.out.println("Code starts........");
		int temp=31;
		if (temp<32) 
System.out.println("Water will freeze with temperature "+temp);
	 else  System.out.println("Water will not freeze with temperature "+temp);
			System.out.println("Because it is warm outside");

			/* when IF statement is used without {} 
			 * then JAVA allows only 1 statement for each block!!
			 * meaning 1 line for IF block and 1 line for ELSE block ONLY
			 */
	}

}
