package com.MSS.J.constructor;

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

}
