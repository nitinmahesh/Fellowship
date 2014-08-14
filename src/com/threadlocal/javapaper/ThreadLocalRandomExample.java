package com.threadlocal.javapaper;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//tossing 3 coins
				for (int i = 0; i < 3; i++) {
					final Thread thread = new Thread() {

						public void run() {
							System.out.print(Thread.currentThread().getName() + ":");

							// generating 3 random numbers - random for every thread
							for (int j = 0; j < 3; j++) {
								final int random = ThreadLocalRandom.current().nextInt(
										1, 3);
								System.out.print(random + ",");
							}
							System.out.println();
						}
					};
					thread.start();
					thread.join();
				}
	}

}
