package com.polymorphism;

public class Test {

	public static void main(String args[])
	{
		System.out.println("Polymorphism Main");
		
		A a = new A();
		/*a.sum(3,4);
		a.sum(3f,4f);
		a.sum(3.0,4.0);
		a.sum(3,4.0);
		a.sum(3.0,4);
		a.sum(3,4f);
		a.sum(3f,4);
		a.sum(3f,4.0);
		a.sum(3.0,4f);*/
		
		/*B b = new B();
		b.sum(3,4);
		b.sum(3f,4f);
		b.sum(3.0,4.0);
		b.sum(3,4.0);
		b.sum(3.0,4);
		b.sum(3,4f);
		b.sum(3f,4);
		b.sum(3f,4.0);
		b.sum(3.0,4f);*/
		
		A b = new B();
		b.sum(3,4);
		b.sum(3f,4f);
		b.sum(3.0,4.0);
		b.sum(3,4.0);
		b.sum(3.0,4);
		b.sum(3,4f);
		b.sum(3f,4);
		b.sum(3f,4.0);
		b.sum(3.0,4f);
		
		
		
		
	}
}
