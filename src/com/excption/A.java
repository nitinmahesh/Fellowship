package com.excption;

public class A extends Exception{

	
	public void sum() throws A{
		System.out.println("sum from A.");
		
		throw new A();
	}	
	
	
}
