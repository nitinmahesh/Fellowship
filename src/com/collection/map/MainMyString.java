package com.collection.map;

import java.util.HashMap;
import java.util.UUID;

public class MainMyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, MyString> hm = new HashMap<Integer, MyString>();
		
		String uuid;
		for(int i=0;i<100;i++)
		{
			uuid = UUID.randomUUID().toString();
			MyString s = new MyString(uuid);
			hm.put(i, s);
		}
		System.out.println(hm.size());
	}

}
