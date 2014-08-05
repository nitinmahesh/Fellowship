package com.nitin.test;

public class Monster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] people = new boolean[1000];
		int l=1;
		boolean firsttime = true;
		for(int k=0;k<2;k++)
		{
			for(int i=0;i<1000/l;i++)
			{
				if(i%2!=0&& !people[i])
					people[i] = true;
			}
			if(firsttime)
			{
				l++;
				firsttime = false;
			}
				
		}
		
		
		for(int j=0;j<1000;j++)
		{
			if(people[j])
				System.out.println(j);
		}
	}
		

}
