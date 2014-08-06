package com.thread.join;

import java.util.Date;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		A a = new A();
		Thread t1 = new Thread(a,"t1");
		System.out.printf("Main Started %s\n",
				new Date());
		
		t1.start();
		t1.join();
		
		System.out.printf("Main Ended %s\n",
				new Date());
	}

}
