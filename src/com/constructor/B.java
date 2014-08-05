package com.constructor;

public class B extends A{

	
	B()
	{
		super(10);
		/*this.A();*/
		System.out.println("B");
	}
	B(int i)
	{
		super(10);
		System.out.println("B with Int");
	}
	void B()
	{
		System.out.println("B with Void");
	}
}
