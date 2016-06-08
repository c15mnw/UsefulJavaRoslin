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

import java.util.ArrayList;
import java.util.Iterator;

import com.roslin.mwicks.utility.GenerateRandom;


public class GenerateRandomStuff {
	
    private static String [] validNotes = new String[] 
    	{"A",
    	"A\u266F/B\u266D",
    	"B",
    	"C",
    	"C\u266F/D\u266D",
    	"D",
    	"D\u266F/E\u266D",
    	"E",
    	"F",
    	"F\u266F/G\u266D",
    	"G",
    	"G\u266F/A\u266D"};

    private static String [] validKeys = new String[] 
       	{"Major",
    	"Minor"};

    private static String [] validShapes = new String[] 
       	{"C Shape",
    	"A Shape",
    	"G Shape",
    	"E Shape",
    	"D Shape"};

    private static String [] validModes = new String[] 
       	{"Ionian",
    	"Dorian",
    	"Phrygian",
    	"Lydian",
    	"Mixolydian",
    	"Aeolian",
    	"Locrian"};

    private static String [] validChords = new String[] 
       	{"Major 7th",
    	"Minor 7th",
    	"Minor 7th",
    	"Major 7th",
    	"Dominant 7th",
    	"Minor 7th",
    	"Minor 7th, \u266D5th"};

    private static String [] validFrets = new String[] 
       	{"1",
    	"2",
    	"3",
    	"4"};

    
    public static String getRandomDiatonic() throws Exception {

    	int indexNotes = GenerateRandom.getRandom(0, 11);
    	int indexModes = GenerateRandom.getRandom(0, 6);
    	
    	String diatonic = validNotes[indexNotes] + " " + validModes[indexModes]; 
    	
    	return diatonic;
	}

    public static String getRandomChord() throws Exception {

    	int indexNotes = GenerateRandom.getRandom(0, 11);
    	int indexModes = GenerateRandom.getRandom(0, 6);
    	
    	String chord = validNotes[indexNotes] + " " + validModes[indexModes] + ", Over " + validNotes[indexNotes] + " " + validChords[indexModes]; 
    	
    	return chord;
	}

    public static String getRandomPentatonic() throws Exception {

    	int indexNotes = GenerateRandom.getRandom(0, 11);
    	int indexKeys = GenerateRandom.getRandom(0, 1);
    	int indexShapes = GenerateRandom.getRandom(0, 4);
    	
    	String pentatonic = validNotes[indexNotes] + " " + validKeys[indexKeys] + " Pentatonic, " + validShapes[indexShapes]; 
    	
    	return pentatonic;
	}

    public static String getRandomNote() throws Exception {

    	int indexNotes = GenerateRandom.getRandom(0, 11);
    	
    	String note = validNotes[indexNotes];
    	
    	return note;
	}

    public static String getRandomFretPattern() throws Exception {

    	String outputString = "";

    	ArrayList<Integer> newIntegers = (ArrayList<Integer>) GenerateRandom.getRandomNumberList(3);
        Iterator<Integer> iteratorOutputIntegers = newIntegers.iterator();
        
     	while (iteratorOutputIntegers.hasNext()) {
    		
        	outputString = outputString + validFrets[iteratorOutputIntegers.next()] + " ";
     	}

     	return outputString;
    }
}
