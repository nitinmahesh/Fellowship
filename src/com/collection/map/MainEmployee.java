package com.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedDeque;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Employee, List> hm = new HashMap<Employee,List>();
		
		
		Employee varun = new Employee("Varun Baveja",28); 
		Employee nitin = new Employee("Nitin Mahesh",28);
		Employee kartik = new Employee("Kartik Arya",28);		
		Employee harsh = new Employee("Harsh Chaudhary",28);
		
		List<Employee> varunfriends = new ArrayList<Employee>();
		varunfriends.add(nitin);
		varunfriends.add(kartik);
		varunfriends.add(harsh);
		hm.put(varun,varunfriends);
		
		List<Employee> nitinfriends = new ArrayList<Employee>();
		
		nitinfriends.add(kartik);
		nitinfriends.add(harsh);
		nitinfriends.add(varun);
		hm.put(nitin,nitinfriends);
		
		List<Employee> kartikfriends = new ArrayList<Employee>();
		
		kartikfriends.add(varun);
		kartikfriends.add(harsh);
		kartikfriends.add(nitin);
		hm.put(kartik,kartikfriends);
		
		List<Employee> harshfriends = new ArrayList<Employee>();
		
		harshfriends.add(kartik);
		harshfriends.add(nitin);
		harshfriends.add(varun);
		hm.put(harsh,harshfriends);
		
		for(Employee e : hm.keySet())
		{
			List<Employee> s = hm.get(e);
			
			Iterator it;
			
			it = s.iterator();
			Employee friend;
			System.out.print("\n\nName: "+e.name+"\nAge: "+e.age+"\nFriends: ");
			while(it.hasNext())
			{
				friend = (Employee)it.next();
				System.out.print(friend.name+", ");
			}
		}
		
		for(List s : hm.values())
		{
			Iterator it = s.iterator();
			Employee friend;
			while(it.hasNext())
			{
				friend = (Employee)it.next();
				System.out.print(friend.name+", ");
			}
			
			
		}
		
		ConcurrentLinkedDeque deque = new ConcurrentLinkedDeque();
		Employee e;
		for(int i=0;i<1000;i++)
		{
			e = new Employee("Varun Baveja",new Random(47).nextInt(30));
			Thread t = new Thread(e);
			t.start();
		}
		
		
	}

}
