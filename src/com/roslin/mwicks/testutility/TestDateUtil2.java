package com.roslin.mwicks.testutility;

//import java.text.SimpleDateFormat;

import java.util.Date;

import com.roslin.mwicks.utility.CalendarUtil;
import com.roslin.mwicks.utility.DateUtil;
import com.roslin.mwicks.utility.Wrapper;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDateUtil2 {

	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

    		String dateString2 = "29/02/2012";
            
    		System.out.println("dateString2  = " + dateString2);

    		String formatString2 = "dd/MM/yyyy";

    		System.out.println("formatString2  = " + formatString2);

    		SimpleDateFormat format2 = new SimpleDateFormat(formatString2);
            
    		System.out.println("format2.toString() = " + format2.toString());

    		Date parsed2 = format2.parse(dateString2);

    		System.out.println("format2.parse(dateString2)   = " + parsed2.toString());

    		/*
            Date date2 = DateUtil.parse(dateString2); 

            System.out.println("date2.toString()  = " + date2.toString());

            Calendar calendar2 = DateUtil.toCalendar(date2); 

            System.out.println("calendar2.getTime()  = " + calendar2.getTime());
    		 */

            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
