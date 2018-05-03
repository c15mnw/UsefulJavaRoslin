package com.roslin.mwicks.utility;

import java.util.HashMap;

public final class CipherROT13point5 {

    // Init ---------------------------------------------------------------------------------------

    // Constants ----------------------------------------------------------------------------------
    private static final int ASCII_UPPER = 65;
    private static final int ASCII_LOWER = 97;
    
    private static final int SHIFT_ROT13 = 13;
    private static final int SHIFT_ROT5 = 5;
    
    private static final int MODULUS_ROT13 = 26;
    private static final int MODULUS_ROT5 = 10;
    
    
    // Constructors -------------------------------------------------------------------------------
    private CipherROT13point5() {

    }
    
    // Methods      -------------------------------------------------------------------------------
	public static String convert(String string) {
	    
		String outputStr = "";

		int integer = 0;
		int remainder = 0;

		char character;
		char characterCalculated;
		char characterOut;
		
		int asciiValue = 0;
		int asciiAmount = 0;
		
		int i = 0;
		
		// Process each Character in the String
		while ( i < string.length() ) {

			// Get the ith character of the string 
			character = string.charAt(i);

			// Is the Character a Letter or a Digit?
			if ( Character.isDigit(character) ) {
				
				// Convert the ASCII Character of the Digit to a Java Integer:
				//  '0' is ASCII 48,  so subtracting this gives us an Integer Value
				//  as ASCII '7' is 55, giving us an integer value of 7
				integer = character - '0';
				
				// ENCRYPT!! By Adding 5 to the Number
    			integer = integer + SHIFT_ROT5;
        		
    			// What is the remainder when we divide by 10
        		remainder = integer % MODULUS_ROT5;
        		
        		// Convert back to an ASCII character, by adding '0'
        		characterOut = (char)(remainder + '0');
			}
			else {
				
				// Convert the Non-Numeric Characters to their ASCII values 
	    		asciiValue = (int) character;
	    		
	    		// Do no process Spaces, instead echo to output
	    		if ( character != ' ' ) {
	    			
	    			// ASCII Upper Case Letters start at 65, Lower at 97
	    			if ( Character.isUpperCase(character) ) {
	    				
	    				asciiAmount = ASCII_UPPER;
	    			}
	    			else {
	    				
	    				asciiAmount = ASCII_LOWER;
	    			}

	    			// For the ASCII value of the letter, subtract the starting ASCII number
	    			asciiValue = asciiValue - asciiAmount;

	    			// ENCRYPT!  By adding 13
	    			integer = asciiValue + SHIFT_ROT13;
	        		
	    			// What is the remainder when we divide by 13
	        		remainder = integer % MODULUS_ROT13;
	        		
	        		// Convert back to an ASCII Character value
	        		remainder = remainder + asciiAmount;
	        		characterCalculated = (char) remainder;

	        		// Convert back to Upper/Lower case depending on Input 
	        		if ( Character.isUpperCase(character) ) {
	    				
	        			characterOut = Character.toUpperCase(characterCalculated);
	    			}
	    			else {
	    				
	        			characterOut = Character.toLowerCase(characterCalculated);
	    			}
	    		}
	    		else {
	    			
	    			//Spaces are echoed back 
	    			characterOut = ' ';
	    		}
			}

    		i++;
    		
    		// Append enciphered Character to output String
    		outputStr = outputStr + characterOut;
    	}
		
		return outputStr;

	}
	
    // Methods      -------------------------------------------------------------------------------
	public static String convertMap(String string) {
	    
		// Create a hash map
		HashMap<Character, Character> hm = new HashMap<Character, Character>();

		// Put elements to the map
		hm.put('a', 'n');
		hm.put('A', 'N');
		hm.put('b', 'o');
		hm.put('B', 'O');
		hm.put('c', 'p');
		hm.put('C', 'P');
		hm.put('d', 'q');
		hm.put('D', 'Q');
		hm.put('e', 'r');
		hm.put('E', 'R');
		hm.put('f', 's');
		hm.put('F', 'S');
		hm.put('g', 't');
		hm.put('G', 'T');
		hm.put('h', 'u');
		hm.put('H', 'U');
		hm.put('i', 'v');
		hm.put('I', 'V');
		hm.put('j', 'w');
		hm.put('J', 'W');
		hm.put('k', 'x');
		hm.put('K', 'X');
		hm.put('l', 'y');
		hm.put('L', 'Y');
		hm.put('m', 'z');
		hm.put('M', 'Z');
		hm.put('n', 'q');
		hm.put('N', 'A');
		hm.put('o', 'b');
		hm.put('O', 'B');
		hm.put('p', 'c');
		hm.put('P', 'C');
		hm.put('q', 'd');
		hm.put('Q', 'D');
		hm.put('r', 'e');
		hm.put('R', 'E');
		hm.put('s', 'f');
		hm.put('S', 'F');
		hm.put('t', 'g');
		hm.put('T', 'G');
		hm.put('u', 'h');
		hm.put('U', 'H');
		hm.put('v', 'i');
		hm.put('V', 'I');
		hm.put('w', 'j');
		hm.put('W', 'J');
		hm.put('x', 'k');
		hm.put('X', 'K');
		hm.put('y', 'l');
		hm.put('Y', 'L');
		hm.put('z', 'm');
		hm.put('Z', 'M');
		hm.put('0', '5');
		hm.put('1', '6');
		hm.put('2', '7');
		hm.put('3', '8');
		hm.put('4', '9');
		hm.put('5', '0');
		hm.put('6', '1');
		hm.put('7', '2');
		hm.put('8', '3');
		hm.put('9', '4');
		hm.put(' ', ' ');
	      
		String outputStr = "";

		char character;
		char characterOut;
		
		int i = 0;
		
		// Process each Character in the String
		while ( i < string.length() ) {

			// Get the ith character of the string 
			character = string.charAt(i);

            characterOut = hm.get(character);

    		i++;
    		
    		// Append enciphered Character to output String
    		outputStr = outputStr + characterOut;
    	}
  
		return outputStr;

	}

}