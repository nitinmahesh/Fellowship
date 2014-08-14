package com.thread.group;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class A implements Runnable{

	private static ThreadLocal<Date> startDate =
			new ThreadLocal<Date>(){
		protected Date initialValue()
		{
			return new Date();
		}
	};
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread "+Thread.currentThread().getName()+
				" started at "+startDate.get());
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		startDate.set(new Date());
		System.out.println("Thread "+Thread.currentThread().getName()+
				" now Date is "+startDate.get());
		for(int i=0;i<2;i++)
		{
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		startDate.set(new Date());
		System.out.println("Thread "+Thread.currentThread().getName()+
				" finished on "+startDate.get());
		
	}
	

}
