package com.synchronizedtest;

/*public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer(1000);
		for(int i=1;i<10;i++)
		{
			Thread t = new Thread(new DepositTransaction(customer),"Thread"+i);
			t.start();
			//System.out.println(customer.getBalance());			
		}
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("At final balance is "+customer.getBalance());
	}

}
*/



public class Main {
public static void main(String[] args) {
	
	
try ( MyResource1 r1 = new MyResource1(); // B
MyResource2 r2 = new MyResource2();) { // B
System.out.print("t ");
}
finally {
System.out.print("f ");
}
}
}

class MyResource1 implements AutoCloseable { 
public void autoClose() { System.out.print("1 "); } // A1
}
class MyResource2 implements AutoCloseable { 
public void autoClose() { System.out.print("2 "); } // A2
}