package com.MSS.J.innerclass;

public class C extends A{

	
	private C()
	{
		System.out.println("C()");
	}
	C(int i)
	{
		this();
		System.out.println("C(int i)");
	}
	public void sum()
	{
		System.out.println("C");
	}
}
