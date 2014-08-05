package com.varargs;

public class A {

	public static void main(String[] args) {

		String s = new String("Hi-java");
		System.out.println(s.hashCode());
		String s1[]=s.split("-");
		s=s.concat("jjjj");
		
		System.out.println(s.hashCode());
	}

}
