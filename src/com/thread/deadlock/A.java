package com.thread.deadlock;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class A implements Runnable{
	
	int i;
	A(int i)
	{
		this.i=i;
	}
	
	synchronized public void run()
	{
		//TimeUnit.SECONDS.equals(1);
		System.out.printf("%s Beginning A %s\n",
				Thread.currentThread().getName(),new Date());
		
		synchronized(this)
		{
			B b = new B(14);
			Thread t3 = new Thread(b,"ThreadFromA");
			t3.start();
			i++;
			try {
				t3.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("%s End A %s\n",
				Thread.currentThread().getName(),new Date());
	}	
}
