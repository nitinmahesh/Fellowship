package com.thread.join;

import java.util.Date;

public class B implements Runnable {

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
		System.out.printf("%s Ended %s\n",
				Thread.currentThread().getName(),new Date());
	}
}
