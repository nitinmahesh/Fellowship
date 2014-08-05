package com.interfaces;

public class Test {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a.sub();
		
		b.sub();
		b.sum();
		
		D d = new D();
		B b1 = new D();
		d.sub();
		d.sum();
		
		b1.sub();
		b1.sum();
		
	}

}
