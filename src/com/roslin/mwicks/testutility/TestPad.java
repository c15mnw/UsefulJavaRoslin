package com.roslin.mwicks.testutility;

import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;
import com.roslin.mwicks.utility.Wrapper;

public class TestPad {

	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

    		String testString = args[0];
    		System.out.println("testString                 = " + testString);
    		
    		int testStringAsInt = ObjectConverter.convert(args[0], Integer.class);
    		System.out.println("testStringAsInt            = " + testStringAsInt);
    		
    		int testLength = ObjectConverter.convert(args[1], Integer.class);
    		System.out.println("testLength                 = " + testLength);  

    		char[] characters = args[2].toCharArray();
    		char testCharacter = characters[0];
    		System.out.println("testCharacter              = " + testCharacter);  

    		String paddedString = StringUtility.pad(testString, testLength, testCharacter); 
    		System.out.println("paddedString(input String) = " + paddedString);  

    		paddedString = StringUtility.pad(testStringAsInt, testLength, testCharacter); 
    		System.out.println("paddedString(input int)    = " + paddedString);  

            char padChar = '*';
            System.out.println("StringUtility.pad(\"*\", 7, padChar):" + StringUtility.pad("*", 7, padChar));
            
            padChar = '0';
            int intX = 12345;
            System.out.println("StringUtility.pad(intX, 7, padChar):" + StringUtility.pad(intX, 7, padChar));

            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
