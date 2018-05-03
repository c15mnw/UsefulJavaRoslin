package com.roslin.mwicks.testutility;

import com.roslin.mwicks.utility.Wrapper;
import com.roslin.mwicks.utility.CipherROT13point5;

public class TestCeasar {

	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

    		//String inputStr = "0123456789 The Quick Brown Fox Jumped Over The Lazy Dog";
    		//String inputStr = "5678901234 Gur Dhvpx Oebja Sbk Whzcrq Bire Gur Ynml Qbt";
    		//String inputStr = "Ceboyrz fbyivat vf 35 creprag bs gur wbo";
    		String inputStr = "Problem solving is 80 percent of the job";
    		String outputStr = "";

    		outputStr = CipherROT13point5.convert(inputStr);
    		
    		System.out.println(inputStr);
    		System.out.println(outputStr);
    		
            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);

    		startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

    		outputStr = CipherROT13point5.convertMap(inputStr);
    		
    		System.out.println(inputStr);
    		System.out.println(outputStr);
    		
            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
