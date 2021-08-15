package com.syntax.class03;

public class RelationalsOperators {

	public static void main(String[] args) {
		int num=11;
		int num1=11;
		System.out.println(num>num1);
		System.out.println(num!=num1);
		System.out.println(num<num1);
		System.out.println(num==num1);
		System.out.println(num>=num1);
		int a=100;
		int b=190;
		boolean boo=a<b;// result of the relational operators ALWAYS a boolean value( true or false)
		System.out.println(boo);
		System.out.println("--------------");
		System.out.println(a==b);// cheking for equality
		System.out.println(a=b);//reassignin value of var b to a
		System.out.println(a<b);// false cuz we reassined value of a
	}

}
