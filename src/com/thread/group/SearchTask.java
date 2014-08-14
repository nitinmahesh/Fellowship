package com.thread.group;


import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SearchTask implements Runnable {

	private Result result;
	private static ThreadLocal<Date> startDate = new ThreadLocal<Date>(){
		protected Date initialValue(){
			return new Date();
		} 
	};
	
	public SearchTask(Result result) {		
		this.result = result;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Starting of thread "
				+Thread.currentThread().getName()+" at time "+startDate.get());

		String name=Thread.currentThread().getName();
		System.out.printf("Thread %s: Start\n",name);
		try {
		doTask();
		result.setName(name);
		} catch (InterruptedException e) {
		System.out.printf("Thread %s: Interrupted\n",name);
		return;
		}
		System.out.printf("Thread %s: End ",name);
		System.out.println( "at time "+startDate.get());
	}
	
	private void doTask() throws InterruptedException {
		Random random=new Random((new Date()).getTime());
		int value=(int)(random.nextDouble()*100);
		System.out.printf("Thread %s: %d\n",Thread.currentThread().
		getName(),value);
		TimeUnit.SECONDS.sleep(value);
		}

}
