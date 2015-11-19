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

import com.roslin.mwicks.utility.GenerateRandom;


public class GeneratePassword {
    	    
	private static String [] validAlphabets = new String[] {
		"abcdefghijklmnopqrstuvwxyz",
		"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
		"0123456789",
		"`~!@#$%^&*()-_=+[]{}\\|;:'\",<.>/?"};
    

   public static String getRandomAlphabet() throws Exception {

	   return validAlphabets[GenerateRandom.getRandom(0, 3)];
   }

   public static char getRandomCharacter() throws Exception {
	   
	   String alphabet = getRandomAlphabet();
	   
	   return alphabet.charAt(GenerateRandom.getRandom(0, alphabet.length() - 1));
   }

   public static String generatePassword() throws Exception {

	   String password = "";
	   
	   for ( int i =0; i < 8; i++ ) {
		   
		   password = password + getRandomCharacter();
	   }

	   return password;
   }

   public static String generatePassword(int length) throws Exception {

	   String password = "";
	   
	   for ( int i =0; i < length; i++ ) {
		   
		   password = password + getRandomCharacter();
	   }

	   return password;
   }


}
