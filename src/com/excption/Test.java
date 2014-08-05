package com.excption;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		try {
			a.sum();
		}	
		/*catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		catch (A e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		finally
		{
			System.out.println("finally");
		}
		
		b.sum();
		
		Date d = new Date("DD-MM-YYYY");
		DateFormat df = null;
		Locale loc = Locale.getDefault();
		System.out.println(loc.getDisplayCountry()
		+ " " + df.format(d));
		
	}
}
