package com.thread.datasourcesloader;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataSourcesLoader loader = new DataSourcesLoader();
		Thread thread1 = new Thread(loader,"DataSourceThread");
		
		NetworkConnectionsLoader nsloader = new NetworkConnectionsLoader();
		Thread thread2 = new Thread(nsloader,"MainNetworkConncetionsThread");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		
		System.out.printf("Main: Configuration has been loaded: %s\n",new Date());

	}

}
