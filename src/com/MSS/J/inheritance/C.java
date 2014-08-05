package com.MSS.J.inheritance;

public class C {
	
	private C()
	{
		System.out.println("C()");
	}
	C(int i)
	{
		this();
		System.out.println("C(int i)");
	}
	public void multi()
	{
		System.out.println("C");
	}

}
