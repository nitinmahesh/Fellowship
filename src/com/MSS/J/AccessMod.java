package com.MSS.J;

public class AccessMod {

	static int i = 10;
	
	public void sum()
	{
		System.out.println("A"+i);
	}

	public static void main(String args[])
	{
		//Getting the runtime reference from system
        Runtime runtime = Runtime.getRuntime();
         
        System.out.println("##### Before Heap utilization statistics [Bytes] #####");
         
        //Print used memory
        System.out.println("Used Memory:"
            + (runtime.totalMemory() - runtime.freeMemory()));
 
        //Print free memory
        System.out.println("Free Memory:"
            + runtime.freeMemory() );
         
        //Print total available memory
        System.out.println("Total Memory:" + runtime.totalMemory() );
 
        //Print Maximum available memory
        System.out.println("Max Memory:" + runtime.maxMemory() );
		
		
		AccessMod A = new AccessMod();
		A.sum();
		AccessMod.i = 11;
		A.sum();
		AccessMod A1 = new AccessMod();
		A.sum();
		AccessMod.i = 12;
		A1.sum();
		A.sum();
		
		AccessMod arr[] = new AccessMod[1000];
		//Getting the runtime reference from system
        Runtime runtime1 = Runtime.getRuntime();
		System.out.println("##### After Heap utilization statistics [Bytes] #####");
        
        //Print used memory
        System.out.println("Used Memory:"
            + (runtime1.totalMemory() - runtime1.freeMemory()));
 
        //Print free memory
        System.out.println("Free Memory:"
            + runtime1.freeMemory() );
         
        //Print total available memory
        System.out.println("Total Memory:" + runtime1.totalMemory() );
 
        //Print Maximum available memory
        System.out.println("Max Memory:" + runtime1.maxMemory() );
		doTest();
	}
	
	public static void doTest() {
	    // Main Loop
	    double l;
	    long then = System.currentTimeMillis();
	    for (int i = 0; i < 1; i++) {
	        l = fibImpl1(43);
	    }
	    long now = System.currentTimeMillis();
	    System.out.println("Elapsed time: " + (now - then));
	}
	
	private static double fibImpl1(int n) {
	    if (n < 0) throw new IllegalArgumentException("Must be > 0");
	    if (n == 0) return 0d;
	    if (n == 1) return 1d;
	    double d = fibImpl1(n - 2) + fibImpl1(n  - 1);
	    if (Double.isInfinite(d)) throw new ArithmeticException("Overflow");
	    return d;
	}
}