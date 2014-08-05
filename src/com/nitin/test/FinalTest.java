package com.nitin.test;


public class FinalTest{
    public static void main(String args[]){
      goOne(3);
      goOne(1,2,3);
    }
    final static void goOne(final int x){
      System.out.print(" int "+x);
    }
    final static void goOne(final int... x){
      System.out.print(" int... "+x[0]);
    }
  }
