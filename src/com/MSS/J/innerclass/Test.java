package com.MSS.J.innerclass;

public class Test {

	public static void main(String[] args) {
	
		A a = new A();
		A.B b = a.new B();
		
		a.sum();
		a.sub();
		
		b.sub();
		//b.sum();
	}
	
}
