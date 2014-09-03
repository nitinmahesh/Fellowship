package com.thread.calculator;

public class A implements Runnable{

	int value;
	volatile static int count=1;
	A(int value)
	{
		this.value = value;		
	}
	public void run()
	{
		count++;		
		System.out.println(count + " "+this.value);
		for(int i=0;i<10;i++)
			System.out.println(value+" * "+(i+1)+" = "+(value*(i+1)));
	}
}
