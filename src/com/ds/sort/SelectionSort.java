package com.ds.sort;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SelectionSort {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("");
		
		int[] input = {57,48,79,65,15,33,52};
		
		int k=0,temp,smallest;
		boolean swap = false;
		for(int i=0;i<input.length;i++)
		{		
			smallest = input[i];
			swap = false;
			for(int j=i;j<input.length;j++)
			{
				if(input[j]<smallest)
				{
					smallest = input[j];
					k = j;
					swap = true;
				}
			}
			if(swap)
			{
				temp = input[i];
				input[i] = smallest;
				input[k] = temp;
			}
			
		}
		
		for(int num:input)
			System.out.println(num);
	}

}
