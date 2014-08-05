package com.MSS.J;

public class A {
	int i = 10;
	void sum()
	{
		System.out.println("A");
	}
	
	void sub()
	{
		System.out.println("A1");
	}
	
	void sum2(int i,int j)
	{
		System.out.println("sum2");
	}
	
	void sum2(float i,float j)
	{
		System.out.println("sum2 float");
	}
	
	void sum2(double i, double j)
	{
		System.out.println("sum2 double");
	}
	
	void sum2(int i,double j)
	{
		System.out.println("sum2 int double");
	}
	
	void sum2(double i, int j)
	{
		System.out.println("sum2 double int");
	}
}
