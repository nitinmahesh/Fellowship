package com.thread.calculator;
import java.util.*;
public class MyMain {
	public static void main(String... args) throws InterruptedException
	{
		Collection<String> c =                         
                Arrays.asList("One", "Two", "Three");  
        c.forEach(s -> System.out.println(s)); 
		for(int i=0;i<10;i++)
		{
			Thread t = new Thread(new A(i+2));
			t.start();
			t.join();
		}
	}
}