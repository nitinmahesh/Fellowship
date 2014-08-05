package com.MSS.J.innerclass;

public class A {
	
	int count;
	
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int i)");
	}
	public void sum()
	{
		System.out.println("A "+count);
	}	
	
	public void sub()
	{
		System.out.println("A count:"+count);
	}
	class B implements F
	{	
		int localcount;
		
		B()
		{
			System.out.println("B()");
		}
		B(int i)
		{
			System.out.println("B(int i)");
		}
		public void sub()
		{
			System.out.println("B count:"+count+"localcount:"+localcount);
		}
	}
}
