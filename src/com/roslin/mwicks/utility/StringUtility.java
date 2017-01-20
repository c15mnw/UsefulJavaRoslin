/*
*----------------------------------------------------------------------------------------------
* Project:      UsefulJava
*
* Title:        StringReverse.java
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
* Description:  A Java class to reverse Strings - in 7 different ways! 
* 
* Maintenance:  Log changes below, with most recent at top of list.
*
* Who; When; What;
*
* Mike Wicks; March 2012; Create Class
*
*----------------------------------------------------------------------------------------------
*/
package com.roslin.mwicks.utility;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

import java.text.NumberFormat;
import java.text.ParseException;

import java.util.Locale;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtility{  

	public static String truncate(String input, int intVarChar) {
		
		 int length = input.length();
		 String output = "";
		    
		 if (length <= intVarChar) {
	    
			 output = input;
		 }
		 else {
			 
			 output = "TRUNCATED:" + input.substring(0, intVarChar - 10);
		 }
		 
		 return output;
	}
	
     /*
      * Pad out a String to the supplied Length, with the supplied Character
      */
	 public static String pad(String input, int minLength, char padChar) {
		 
		 int length = input.length();  
	    
		 if (length >= minLength) {
	    
			 return input;
		 }
		    
		 StringBuffer buffer = new StringBuffer(length);  
	    
		 while (length++ < minLength) {
	    
			 buffer.append(padChar);  
		 }
	    
		 buffer.append(input);  
	    
		 return buffer.toString();  
	 } 
		  

	 /*
	  * Pad out an Integer to the supplied Length, with the supplied Character
	  */
	 public static String pad(int input, int minLength, char padChar) {

		 String strInput = ObjectConverter.convert(input, String.class);
	    
		 int length = strInput.length();
	    
		 if (length >= minLength) {
	    
			 return strInput;
		 }
	    
		 StringBuffer buffer = new StringBuffer(length);  
	    
		 while (length++ < minLength) {
	    
			 buffer.append(padChar);  
		 }
	    
		 buffer.append(input);  
	    
		 return buffer.toString();  
	 } 

	    
	 /*
	  * Pad out a Long number to the supplied Length, with the supplied Character
	  */
	 public static String pad(long input, int minLength, char padChar) {
	 
		 String strInput = ObjectConverter.convert(input, String.class);
	    
		 int length = strInput.length();
	    
		 if (length >= minLength) {
	    
			 return strInput;
		 }
	    
		 StringBuffer buffer = new StringBuffer(length);  
	    
		 while (length++ < minLength) {
	    
			 buffer.append(padChar);  
		 }
	    
		 buffer.append(input);  
	    
		 return buffer.toString();  
	 } 
	 

     /*
      * To convert the InputStream to String we use the
      * Reader.read(char[] buffer) method. We iterate until the
      * Reader return -1 which means there's no more data to
      * read. We use the StringWriter class to produce the string.
      */
    public static String convertStreamToString(InputStream is) throws IOException {

    	if (is != null) {
        	
            Writer writer = new StringWriter();
 
            char[] buffer = new char[1024];
            
            try {
            	
                Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                int n;
                
                while ((n = reader.read(buffer)) != -1) {
                	
                    writer.write(buffer, 0, n);
                }
            }
            finally {
            	
                is.close();
            }
            
            return writer.toString();
        } 
        else {        
        	
            return "";
        }
    }

    public static InputStream convertStringToStream(String string) throws IOException {
    	
    	InputStream is = new ByteArrayInputStream(string.getBytes("UTF-8"));
    	
      	return is;
    }
    
	/*
	 * If the String is a number
	 * 
	 * Explanation:
	 *  [-+]?    = The string can have an optional - or + sign at the beginning.
	 *  [0-9]*   = The string can have any numbers of digits between 0 and 9 
	 *  \\.?     = The digits may have an optional decimal point.
	 *  [0-9]+$  = The string must have a digit at the end.
	 *  Bonus:
	 *   Exponentials = ^[-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)?$
	 */
	public static boolean isItNumeric(String number){

		boolean isValid = false;
		
        String expression = "[-+]?[0-9]*[0-9]+$";  
        CharSequence inputStr = number;  
           
        Pattern pattern = Pattern.compile(expression);  
        Matcher matcher = pattern.matcher(inputStr);  
        
        if ( matcher.matches() ) {  
            
        	isValid = true;  
        }
        
        return isValid;  
    }  

	public static boolean isItNumericWithLeadingSignAndDecimalPoint(String number){

		boolean isValid = false;
		
        String expression = "[-+]?[0-9]*\\.?[0-9]+$";  
        CharSequence inputStr = number;  
           
        Pattern pattern = Pattern.compile(expression);  
        Matcher matcher = pattern.matcher(inputStr);  
        
        if ( matcher.matches() ) {  
            
        	isValid = true;  
        }
        
        return isValid;  
    }  

	public static boolean isItNumericWithLeadingSignAndDecimalPointAndCommas(String number){

		boolean isValid = false;
		
        String expression = "^[+-]?[0-9]{1,}(?:[0-9]*(?:[.,][0-9]{1})?|(?:,[0-9]{3})*(?:\\.[0-9]{1,2})?|(?:\\.[0-9]{3})*(?:,[0-9]{1,2})?)$";  
        CharSequence inputStr = number;  
           
        Pattern pattern = Pattern.compile(expression);  
        Matcher matcher = pattern.matcher(inputStr);  
        
        if ( matcher.matches() ) {  
            
        	isValid = true;  
        }
        
        return isValid;  
    }  

	public static boolean isItNumberFormat(String number) {

		boolean isValid = false;
		
		NumberFormat nf = NumberFormat.getInstance(Locale.UK);

        try {
			if ( nf.parse( number ) != null ) {  
			    
				isValid = true;  
			}
		} 
        catch (ParseException e) {

        	isValid = false;  
		}
        
        return isValid;  
    }  

	public static String getIntegerStringFromFormatted(String number) {
		
		NumberFormat nf = NumberFormat.getInstance(Locale.UK);

        try {
			
        	return nf.parse(number).toString();
		} 
        catch (ParseException e) {
			
        	return "PARSE ERROR";
		}
    }  

	public static String getFormattedFromIntegerString(String number) {
		
		NumberFormat nf = NumberFormat.getInstance(Locale.UK);
		nf.setMaximumFractionDigits(2);
		
        return nf.format( ObjectConverter.convert( number, Integer.class) );
    }  

	public static boolean isItExponentialNumeric(String number){

		boolean isValid = false;
		
        String expression = "^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$";  
        CharSequence inputStr = number;  
           
        Pattern pattern = Pattern.compile(expression);  
        Matcher matcher = pattern.matcher(inputStr);  
        
        if ( matcher.matches() ) {  

        	isValid = true;  
        }
        
        return isValid;  
    }
	
	public static boolean isItAValidEmailAddress(String emailAddress){  
		   
		boolean isValid = false;
		
		String  expression="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
		CharSequence inputStr = emailAddress;
		
		Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
		Matcher matcher = pattern.matcher(inputStr);  
		
        if ( matcher.matches() ) {  
        	
            isValid = true;  
        }
        
        return isValid;  
	}
	
	public static boolean isItAValidIPAddress(String ipAddress){  
		   
		boolean isValid = false;
		
		String  expression="^\\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b$";  
		CharSequence inputStr = ipAddress;
		
		Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
		Matcher matcher = pattern.matcher(inputStr);  
		
        if ( matcher.matches() ) {  

        	isValid = true;  
        }
        
        return isValid;  
	}
	
    /* 
    * ^[0-1][1-9]              : The month starts with a 0 and a digit between 1 and 9 
    * [- / ]?                  : Followed by  an optional "-" or "/". 
    * (0[1-9]|[12][0-9]|3[01]) : The day part must be either between 01-09, or 10-29 or 30-31. 
    * [- / ]?                  : Day part will be followed by  an optional "-" or "/". 
    * (18|19|20|21)\\d{2}$     : Year begins with either 18, 19, 20 or 21 and ends with two digits. 
    */  
	public static boolean  isItAValidDate(String date, boolean isEnglish){  

		String monthExpression = "[0-1][1-9]";  
        String dayExpression = "(0[1-9]|[12][0-9]|3[01])";
        
        String expression = "";
        
        if ( isEnglish ) {  
            //RegEx to validate date in Metric format.  
            expression = "^" + dayExpression + "[- / ]?" + monthExpression + "[- /]?(18|19|20|21)\\d{2,4}";  
        }
        else {
            //RegEx to validate date in US format.  
            expression = "^" + monthExpression +"[- / ]?" + dayExpression + "[- /]?(18|19|20|21)\\d{2}"; 
        }

		boolean isValid = false;  
        
		CharSequence inputStr = date;  

        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
        Matcher matcher = pattern.matcher(inputStr);  
        
        if ( matcher.matches() ) {  

        	isValid = true;  
        }
        
        return isValid;  
    }
	
    public static String reverse1(String s) {
		 
	    int length = s.length();
		
	    if (length <= 1) {
		   
	    	return s;
		}

		String left = s.substring(0, length / 2);
		String right = s.substring(length / 2, length);
		
		return reverse1(right) + reverse1(left);
	}
		 
	public static String reverse2(String s) {
	
		int length = s.length();
		String reverse = "";
		
		for (int i = 0; i < length; i++) {
			
			reverse = s.charAt(i) + reverse;
		}
		
        return reverse;
	}
		 
	public static String reverse3(String s) {
	
		char[] array = s.toCharArray();
		String reverse = "";
		
		for (int i = array.length - 1; i >= 0; i--) {
			
			reverse += array[i];
		}
		 
		return reverse;
	}
		 
	public static String reverse4(String s) {
	
		return new StringBuffer(s).reverse().toString();
	}
		 
	public static String reverse5(String orig) {

		char[] s = orig.toCharArray();
		int n = s.length - 1;
		int halfLength = n / 2;

		for (int i = 0; i <= halfLength; i++) {
			
			char temp = s[i];
		    s[i] = s[n - i];
		    s[n - i] = temp;
		}
		
		return new String(s);
	}
		 
	public static String reverse6(String s) {
	
		char[] str = s.toCharArray();
		 
		int begin = 0;
		int end = s.length() - 1;
		 
		while (begin < end) {
		    
			str[begin] = (char) (str[begin] ^ str[end]);
		    str[end] = (char) (str[begin] ^ str[end]);
		    str[begin] = (char) (str[end] ^ str[begin]);
		    begin++;
		    end--;
		}
		 
		return new String(str);
	}
		 
	public static String reverse7(String s) {

		char[] str = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < str.length; i++) {
			
			stack.push(str[i]);
		}
		 
		String reversed = "";

		for (int i = 0; i < str.length; i++) {
			
			reversed += stack.pop();
		}

		return reversed;
	}
}  
