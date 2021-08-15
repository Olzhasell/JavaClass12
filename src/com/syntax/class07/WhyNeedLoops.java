package com.syntax.class07;

public class WhyNeedLoops {

	public static void main(String[] args) {
		
		int num=1;
		
		while (num<=100) {
			
			System.out.print(num+" ");
			num++;
			
		}
		
		int i=100;
		
		while (i>=1) {
			System.out.println(i);
			i--;
		}
		
		int z=20;
		while(z<+100) {
			if(z%2 == 0) {
				System.out.println(z);
			}
			z++;
		}
		int v=100;
		while(v>=1) {
			if (v%2 !=0) {
				System.out.println(v);
			}
			v--;
		}
	}
	

}
