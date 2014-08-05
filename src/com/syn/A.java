package com.syn;

public class A extends Thread {

	Service s;

	A(Service s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		s.show(5);
	}
}
