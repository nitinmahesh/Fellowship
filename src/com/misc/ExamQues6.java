package com.misc;



public class ExamQues6 
{
    static int x; 
    public static boolean tcatch()
    {
        x++; 
        return true; 
    } 
    public static void main(String[] args)
    {
        x=0; 
        if ((tcatch() | tcatch()) || tcatch()) 
            x++; 
        System.out.println(x); 
    } 
}