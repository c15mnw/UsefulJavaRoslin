/*
*----------------------------------------------------------------------------------------------
* Project:      UsefulJava
*
* Title:        ObjectConverter.java
*
* Date:         2012
*
* Author:       BalusC
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
* Description:  A Java class to Convert Classes to Other Classes 
*
* net/balusc/util/ObjectConverter.java
* 
* Copyright (C) 2007 BalusC
* 
* This program is free software: you can redistribute it and/or modify it under the terms of the
* GNU Lesser General Public License as published by the Free Software Foundation, either version 3
* of the License, or (at your option) any later version.
* 
* This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
* even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
* Lesser General Public License for more details.
* 
* You should have received a copy of the GNU Lesser General Public License along with this library.
* If not, see <http://www.gnu.org/licenses/>.
* 
*
* Generic object converter.
* 
* Not all possible conversions are implemented. You can extend the <tt>ObjectConverter</tt>
* easily by just adding a new method to it, with the appropriate logic. For example:
* 
* <pre>
* public static ToObject fromObjectToObject(FromObject fromObject) {
*     // Implement.
* }
* </pre>
* 
* The method name doesn't matter. It's all about the parameter type and the return type.
* 
* @author BalusC
* @link http://balusc.blogspot.com/2007/08/generic-object-converter.html
* 
* Possible Conversions
* --------------------
* 1.  integerToBoolean
* 2.  booleanToInteger
* 3.  doubleToBigDecimal
* 4.  bigDecimalToDouble
* 5.  integerToString
* 6.  stringToInteger
* 7.  booleanToString
* 8.  stringToBoolean
* 9.  longToString
* 10. stringToLong
* 11. longToInteger
* 12. integerToLong
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

import java.lang.reflect.Method;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class ObjectConverter {

	/*
	 * List of Possible Convertors:
	 * 
	 * bigDecimalToDouble
	 * bigDecimalToInteger
	 * 
	 * booleanToInteger
	 * booleanToString
	 * 
	 * dateToString
	 * 
	 * doubleToBigDecimal
	 * doubleToString
	 * 
	 * integerToBigDecimal
	 * integerToBoolean
	 * integerToLong
	 * integerToString
	 * 
	 * longToInteger
	 * longToString
	 * 
	 * stringToBoolean
	 * stringToDate
	 * stringToDouble
	 * stringToInteger
	 * stringToLong
	 */
    // Init ---------------------------------------------------------------------------------------
    private static final Map<String, Method> CONVERTERS = new HashMap<String, Method>();

    static {

    	// Preload converters.
        Method[] methods = ObjectConverter.class.getDeclaredMethods();
        
        for (Method method : methods) {
        
        	if (method.getParameterTypes().length == 1) {
        		
                // Converter should accept 1 argument. This skips the convert() method.
                CONVERTERS.put(method.getParameterTypes()[0].getName() + "_"
                    + method.getReturnType().getName(), method);
            }
        }
    }

    private ObjectConverter() {
        // utility class, hide the constructor.
    }

    // Action -------------------------------------------------------------------------------------
    /*
     * Convert the given object value to the given class.
     * @param from The object value to be converted.
     * @param to The type class which the given object should be converted to.
     * @return The converted object value.
     * @throws NullPointerException If 'to' is null.
     * @throws UnsupportedOperationException If no suitable converter can be found.
     * @throws RuntimeException If conversion failed somehow. This can be caused by at least
     * an ExceptionInInitializerError, IllegalAccessException or InvocationTargetException.
     */
    public static <T> T convert(Object from, Class<T> to) {

        // Null is just null.
        if (from == null) {

        	return null;
        }

        // Can we cast? Then just do it.
        if (to.isAssignableFrom(from.getClass())) {
            
        	return to.cast(from);
        }

        // Lookup the suitable converter.
        String converterId = from.getClass().getName() + "_" + to.getName();
        Method converter = CONVERTERS.get(converterId);

        if (converter == null) {
        
        	throw new UnsupportedOperationException("Cannot convert from " 
                + from.getClass().getName() + " to " + to.getName()
                + ". Requested converter does not exist.");
        }

        // Convert the value.
        try {
            
        	return to.cast(converter.invoke(to, from));
        } 
        catch (Exception e) {
            
        	throw new RuntimeException("Cannot convert from " 
                + from.getClass().getName() + " to " + to.getName()
                + ". Conversion failed with " + e.getMessage(), e);
        }
    }

    // Converters ---------------------------------------------------------------------------------
    /*
     * Converts Integer to Boolean. If integer value is 0, then return FALSE, else return TRUE.
     * @param value The Integer to be converted.
     * @return The converted Boolean value.
     */
    public static Boolean integerToBoolean(Integer value) {

    	return value.intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    /*
     * Converts Boolean to Integer. If boolean value is TRUE, then return 1, else return 0.
     * @param value The Boolean to be converted.
     * @return The converted Integer value.
     */
    public static Integer booleanToInteger(Boolean value) {
        
    	return value.booleanValue() ? Integer.valueOf(1) : Integer.valueOf(0);
    }

    /*
     * Converts Double to BigDecimal.
     * @param value The Double to be converted.
     * @return The converted BigDecimal value.
     */
    public static BigDecimal doubleToBigDecimal(Double value) {
        
    	return new BigDecimal(value.doubleValue());
    }

    /*
     * Converts BigDecimal to Double.
     * @param value The BigDecimal to be converted.
     * @return The converted Double value.
     */
    public static Double bigDecimalToDouble(BigDecimal value) {
        
    	return new Double(value.doubleValue());
    }

    /*
     * Converts Integer to String.
     * @param value The Integer to be converted.
     * @return The converted String value.
     */
    public static String integerToString(Integer value) {
        
    	return value.toString();
    }

    /*
     * Converts String to Integer.
     * @param value The String to be converted.
     * @return The converted Integer value.
     */
    public static Integer stringToInteger(String value) {
        
    	return Integer.valueOf(value);
    }

    /*
     * Converts Boolean to String.
     * @param value The Boolean to be converted.
     * @return The converted String value.
     */
    public static String booleanToString(Boolean value) {
        
    	return value.toString();
    }

    /*
     * Converts String to Boolean.
     * @param value The String to be converted.
     * @return The converted Boolean value.
     */
    public static Boolean stringToBoolean(String value) {
        return Boolean.valueOf(value);
    }

    // You can implement more converter methods here.
    /*
     * Converts Double to String.
     * @param value The Double to be converted.
     * @return The converted String value.
     */
    public static String doubleToString(Double value) {

    	return value.toString();
    }

    /*
     * Converts String to Double.
     * @param value The String to be converted.
     * @return The converted Double value.
     */
    public static Double stringToDouble(String value) {
        
    	return Double.valueOf(value);
    }

    /*
     * Converts Long to String.
     * @param value The Long to be converted.
     * @return The converted String value.
     */
    public static String longToString(Long value) {
        
    	return value.toString();
    }

    /*
     * Converts String to Long.
     * @param value The String to be converted.
     * @return The converted Long value.
     */
    public static Long stringToLong(String value) {
        
    	return Long.valueOf(value);
    }

    /*
     * Converts Date to String into format "yyyy-MM-dd HH:mm:ss" ONLY
     * @param value The Date to be converted.
     * @return The converted String value.
     */
    public static String dateToString(Date value) {
        
    	String formatString = "yyyy-MM-dd HH:mm:ss";
    	SimpleDateFormat format = new SimpleDateFormat(formatString);

    	return format.format(value);
    }

    /*
     * Converts String to Date from format "yyyy-MM-dd HH:mm:ss" ONLY
     * @param value The String to be converted.
     * @return The converted Date value.
     */
    public static Date stringToDate(String value) {
    	
    	String formatString = "yyyy-MM-dd HH:mm:ss";
    	SimpleDateFormat format = new SimpleDateFormat(formatString);
    	Date parsed = null;
    	
		try {
		
			parsed = format.parse(value);
		} 
		catch (ParseException e) {

			e.printStackTrace();
		}
    	
    	return parsed;
    }

    /*
     * Converts Long to String.
     * @param value The Long to be converted.
     * @return The converted String value.
     */
    public static Integer longToInteger(Long value) {
        
    	return value.intValue();
    }

    /*
     * Converts String to Long.
     * @param value The String to be converted.
     * @return The converted Long value.
     */
    public static Long integerToLong(Integer value) {
        
    	return Long.valueOf(value);
    }
 
    /*
     * Converts Integer to BigInteger.
     * @param value The Integer to be converted.
     * @return The converted BigInteger value.
     */
    public static BigInteger integerToBigInteger(Integer value) {
        
    	return BigInteger.valueOf(value.intValue());
    }

    /*
     * Converts BigInteger to Integer.
     * @param value The BigInteger to be converted.
     * @return The converted Integer value.
     */
    public static Integer bigIntegerToInteger(BigInteger value) {
        
    	return new Integer(value.intValue());
    }


}