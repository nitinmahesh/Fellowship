package com.threads;

public class A extends Thread {
	
	public void run()
	{
		
		for (int i = 0; i < 5; i++) {
			
			try {
				System.out.println("i: "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
