package com.threads;

public class B extends Thread{

	public void run()
	{
		
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("j: "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
