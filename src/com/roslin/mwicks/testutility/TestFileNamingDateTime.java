package com.roslin.mwicks.testutility;

import com.roslin.mwicks.utility.FileNamingDateTime;
import com.roslin.mwicks.utility.Wrapper;

public class TestFileNamingDateTime {

	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

    		Wrapper.printMessage("FileNamingDateTime.now() = " + FileNamingDateTime.now(), "*", "*");
    		
            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
