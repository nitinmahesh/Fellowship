package com.tcs;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

	static IntList1 first;
	static IntList1 last;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();
		int[] arr = {0,1,3,-2,0,1,0,-3,2,3};
		int length = s.solution(arr);
		System.out.println(length);
	}	
	
	
	/*public int solution(IntList L)
	{
		int length=0;
		
		if(null==L.next)
		{
			return 1;
		}
		
		while(L.next!=null)
		{
			length+=1;
			L = L.next;
		}
		return length+1;
		
		
		
	}*/
public int solution(int[] A) {
/*    int     count = -1;
    HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
	HashMap<String,Integer> hm2 = new HashMap<String,Integer>();
	String s;
    for(int i=0;i<L.length;i++)
    {
    	//0,1,2
    	//A[P]>A[Q] and A[Q]<A[R]
    	if(L[i]>L[i+1] && L[i+1]<L[i+2] )
    	{
    		return Math.min(L[i]-L[i+1], L[i+2]-L[i+1]);
    	}
    	//0,1,3
    	//0,1
    	//0,2
    	//
    	int j=i+1;
    	while(j<L.length-1)
    	{
    		if(L[i]>L[j])
    		{
    			s = i+","+j;
        		hm1.put(s, L[i]-L[j]);
    		}    		
    		j++;
    	}
    	if(i>0)
    	{
	    	j=i+1;
	    	while(j<L.length-2)
	    	{
	    		if(L[j]>L[i+1])
	    		{
	    			s = i+","+j;
	    			hm2.put(s, L[j]-L[i]);
	    		}
	    		j++;
	    	}
    	}
    }
    
    
    
    Set s1 = new HashSet();
    Set s2 = new HashSet();
    s1 = hm1.keySet();
    s2 = hm2.keySet();
    Iterator it1 = s1.iterator();
    Iterator it2 = s2.iterator();
    int deepestDepth = Integer.MIN_VALUE;
    int currentDepth;
    while(it1.hasNext()&&it2.hasNext())
    {
    	currentDepth = Math.min(hm1.get(it1.next()), hm2.get(it2.next()));
    	if(currentDepth>deepestDepth)
    		deepestDepth = currentDepth;
    }
    
    return count;
*/	
	int length = A.length;

	if (length < 3) 
	{
	    return -1;
	}

	int currDep = 0;
	int maxDep = -1; 

	int aP, aQ, aR; 
	int i, j, k; 
	for (i=0; i<length-2; i++) 
	{
	    j=i+1;

	    if (A[i] > A[j]) 
	    {	        
	        aP = A[i];
	        while (j+1<length && A[j]>A[j+1]) 
	        {
	            j++;
	        }
	       
	        aQ = A[j];
	        k = j+1;
	        while (k+1<length && A[k]<A[k+1]) 
	        {
	            k++;
	        }
	        if (k >= length) 
	        {
	            break;
	        }
	       
	        aR = A[k];
	        currDep = (int)Math.min(aP-aQ, aR-aQ);
	        if (currDep > maxDep) 
	        {
	        	maxDep = currDep;
	        }
	        i = k-1;
	    }
	}

	return maxDep;
}


/*public int solution(int[] A){
    int length = A.length;
    
    int[] totalSum = new int[length];

    //At start lets sum whole numbers
    totalSum[0]=A[0];
    for(int i=1; i<length; i++)
    {
        totalSum[i] += totalSum[i-1] + A[i];
    }

    //Sorts sums
    Arrays.sort(totalSum);

    if(totalSum[0] == 0 || totalSum[0] == 1) return totalSum[0];

    //Lets go
    int absSum = Integer.MAX_VALUE;
    for (int i=0; i<length-1; i++)
    {
    	absSum = Math.min(absSum, Math.min(Math.abs(totalSum[i]), totalSum[i+1] - totalSum[i]));
    }

    // check the last one
    absSum = Math.min(absSum, Math.abs(totalSum[length-1]));

    return absSum;
}*/



//CountMultiPlicativePairs

public static int soluton2(int[] A, int[] B) {
	int result = 0;
	int length = A.length;

	double[] C = new double[A.length];

	for (int i = 0; i < length; i++) 
	{
		C[i] = A[i] + (double) B[i] / (double) 1_000_000;
	}

	if (length < 2)
		return 0;

	if (length < 3) 
	{
		if ((BigDecimal.valueOf(C[0]).multiply(BigDecimal.valueOf(C[1])))
				.compareTo(BigDecimal.valueOf(C[0]).add(
						BigDecimal.valueOf(C[1]))) >= 0) 
		{
			return 1;
		} else 
		{
			return 0;
		}
	}
	for (int i = 1; i < length; i++) 
	{
		for (int j = i + 1; j < length; j++) 
		{
			if (C[i] * C[j] >= C[i] + C[j]) 
			{
				result += length - j;
				if (result > 1_000_000_000)
					return 1_000_000_000;
				break;

			}
		}
	}

	return result;
}



}
