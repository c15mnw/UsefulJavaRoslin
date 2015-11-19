package com.roslin.mwicks.testutility;

import com.roslin.mwicks.utility.MD5Hash;
import com.roslin.mwicks.utility.Wrapper;

public class TestMD5Hash {

	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

            System.out.println("utility.MD5Hash.convert(\"banana\") " + MD5Hash.convert("banana"));
            
            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
