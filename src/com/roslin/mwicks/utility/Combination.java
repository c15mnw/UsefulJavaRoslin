package com.roslin.mwicks.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.roslin.mwicks.utility.GenerateRandom;
import com.roslin.mwicks.utility.StringUtility;
import com.roslin.mwicks.utility.Wrapper;

public class Combination {
	
	public static String combinationsString(String[] arr, int len, int startPosition, String[] result) {
        
    	String returnString = "";
    	
    	if (len == 0){
    		
            String testStr = Arrays.toString(result);
            
            int indexOfOpenBracket = testStr.indexOf("[");
            int indexOfLastBracket = testStr.lastIndexOf("]");
            
            returnString = testStr.substring(indexOfOpenBracket + 1, indexOfLastBracket);
            
            return returnString;
        }       
    	
        for (int i = startPosition; i <= arr.length-len; i++){
        	
            result[result.length - len] = arr[i];
            
            if ( returnString.equals("")) {
            	
                returnString = combinationsString(arr, len-1, i+1, result);
            }
            else {
            	
                returnString = returnString + "\n" + combinationsString(arr, len-1, i+1, result);
            }
        }
        return returnString;
    }
    
    
	public static List<String> combinationsListString(String[] arr, int len, int startPosition, String[] result) {
        
    	List<String> returnString = new ArrayList<String>();
    	
    	if (len == 0){
    		
            String testStr = Arrays.toString(result);
            
            int indexOfOpenBracket = testStr.indexOf("[");
            int indexOfLastBracket = testStr.lastIndexOf("]");
            
            returnString.add(testStr.substring(indexOfOpenBracket + 1, indexOfLastBracket));
            
            return returnString;
        }       
    	
        for (int i = startPosition; i <= arr.length-len; i++){
        	
            result[result.length - len] = arr[i];

            returnString.addAll(combinationsListString(arr, len-1, i+1, result));
        }
        
        return returnString;
    }       
    

	public static List<List<String>> combinationsListListString(String[] arr, int len, int startPosition, String[] result) {
        
    	List<List<String>> returnString = new ArrayList<List<String>>();
    	
    	if (len == 0){
    		
            List<String> testStr = new ArrayList<String>();

            for (int i = 0; i < result.length; i++){
            	
            	testStr.add(result[i]);
            }

            returnString.add(testStr);
            
            return returnString;
        }       
    	
        for (int i = startPosition; i <= arr.length-len; i++){
        	
            result[result.length - len] = arr[i];

            returnString.addAll(combinationsListListString(arr, len-1, i+1, result));
        }

        return returnString;
    }       

}