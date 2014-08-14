package com.thread.group.handle.exceptions;

public class MyThreadGroup extends ThreadGroup{

	public MyThreadGroup(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.printf("The thread %s has thrown an Exception\n",t.getId());
		e.printStackTrace(System.out);
		System.out.printf("Terminating the rest of the Threads\n");
		interrupt();
	}
	

}
