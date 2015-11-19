/*
*----------------------------------------------------------------------------------------------
* Project:      UsefulJava
*
* Title:        GenerateRandom.java
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
* Description:  A Java class to generate Random Numbers
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

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class GenerateRandom {
	
    private static String [] validValues = new String[] 
       	    {"*****",
        	"****",
        	"***",
        	"**",
        	"*"};

    public static int getRandom(int lowerLimit, int upperLimit) throws Exception {

    	int aStart = lowerLimit;
        int aEnd = upperLimit;
        
		Random aRandom = new Random();
		
		long range = (long)aEnd - (long)aStart + 1;
		
	    // compute a fraction of the range, 0 <= frac < range
	    long fraction = (long)(range * aRandom.nextDouble());
	    int randomNumber =  (int)(fraction + aStart);		
    	
	    return randomNumber;
	}
    
    public static List<Integer> getRandomNumberList(int range) throws Exception {

    	List<Integer> nums = new ArrayList<Integer>(range + 1);
    
    	for (int i = 0; i <= range; i++) {
    		
    	   nums.add(new Integer(i));
    	}
    	
    	Collections.shuffle(nums);
    	
    	return nums;
    }

    public static String randomString ( int i ) {
    	
        Random ran = new Random(i);
        StringBuilder sb = new StringBuilder();
        
        for (int n = 0; ; n++){
        	
            int k = ran.nextInt(27);
            
            if (k == 0) {
            	
                break;
            }

            sb.append( (char) ('`' + k) );
        }

        return sb.toString();
    }
    
    public static String getRandomString() throws Exception {

    	int index = GenerateRandom.getRandom(0, 4);
    	
    	return validValues[index];
	}
}