package com.polymorphism;

public class B extends A{

	public void sum(int i,int j)
	{
		System.out.println("From B Int,Int");
	}
	public void sum(float i,float j)
	{
		System.out.println("From B Float,Float");
	}
	public void sum(double i,double j)
	{
		System.out.println("From B Double,Double");
	}
	public void sum(int i,double j)
	{
		System.out.println("From B Int,Double");
	}
	public void sum(double i,int j)
	{
		System.out.println("From B Double,Int");
	}
	public void sum(float i, double j)
	{
		System.out.println("From B Float,Double");
	}
	public void sum(double i,float j)
	{
		System.out.println("From B Double,Float");
	}
	public void sum(int i,float j)
	{
		System.out.println("From B Int,Float");
	}
	public void sum(float i,int j)
	{
		System.out.println("From B Float,Int");
	}
}
