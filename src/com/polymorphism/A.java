package com.polymorphism;

public class A {

	public void sum(int i,int j)
	{
		System.out.println("Int,Int");
	}
	public void sum(float i,float j)
	{
		System.out.println("Float,Float");
	}
	public void sum(double i,double j)
	{
		System.out.println("Double,Double");
	}
	public void sum(int i,double j)
	{
		System.out.println("Int,Double");
	}
	public void sum(double i,int j)
	{
		System.out.println("Double,Int");
	}
	public void sum(float i, double j)
	{
		System.out.println("Float,Double");
	}
	public void sum(double i,float j)
	{
		System.out.println("Double,Float");
	}
	public void sum(int i,float j)
	{
		System.out.println("Int,Float");
	}
	public void sum(float i,int j)
	{
		System.out.println("Float,Int");
	}
}
