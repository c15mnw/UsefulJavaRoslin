/*
*----------------------------------------------------------------------------------------------
* Project:      UsefulJava
*
* Title:        FileNamingDateTime.java
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
* Description:  Returns a String with the Date in a format useful for prepending to file names 
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

import java.text.SimpleDateFormat;

import java.util.Date;

public class FileNamingDateTime{  

    // Constants ----------------------------------------------------------------------------------
	protected static final String FILE_NAME_FORMAT = "yyyy-MM-dd_HH-mm-ss";

    public static String now() {
	    
    	Date dt = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat(FILE_NAME_FORMAT);
    	
    	return sdf.format(dt);
	}

    public static String formatDate(Date dt) {
	    
    	SimpleDateFormat sdf = new SimpleDateFormat(FILE_NAME_FORMAT);
    	
    	return sdf.format(dt);
	}
}  
