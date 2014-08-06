package com.thread.deadlock;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		System.out.printf("Main:started %s\n",new Date());
		A a = new A(10);
		//B b = new B(12);
		
		Thread t1 = new Thread(a,"ThreadAFromMain");
		//Thread t2 = new Thread(b,"ThreadBFromMain");
		
		t1.start();
		//t2.start();
		
		System.out.printf("Main: Ended: %s\n",new Date());
		
	}
}
