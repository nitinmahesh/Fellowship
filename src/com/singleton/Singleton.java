package com.singleton;

public class Singleton {

	private static Singleton _singleton;
	
	public Singleton getInstance()
	{
		if(_singleton==null)
		{
			synchronized(Singleton.class)
			{
				if(_singleton == null)
					_singleton = new Singleton();
			}
		}
		
		return _singleton;
	}
}
