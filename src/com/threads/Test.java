package com.threads;

public class Test {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.run();
		a.start();
		b.start();
		
	}
	
	

}
