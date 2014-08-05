package com.nitin.test;

public class Pass 
{  
    public static void main(String [] args)  
    {  
       //int x = 5;
       
       Pass p = new Pass();
       X x = p.new X(5);
       p.doStuff(x);  
       System.out.print(" main x = " + x.value);  
    }  

   void doStuff(X z)   
   {  
          System.out.print(" doStuff z = " + z.value++);  
   }  
   
   public class X
   {
	   int value;
	   X(int i)
	   {
		   this.value=i;
	   }
   }
}