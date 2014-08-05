package com.io;

import java.io.ObjectOutputStream;

public class Main3 {

	public static void main(String[] args) throws Exception {

		java.io.FileOutputStream fos = new java.io.FileOutputStream("d://abc.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		A a=new A(10,12);
		oos.writeObject(a);

	}

}
