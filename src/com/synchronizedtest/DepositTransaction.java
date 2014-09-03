package com.synchronizedtest;

public class DepositTransaction implements Runnable{
	
	Customer customer;
	DepositTransaction(Customer customer)
	{
		this.customer = customer;
	}	
	public void run()
	{			
			System.out.println("balance is "+customer.getBalance()+" Depositing "+ 100);
			
			customer.deposit(100);
			
			try
			{
				Thread.sleep(customer.getBalance()/10);
			}
			catch(Exception e )
			{
				e.printStackTrace();
			}
			System.out.println("balance is "+customer.getBalance()+" Withdraw "+ 100);
			
			customer.withDraw(100);
	}
}
