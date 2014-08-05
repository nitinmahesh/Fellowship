package com.excption;

public class B extends RuntimeException{

	public void sub() throws B {
		System.out.println("sub from B");

	}
	
	public void sum() throws B{
		System.out.println("sum from B");

	}
	
}
