package com.roslin.mwicks.testutility;

import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;
import com.roslin.mwicks.utility.Wrapper;

public class TestTruncate {

	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

    		String testString = args[0];
    		System.out.println("testString                 = " + testString);
    		
    		int testLength = ObjectConverter.convert(args[1], Integer.class);
    		System.out.println("testLength                 = " + testLength);
    		
    		String output = StringUtility.truncate(testString, testLength);
    		System.out.println("output                     = " + output);


            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
