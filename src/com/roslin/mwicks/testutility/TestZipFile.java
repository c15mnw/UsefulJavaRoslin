package com.roslin.mwicks.testutility;

import java.io.File;

import com.roslin.mwicks.utility.FileUtil;

public class TestZipFile {

	public static void main(String args[]){  

    	try {

            if ( args.length > 0 ) {
            	
                File file1 = new File(args[0]);

                if ( FileUtil.isZipFileValid( file1 ) ) {
                	
                    //System.out.println(file1 + " is a VALID Zipfile!");
                }
                else {
                	
                    //System.out.println(file1 + " is an INVALID Zipfile!");
                }
            }
            else {
            	
                //System.out.println("No arguments supplies to this program!");
            }
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
