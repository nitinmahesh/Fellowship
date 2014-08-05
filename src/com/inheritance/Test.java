package com.inheritance;

public class Test {
	
	public static void main(String args[])
	{
		System.out.println("Inheritance Main");
		
		
		A a = new A();
		A b = new B();
		A c = new C();
		
		//B a1 = new A();
		B b1 = new B();
		B c1 = new C();
		
		//C a2 = new A();
		//C b2 = new B();
		C c2 = new C();
		
		System.out.println(a.hashCode());
		a.sum();
		a.sub();
		
		System.out.println(b.hashCode());
		b.sum();
		b.sub();
		
		System.out.println(c.hashCode());
		c.sum();
		c.sub();
		
		System.out.println(b1.hashCode());
		b1.sum();
		b1.sub();
		
		System.out.println(c1.hashCode());
		c1.sum();
		c1.sub();
		
		System.out.println(c2.hashCode());
		c2.sum();
		c2.sub();
		
		
	}

}
