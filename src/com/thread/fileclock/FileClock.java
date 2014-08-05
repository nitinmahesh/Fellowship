package com.thread.fileclock;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FileClock implements Runnable{
	
	@Override
	  public void run() {
		for (int i = 0; i < 10; i++) {
		      System.out.printf("%s\n", now("H:mm:ss:SSS"));
		      try {
		        TimeUnit.SECONDS.sleep(1);
		      } catch (InterruptedException e) {
		    	  now("H:mm:ss:SSS");
		        System.out.printf("The FileClock has been interrupted\n");
		      }
		    }
	}
	
	public String now(String format){
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(cal.getTime());
		
	}

}
