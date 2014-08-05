package com.stack;

public class CharStack {
	
	private char[] charstack;
	private int tos;
	
	CharStack(int size)
	{
		charstack = new char[size];
		tos=-1;
	}
	
	public void push(char ch){charstack[++tos]=ch;}
	public char pop(){return charstack[tos--];}
	public char peek(){return charstack[tos];}
	public boolean isEmpty(){return tos<0;}
	public boolean isFull(){return tos==charstack.length-1;}
	
}
