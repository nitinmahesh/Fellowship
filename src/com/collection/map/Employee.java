package com.collection.map;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee implements Comparator,Runnable {

	String name;
	int age;
	ArrayList pet;
	
	Employee(String name,int age)
	{
		this.name = name;
		this.age=age;
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String name1 = (String)o1;
		String name2 = (String)o2;
		return name1.compareTo(name);		
	}
	@Override
	public void run() {
		
		
	}
	

}
