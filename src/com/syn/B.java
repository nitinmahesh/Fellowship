package com.syn;

public class B extends Thread {

	Service s;

	B(Service s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		s.show(8);
	}
}
