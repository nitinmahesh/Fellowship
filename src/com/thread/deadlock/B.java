package com.thread.deadlock;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class B implements Runnable{

	int j;
	B(int j)
	{
		this.j = j;
	}
	
	synchronized public void run()
	{
		//TimeUnit.SECONDS.equals(1);
		System.out.printf("%s Beginning B %s\n",
				Thread.currentThread().getName(),new Date());
		
		synchronized(this)
		{
			C c = new C(16);
			Thread t4 = new Thread(c,"ThreadFromB");
			t4.start();
			j++;
			try {
				t4.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("%s End B %s\n",
				Thread.currentThread().getName(),new Date());
	}	
}
