package com.synchronizedtest;

public class Customer implements SavingAccount{
	private int balance; 
	
	Customer(int balance)
	{
		this.balance = balance;
	}
	public void withDraw(int amount)
	{
		balance = balance - amount;
	}
	
	public void deposit(int amount)
	{
		balance = balance + amount;
	}
	
	public int getBalance()
	{
		return this.balance;
	}

}
