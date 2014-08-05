package com.syn;

public class Service {
	
	static public void show(int num) {

		for (int i = 1; i < 11; i++) {

			System.out.println(num * i);

			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
