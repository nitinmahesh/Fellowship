package com.io;


public class A extends B {

	transient int i;
	int j;

	A(int i,int j) {
		this.i = i;
		this.j=j;
	}
}
