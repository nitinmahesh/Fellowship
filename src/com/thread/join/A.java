package com.thread.join;

import java.util.Date;

public class A implements Runnable {

	@Override
	public void run() {
		System.out.printf("%s Started %s\n",
				Thread.currentThread().getName(),new Date());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		B b = new B();
		Thread t2 = new Thread(b,"t2");
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("%s Ended %s\n",
				Thread.currentThread().getName(),new Date());
	}

}
