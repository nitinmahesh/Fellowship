package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		FileInputStream fin=new FileInputStream("d://abc.dat");
		ObjectInputStream ois=new ObjectInputStream(fin);
		A a=(A)ois.readObject();
		System.out.println(a.i);
		System.out.println(a.j);
	}

}
