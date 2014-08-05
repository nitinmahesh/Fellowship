package com.syn;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Service s = new Service();
		Service s1 = new Service();
		
		A a = new A(s);
		B b = new B(s1);
		a.start();
		b.start();
	}

}
