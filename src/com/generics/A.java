package com.generics;

public class A<T extends Number> {

	T i;
	A(T i)
	{
		this.i = i;
	}
	public void sum()
	{
		System.out.println("we have " + i + " and it is of type: " + i.getClass());
	}
}
