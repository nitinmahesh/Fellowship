package com.thread.calculator;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.lang.Thread.State;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Thread threads[]=new Thread[10];
	    Thread.State status[]=new Thread.State[10];
	    
	    for (int i=0; i<10; i++){
	        threads[i]=new Thread(new Calculator(i));
	        if ((i%2)==0){
	          threads[i].setPriority(Thread.MAX_PRIORITY);
	        } else {
	          threads[i].setPriority(Thread.MIN_PRIORITY);
	        }
	        threads[i].setName("Thread "+i);
	      }
	    
	    //java.io.FileOutputStream fos = new java.io.FileOutputStream("c://abc.dat");		
		
	    FileWriter file=null;
	    //PrintWriter pw;
	    
		try {
			//file = new FileWriter("C:\\mss\\log.dat");
			file = new FileWriter("C:\\Users\\nitinmah\\Documents\\Nitin\\Mss\\out.txt");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter pw = new BufferedWriter(file);
		//pw = new PrintWriter(file);	
		for (int i=0; i<10; i++){
			pw.write("Main : Status of Thread "+i+" : " + threads[i].getState() + "\n");
			status[i]=threads[i].getState();
	     }
		
		for (int i=0; i<10; i++){
	        threads[i].start();
	      }
		
		boolean finish=false;
	      while (!finish) {
	        for (int i=0; i<10; i++){
	          if (threads[i].getState()!=status[i]) {
	            writeThreadInfo(pw, threads[i],status[i]);
	            status[i]=threads[i].getState();
	          }
	        }      
	        finish=true;
	        for (int i=0; i<10; i++){
	finish=finish &&(threads[i].getState()==State.TERMINATED);
	        }
	      }
	      
	      
	      pw.close();
		
	    		
	    		
	}
	
	private static void writeThreadInfo(BufferedWriter pw, Thread thread, State state) throws IOException {
		pw.write("Main : Id "+ thread.getId() +" - "+thread.getName()+"\n");
		pw.write("Main : Priority: "+ thread.getPriority() +"\n");
		pw.write("Main : Old State: "+ state +"\n");
		pw.write("Main : New State: "+ thread.getState() +"\n");
		pw.write("Main : ************************************\n");
		  }

}
