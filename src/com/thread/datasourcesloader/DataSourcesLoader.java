package com.thread.datasourcesloader;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DataSourcesLoader implements Runnable{
	
	@Override
	public void run() {
	System.out.printf("%s Beginning data sources loading: %s\n",
			Thread.currentThread().getName(),new Date());
	NetworkConnectionsLoader nwloader = new NetworkConnectionsLoader();
	Thread thread3 = new Thread(nwloader,"DataNetworkConncetionsThread");
	thread3.start();
	try {
	TimeUnit.SECONDS.sleep(4);
	thread3.join();
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	System.out.printf("%s Data sources loading has finished:	%s\n",
			Thread.currentThread().getName(),new Date());
	}
	

}
