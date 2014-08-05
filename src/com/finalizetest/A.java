package com.finalizetest;

public class A {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.err.println("I am Dying");
	}
}
