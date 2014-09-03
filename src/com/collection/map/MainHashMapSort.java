package com.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class MainHashMapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		Random rand = new Random(47);
		int next;
		String uuid;
		for(int i=0;i<100;i++)
		{
			next = rand.nextInt(50);
			uuid = UUID.randomUUID().toString();
			hm.put(next, uuid);
		}
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		Set s = hm.keySet();
		TreeSet ts = new TreeSet(s);
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			int i = (Integer)it.next();
			System.out.println("HashMap Key: "+i+" \tValue: "+hm.get(i));
			lhm.put(i, hm.get(i));
			
		}
		
		Set lhms = lhm.keySet();
		Iterator lhmit = lhms.iterator();
		while(lhmit.hasNext())
		{
			int i = (Integer)lhmit.next();
			System.out.println("LinkedHashMap Key: "+i+" \tValue: "+lhm.get(i));
		}
		
		
	}

}
