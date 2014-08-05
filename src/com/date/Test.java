package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	
	
	public static void main(String[] args) {
		String DATE_FORMAT_NOW = "yyyy-MM-dd";
	    Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
	String stringDate = sdf.format(date );
	
	    try{
	        Date date2 = sdf.parse(stringDate);
	    }catch(ParseException e){
	     //Exception handling
	    	e.printStackTrace();
	    }catch(Exception e){
	     //handle exception
	    	e.printStackTrace();
	    }
	}

}
