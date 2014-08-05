package com.stack;

public class Test {

	public static void main(String[] args) {
		CharStack stack = new CharStack(5);
		
		CharStack stack1 = new CharStack(10),
				stack2 = new CharStack(5);
		if(stack.isEmpty())
			stack.push('N');
		if(stack.isEmpty())
			stack.push('I');
		if(stack.isEmpty())
			stack.push('T');
		if(stack.isEmpty())
			stack.push('I');
		if(stack.isEmpty())
			stack.push('N');
		if(stack.isEmpty())
			stack.push('M');

		for(int i =0;i<5;i++)
		{
			System.out.println(stack.peek());
			stack.pop();
		}
	}
}
