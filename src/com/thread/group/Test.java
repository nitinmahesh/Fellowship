package com.thread.group;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadGroup group = new ThreadGroup("Tester");
		A a = new A();
		
		for(int i=0;i<5;i++)
		{
			Thread thread = new Thread(group,a);
			System.out.println("count: "+group.activeCount());
			thread.start();
			
		}
		
		group.list();
		//group.suspend();
		System.out.println(group.activeCount());
		
	}

}
