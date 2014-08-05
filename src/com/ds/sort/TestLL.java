package com.ds.sort;

public class TestLL {

	static Node root;
	public static void main(String args[])
	{
		root = new Node(0);
		
		System.out.println("Entering 10 in the First Node");
		Node start = new Node(10,null);
		root.next = start;
		System.out.println("Now Entering 20 in the Next Node");
		
		Node next = new Node(20);
		start.next = next;
		
		System.out.println("Now Entering 30,40,50 in the Next Node");
		Node temp;
		for(int i=0;i<3;i++)
		{
			temp = new Node((i+3)*10);
			Insert(temp);
		}
		
		Node traverse;
		traverse = root;
		while(traverse.next!=null)
		{
			System.out.println("Node Value: "+traverse.value);
		}
		
	}
	
	public static void Insert(Node toInsert)
	{
		Node temp;
		temp = root;
		while(temp.next!=null)
			temp = temp.next;
		
		temp.next = toInsert;
	}
}
