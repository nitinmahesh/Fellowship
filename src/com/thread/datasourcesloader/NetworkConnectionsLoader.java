package com.thread.datasourcesloader;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NetworkConnectionsLoader implements Runnable{
	
	@Override
	public void run()
	{
		System.out.printf("%s Beginning Network sources loading: %s\n",
				Thread.currentThread().getName(),new Date());
		
		try {
			TimeUnit.SECONDS.sleep(6);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("%s Network sources loading has finished %s\n",
				Thread.currentThread().getName(), new Date());
	}

}
