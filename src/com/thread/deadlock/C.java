package com.thread.deadlock;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class C implements Runnable{
	
	int k;
	C(int k)
	{
		this.k = k;
	}
	
	synchronized public void run()
	{
		//TimeUnit.SECONDS.equals(1);
		System.out.printf("%s Beginning C %s\n",
				Thread.currentThread().getName(),new Date());
		
		synchronized(this)
		{
			A a = new A(18);
			Thread t5 = new Thread(a,"ThreadFromC");
			t5.start();
			try {
				t5.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			k++;
		}
		System.out.printf("%s End C %s\n",
				Thread.currentThread().getName(),new Date());
	}

}
