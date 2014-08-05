package com.strings;

public class Test_String {


	public static void main(String[] args) {

		String s = new String();
		System.out.println(s.hashCode());
		String s1 = new String("Hello");
		
		String s2 = "Hello Literal";
		String s3 = "Hello Literal";
		String s4 = "Hello Literal Again";
		
		s = "Bye";
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		
		
	}
	
}
