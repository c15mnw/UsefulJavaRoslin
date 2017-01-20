package com.roslin.mwicks.testutility;

import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;
import com.roslin.mwicks.utility.Wrapper;

public class TestString {

	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());
    		
    		if ( args.length == 0 ) {
    			
    			System.out.println("NO Arguments supplied to this program!");
    		}
    		else {
    			
        		for (int i = 0; i < args.length; i++ ) {

        			String testString = args[i];

        		    if ( StringUtility.isItAValidEmailAddress(testString) ) {
        		    	
        		    	System.out.println(testString + " is a VALID email address.");  
        		    } 
        		    else if ( StringUtility.isItNumeric(testString) ) {
        		    	
        		    	System.out.println(testString + " is a VALID Number.");  
        		    } 
        		    else if ( StringUtility.isItNumberFormat(testString) ) {
        		    	
        		    	System.out.println(testString + " is a VALID Decimal Number with Commas and an Optional Leading Sign.");  
        		    	
        		    	System.out.println("StringUtility.getIntegerStringFromFormatted( testString ) = " + StringUtility.getIntegerStringFromFormatted( testString ) );
        		    	
        		    	System.out.println("StringUtility.getFormattedFromIntegerString( StringUtility.getIntegerStringFromFormatted( testString ) ) = " + 
        		    	    StringUtility.getFormattedFromIntegerString( StringUtility.getIntegerStringFromFormatted( testString ) ));
        		    } 
        		    else if ( StringUtility.isItNumericWithLeadingSignAndDecimalPoint(testString) ) {
        		    	
        		    	System.out.println(testString + " is a VALID Decimal Number with a Optional Leading Sign.");  
        		    } 
        		    else if ( StringUtility.isItExponentialNumeric(testString) ) {
        		    	
        		    	System.out.println(testString + " is a VALID Exponential Number.");  
        		    } 
        		    else if ( StringUtility.isItAValidDate(testString, true) ) {
        		    	
        		    	System.out.println(testString + " is a VALID UK (Metric) Date.");  
        		    } 
        		    else if ( StringUtility.isItAValidDate(testString, false) ) {
        		    	
        		    	System.out.println(testString + " is a VALID US (Non-Metric) Date.");  
        		    } 
        		    else if ( StringUtility.isItAValidIPAddress(testString) ) {
        		    	
        		    	System.out.println(testString + " is a VALID IP Address.");  
        		    } 
        		    else {  
        		    	
        		    	System.out.println(testString + " is NEITHER Numeric in some way OR an Email Address OR a UK OR US Date OR an IP Address!");  
        		    }  
        		}
    		}

            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
