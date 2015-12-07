/*
*----------------------------------------------------------------------------------------------
* Project:      DAOAnatomyOBO
*
* Title:        OBOComponent.java
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
* Description:  A Wrapper Object for an OBO Component
*
* Maintenance:  Log changes below, with most recent at top of list.
*
* Who; When; What;
*
* Mike Wicks; February 2012; Create Class
*
*----------------------------------------------------------------------------------------------
*/
package com.roslin.mwicks.utility;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Employee implements Serializable {

	public String name;
	public String address;
	public int SSN;
	//public transient int SSN;
	public int number;
	
    public Employee() {
    	
    	this.name = "";
    	this.address = "";
    	this.SSN = 0;
    	this.number = 0;
    }
    
    public Employee(String name, 
    		String address,
    		int SSN, 
    		int number) {
    	
    	this.name = name;
    	this.address = address;
    	this.SSN = SSN;
    	this.number = number;
    }

    // Getters ------------------------------------------------------------------------------------
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public int getSSN() {
        return this.SSN;
    }
    public int getNumber() {
        return this.number;
    }

    // Setters ------------------------------------------------------------------------------------
    public void setName( String name ) {
        this.name = name;
    }
    public void setAddress( String address ) {
        this.address = address;
    }
    public void setSSN( int SSN ) {
        this.SSN = SSN;
    }
    public void setNumber( int number ) {
        this.number = number;
    }

    public void mailCheck() {
		
	      System.out.println("Mailing a check to " + name + " " + address);
	}
    
    /*
     * Returns the String representation of this User. Not required, it just makes reading logs easier.
     */
    public String toString() {
    	
        return String.format("\nEmployee [ name=%s, address=%s, SSN=%d, number=%d ]", 
        		name, address, SSN, number);
    }

}
