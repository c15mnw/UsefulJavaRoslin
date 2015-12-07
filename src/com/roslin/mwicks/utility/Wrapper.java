/*
*----------------------------------------------------------------------------------------------
* Project:      UsefulJava
*
* Title:        Wrapper.java
*
* Date:         2012
*
* Author:       Mike Wicks
*
* Copyright:    2012
*               Medical Research Council, UK.
*               All rights reserved.
*
* Address:      MRC Human Genetics Unit,
*               Western General Hospital,
*               Edinburgh, EH4 2XU, UK.
*
* Version:      1
*
* Description:  A Java class to print Prologue and Epilogues to Sysout
* 
* Maintenance:  Log changes below, with most recent at top of list.
*
* Who; When; What;
*
* Mike Wicks; November 2012; Create Class
*
*----------------------------------------------------------------------------------------------
*/
package com.roslin.mwicks.utility;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Wrapper {
	
     /*
      * A List of Valid Message Levels
      *  HIGH        - *, 
      *  MEDIUM-HIGH - **, 
      *  MEDIUM      - ***, 
      *  MEDIUM-LOW  - ****, 
      *  LOW         - *****
      */
     private static final Set<String> VALID_VALUES = new HashSet<String>(Arrays.asList(
        new String[] 
    	    {"*****",
        	"****",
        	"***",
        	"**",
        	"*"}
        ));

     public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
     public static final String TIME_FORMAT_NOW = "HH:mm:ss.SSS";
     public static final String VERBOSE_DATE_FORMAT_NOW = "EEE MMM dd HH:mm:ss zzz yyyy";


    /*
	 * Determine the class name of the currently executing class 
	 */
     public static String now(String dateFormat) {
    	 
    	 Calendar cal = Calendar.getInstance();
    	 SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    	 
    	 return sdf.format(cal.getTime());
     }
     
    /*
	 * Determine the class name of the currently executing class 
	 */
    public static String getExecutingClass() throws Exception {

		StackTraceElement[] stack = Thread.currentThread ().getStackTrace ();
	    StackTraceElement main = stack[stack.length - 1];
	    String executingClass = main.getClassName ();
    	
    	return executingClass;
	}

	/*
	 * Print Duration nicely when given 2 times in Milliseconds
	 */
    public static String printSystemDurationMilliSeconds(long startTime, long endTime) throws Exception {

    	// Duration in Seconds
    	long duration = ( endTime / 1000 )- ( startTime / 1000 );

    	if ( duration/3600 > 0 ) {

    		return String.format("%d hours, %d minutes and %d seconds", duration / 3600, (duration % 3600) / 60, (duration % 60) );
    	}
    	else if ( ( duration % 3600) / 60 > 0 ) {
    		
        	return String.format("%d minutes and %d seconds", (duration%3600)/60, (duration%60) );
    	}
    	else {
        	
        	return String.format("%d seconds", (duration%60) );
    	}
	}

	/*
	 * Print Duration nicely when given 2 times in Milliseconds
	 */
    public static String printSystemDurationSeconds(long startTime, long endTime) throws Exception {

    	// Duration in Seconds
    	long duration = endTime - startTime;

    	if ( duration/3600 > 0 ) {

    		return String.format("%d hours, %d minutes and %d seconds", duration / 3600, (duration % 3600) / 60, (duration % 60) );
    	}
    	else if ( ( duration % 3600) / 60 > 0 ) {
    		
        	return String.format("%d minutes and %d seconds", (duration%3600)/60, (duration%60) );
    	}
    	else {
        	
        	return String.format("%d seconds", (duration%60) );
    	}
	}

	/*
	 * Print a Prologue Message to Sysout
	 */
    public static long printPrologue(String requestPriority, String executingClass) throws Exception {

    	long startTime = System.currentTimeMillis();

    	char dash = '-';
    	String underlines = StringUtility.pad("", executingClass.length(), dash);
    	
    	String prologue = "";
    	prologue = now(TIME_FORMAT_NOW) + " : " + "========= : ";
        Wrapper.printMessage(prologue, underlines, "*", requestPriority);
    	prologue = now(TIME_FORMAT_NOW) + " : " + "EXECUTING : ";
        Wrapper.printMessage(prologue, executingClass + ".java on " + now(VERBOSE_DATE_FORMAT_NOW), "*", requestPriority);
    	prologue = now(TIME_FORMAT_NOW) + " : " + "========= : ";
        Wrapper.printMessage(prologue, underlines, "*", requestPriority);

        return startTime;
	}

	/*
	 * Print an Epilogue Message to Sysout
	 */
    public static void printEpilogue(String requestPriority, String executingClass, long startTime) throws Exception {

    	long endTime = System.currentTimeMillis();
    	
    	char dash = '-';
    	String underlines = StringUtility.pad("", executingClass.length(), dash);
    	
    	String prologue = "";
    	prologue = now(TIME_FORMAT_NOW) + " : " + "========= : ";
        Wrapper.printMessage(prologue, underlines, "*", requestPriority);
    	prologue = now(TIME_FORMAT_NOW) + " : " + "DONE      : ";
        Wrapper.printMessage(prologue, executingClass + ".java on " +  now(VERBOSE_DATE_FORMAT_NOW) + " took " + Wrapper.printSystemDurationMilliSeconds(startTime, endTime), "*", requestPriority);
    	prologue = now(TIME_FORMAT_NOW) + " : " + "========= : ";
        Wrapper.printMessage(prologue, underlines, "*", requestPriority);
    }

	/*
	 * Print Messages to Sysout
	 */
    public static void printMessage(String prologue, String message, String messagePriority, String requestPriority) throws Exception {

        char padChar = '-';

        /*
    	 * Check that the messagePriority and requestPriority values are allowable
    	 */
    	if ( VALID_VALUES.contains( messagePriority ) &&
    		VALID_VALUES.contains( requestPriority ) ) {
    		
    		/*
    		 * If the Executing Message Level (requestPriority) is *****
    		 *  then print ALL messages 
    		 */
        	if ( requestPriority.equals("*****") && ( 
        			messagePriority.equals("*") ||
        			messagePriority.equals("**") ||
        			messagePriority.equals("***") ||
        			messagePriority.equals("****") ||
        			messagePriority.equals("*****") ) ) {

        		System.out.println(prologue + StringUtility.reverse1(StringUtility.pad(messagePriority, 5, padChar)) + " : " + message);
        	}
        	
    		/*
    		 * If the Executing Message Level (requestPriority) is ****
    		 *  then print ONLY messages of *, **, *** & **** Priority
    		 *  Ignore *****  priority Messages
    		 */
        	if ( requestPriority.equals("****") && ( 
        	    	messagePriority.equals("*") ||
        	    	messagePriority.equals("**") ||
        			messagePriority.equals("***") ||
        			messagePriority.equals("****") ) ) {
        	    		
        		System.out.println(prologue + StringUtility.reverse1(StringUtility.pad(messagePriority, 5, padChar)) + " : " + message);
        	}
        	
    		/*
    		 * If the Executing Message Level (requestPriority) is ***
    		 *  then print ONLY messages of *, **, & ***Priority
    		 *  Ignore **** & *****  priority Messages
    		 */
        	if ( requestPriority.equals("***") && ( 
        	    	messagePriority.equals("*") ||
        	    	messagePriority.equals("**") ||
        			messagePriority.equals("***") ) ) {
        	    		
        		System.out.println(prologue + StringUtility.reverse1(StringUtility.pad(messagePriority, 5, padChar)) + " : " + message);
        	}
        	
    		/*
    		 * If the Executing Message Level (requestPriority) is **
    		 *  then print messages of * & ** Priority ONLY
    		 *  Ignore ***, **** & *****  priority Messages
    		 */
        	if ( requestPriority.equals("**") && ( 
        	    	messagePriority.equals("*") ||
        	    	messagePriority.equals("**") ) ) {
        	    		
        		System.out.println(prologue + StringUtility.reverse1(StringUtility.pad(messagePriority, 5, padChar)) + " : " + message);
        	}
        	
    		/*
    		 * If the Executing Message Level (requestPriority) is HIGH
    		 *  then print ONLY messages of HIGH Priority
    		 *  Ignore LOW and MEDIUM priority Messages
    		 */
        	if ( requestPriority.equals("*") &&  
        			messagePriority.equals("*") ) {
        	    
        		System.out.println(prologue + StringUtility.reverse1(StringUtility.pad(messagePriority, 5, padChar)) + " : " + message);
        	}
    	}
    	else {
    		
	    	System.out.println(prologue + "Invalid Input Parameters to utility.Wrapper.printMessage!");
    		System.out.println(prologue + "message = " + message);
    		System.out.println(prologue + "messagePriority = " + messagePriority);
    		System.out.println(prologue + "requestPriority = " + requestPriority);
    	}
    }
    
	/*
	 * Print Messages to Sysout
	 */
    public static void printMessage(String message, String messagePriority, String requestPriority) throws Exception {

    	printMessage( now(TIME_FORMAT_NOW) + " :           : ", message, messagePriority, requestPriority);
    }
}
