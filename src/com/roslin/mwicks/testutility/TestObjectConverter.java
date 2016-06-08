package com.roslin.mwicks.testutility;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.text.SimpleDateFormat;

import java.util.Date;

import com.roslin.mwicks.utility.ObjectConverter;
import com.roslin.mwicks.utility.StringUtility;
import com.roslin.mwicks.utility.Wrapper;

public class TestObjectConverter {

	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

            /*
             * 1.  integerToBoolean
             * 2.  booleanToInteger
             * 
             * 3.  doubleToBigDecimal
             * 4.  bigDecimalToDouble
             * 
             * 5.  integerToString
             * 6.  stringToInteger
             * 
             * 7.  booleanToString
             * 8.  stringToBoolean
             * 
             * 9.  longToString
             * 10. stringToLong
             * 
             * 11. longToInteger
             * 12. integerToLong
             * 
             * 13. doubleToString
             * 14. stringToDouble
             * 
             * 15. dateToString
             * 16. stringToDate
             * 
             * 17. integerToBigDecimal
             * 18. bigDecimalToInteger
             */

    		System.out.println("");
            		
            //Object o1 = new Integer(0);
            int o1_integer = 0;
    		
            //Object o2 = Boolean.TRUE;
            boolean o2_boolean = true;

            // 1.  integerToBoolean
    		System.out.println("1.  integerToBoolean");
    		System.out.println("Integer = " + o1_integer);
    		boolean b1 = ObjectConverter.convert(o1_integer, Boolean.class);
    		System.out.println("Boolean = " + b1);
    		System.out.println("");

            // 2. booleanToInteger
    		System.out.println("2. booleanToInteger");
    		System.out.println("Boolean = " + o2_boolean);
    		int i1 = ObjectConverter.convert(o2_boolean, Integer.class);
    		System.out.println("Integer = " + i1);
    		System.out.println("");

    		
    		//Object o3 = new Double(100.99);
            double o3_double = 100.99;
            
    		//Object o4 = new BigDecimal(123);
            BigDecimal o4_bigdecimal = new BigDecimal(123);
            
            // 3.  doubleToBigDecimal
    		System.out.println("3.  doubleToBigDecimal");
    		System.out.println("Double     = " + o3_double);
    		BigDecimal bd1 = new BigDecimal(0);
    		bd1 = ObjectConverter.convert(o3_double, BigDecimal.class);
    		System.out.println("BigDecimal = " + bd1);
    		System.out.println("");
    		
            // 4.  bigDecimalToDouble
    		System.out.println("4.  bigDecimalToDouble");
    		System.out.println("BigDecimal = " + o4_bigdecimal);
    		double d1 = ObjectConverter.convert(o4_bigdecimal, Double.class);
    		System.out.println("Double     = " + d1);
    		System.out.println("");
    		
    		
    		//Object o5 = new Integer(456);
            int o5_integer = 456;
            
    		//Object o6 = "789";
            //String o6_string = "789";
            String o6_string = "";
        	if ( StringUtility.isItNumeric(o6_string) ){
        		System.out.println("Its a String");
        	}
        	else {
        		System.out.println("Its NOT a String");
        	}

    		// 5.  integerToString
    		System.out.println("5.  integerToString");
    		System.out.println("Integer = " + o5_integer);
    		String s1 = ObjectConverter.convert(o5_integer, String.class);
    		System.out.println("String  = " + s1);
    		System.out.println("");
    		
            // 6.  stringToInteger
    		System.out.println("6.  stringToInteger");
    		System.out.println("String  = " + o6_string);
    		//int i2 = ObjectConverter.convert(o6_string, Integer.class);
    		//System.out.println("Integer = " + i2);
    		System.out.println("");
    		
    		
    		//Object o7 = Boolean.FALSE;
            boolean o7_boolean = false;
            
    		//Object o8 = "0";
            String o8_string = "true";
            
            // 7.  booleanToString
    		System.out.println("7.  booleanToString");
    		System.out.println("Boolean = " + o7_boolean);
    		String s2 = ObjectConverter.convert(o7_boolean, String.class);
    		System.out.println("String  = " + s2);
    		System.out.println("");
    		
            // 8.  stringToBoolean
    		System.out.println("8.  stringToBoolean");
    		System.out.println("String  = " + o8_string);
    		boolean b2 = ObjectConverter.convert(o8_string, Boolean.class);
    		System.out.println("Boolean = " + b2);
    		System.out.println("");
    		

    		//long o9_long = new Long(2000);
            long o9_long = 2000;
            
    		//Object o10 = "3000";
            String o10_string = "3000";
            
            // 9.  longToString
    		System.out.println("9.  longToString");
    		System.out.println("Long   = " + o9_long);
    		String s3 = ObjectConverter.convert(o9_long, String.class);
    		System.out.println("String = " + s3);
    		System.out.println("");

    		// 10. stringToLong
    		System.out.println("10. stringToLong");
    		System.out.println("String = " + o10_string);
    		long l1 = ObjectConverter.convert(o10_string, Long.class);
    		System.out.println("Long   = " + l1);
    		System.out.println("");

    		
    		//Object o11 = new Long(2000);
            long o11_long = 2000;
            
    		//Object o12 = new Integer(4000);
            int o12_integer = 4000;

    		// 11. longToInteger
    		System.out.println("11. longToInteger");
    		System.out.println("Long    = " + o11_long);
    		int i3 = ObjectConverter.convert(o11_long, Integer.class);
    		System.out.println("Integer = " + i3);
    		System.out.println("");

            // 12. integerToLong
    		System.out.println("12. integerToLong");
    		System.out.println("Integer = " + o12_integer);
    		long l2 = ObjectConverter.convert(o12_integer, Long.class);
    		System.out.println("Long    = " + l2);
    		System.out.println("");

            
    		//double o13_double = new Double(-3.141);
            double o13_double = -3.141;
            
    		//Object o14 = "-3.333";
            String o14_string = "-3.333";

            // 13.  doubleToString
    		System.out.println("13.  doubleToString");
    		System.out.println("Double = " + o13_double);
    		String s4 = ObjectConverter.convert(o13_double, String.class);
    		System.out.println("String = " + s4);
    		System.out.println("");

    		// 14. stringToDouble
    		System.out.println("14. stringToDouble");
    		System.out.println("String = " + o14_string);
    		double d2 = ObjectConverter.convert(o14_string, Double.class);
    		System.out.println("Double = " + d2);
    		System.out.println("");

            
    		//Date o15_date = format.parse("29-02-2012 12:00:55");
        	String formatString = "yyyy-MM-dd HH:mm:ss";
        	SimpleDateFormat format = new SimpleDateFormat(formatString);
            String dateString = "2012-02-29 12:00:55";
            Date o15_date = format.parse(dateString);
            
    		//Object o16_string = "2012-02-29 12:00:55";
            String o16_string = "2012-02-29 12:00:55";

            // 15.  dateToString
    		System.out.println("15.  dateToString");
    		System.out.println("Date   = " + o15_date);
    		String s5 = ObjectConverter.convert(o15_date, String.class);
    		System.out.println("String = " + s5);
    		System.out.println("");

    		// 16. stringToDate
    		System.out.println("16. stringToDate");
    		System.out.println("String = " + o16_string);
    		Date date1 = ObjectConverter.convert(o16_string, Date.class);
    		System.out.println("Date   = " + date1);
    		System.out.println("");
    		
    		
    		//Object o17 = new Integer(456);
            int o17_integer = 456;
            
    		//Object o18 = new BigInteger(123);
            BigInteger o18_biginteger = new BigInteger(String.valueOf(123));
            
            // 17.  integerToBigInteger
    		System.out.println("17. integerToBigInteger");
    		System.out.println("Integer    = " + o17_integer);
    		BigInteger bi1 = ObjectConverter.convert(o17_integer, BigInteger.class);
    		System.out.println("BigInteger = " + bi1);
    		System.out.println("");
    		
            // 18.  bigIntegerToInteger
    		System.out.println("18.  bigIntegerToInteger");
    		System.out.println("BigInteger = " + o18_biginteger);
    		int i4 = ObjectConverter.convert(o18_biginteger, Integer.class);
    		System.out.println("Integer    = " + i4);
    		System.out.println("");


            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
