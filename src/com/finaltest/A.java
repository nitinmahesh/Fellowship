package com.finaltest;

public class A {
	
	final int i;
	
	A()
	{
		this.i=0;
		System.out.println("A");
	}	
	A(int i)
	{
		this.i = i;
		System.out.println("A with Int");
	}
	final public void sum()
	{
		System.out.println("A");
	}

}
