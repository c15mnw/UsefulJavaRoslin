package com.roslin.mwicks.testutility;

import com.roslin.mwicks.utility.MySQLDateTime;
import com.roslin.mwicks.utility.Wrapper;

public class TestMySQLDateTime {

	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

    		Wrapper.printMessage("MySQLDateTime.now() = " + MySQLDateTime.now(), "*", "*");
    		
            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
