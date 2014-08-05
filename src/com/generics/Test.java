package com.generics;

public class Test {
	
	
	public static void main(String[] args) {
		
		Short i = 32755;
		Byte j = 126;
		
		A aInt = new A(5);
		A bLong = new A(10l);
		A cShort = new A(i );
		A dByte = new A(j);
		A eFloat = new A(5f);
		A fDouble = new A(6d);
		aInt.sum();
		bLong.sum();
		cShort.sum();
		dByte.sum();
		eFloat.sum();
		fDouble.sum();
	}

}
