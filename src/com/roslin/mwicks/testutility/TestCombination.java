	package com.roslin.mwicks.testutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.roslin.mwicks.utility.GenerateRandom;
import com.roslin.mwicks.utility.StringUtility;
import com.roslin.mwicks.utility.Wrapper;

import com.roslin.mwicks.utility.Combination;

public class TestCombination {
	
    public static void main(String[] args) {
    	
    	try {

    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

            String[] arrayScale = new String[]{"A", "B\u266D", "B", "C", "D\u266D", "D", "E\u266D", "E", "F", "G\u266D", "G", "A\u266D"};

            String[][] arrayNotes = new String[][]{
        		{"A", "B\u266D", "B", "C", "D\u266D", "D", "E\u266D", "E", "F", "G\u266D", "G", "A\u266D"},
        		{"B\u266D", "B", "C", "D\u266D", "D", "E\u266D", "E", "F", "G\u266D", "G", "A\u266D", "A"},
        		{"B", "C", "D\u266D", "D", "E\u266D", "E", "F", "G\u266D", "G", "A\u266D", "A", "B\u266D"},
        		{"C", "D\u266D", "D", "E\u266D", "E", "F", "G\u266D", "G", "A\u266D", "A", "B\u266D", "B"},
        		{"D\u266D", "D", "E\u266D", "E", "F", "G\u266D", "G", "A\u266D", "A", "B\u266D", "B", "C"},
        		{"D", "E\u266D", "E", "F", "G\u266D", "G", "A\u266D", "A", "B\u266D", "B", "C", "D\u266D"},
        		{"E\u266D", "E", "F", "G\u266D", "G", "A\u266D", "A", "B\u266D", "B", "C", "D\u266D", "D"},
        		{"E", "F", "G\u266D", "G", "A\u266D", "A", "B\u266D", "B", "C", "D\u266D", "D", "E\u266D"},
        		{"F", "G\u266D", "G", "A\u266D", "A", "B\u266D", "B", "C", "D\u266D", "D", "E\u266D", "E"},
        		{"G\u266D", "G", "A\u266D", "A", "B\u266D", "B", "C", "D\u266D", "D", "E\u266D", "E", "F"},
        		{"G", "A\u266D", "A", "B\u266D", "B", "C", "D\u266D", "D", "E\u266D", "E", "F", "G\u266D"},
        		{"A\u266D", "A", "B\u266D", "B", "C", "D\u266D", "D", "E\u266D", "E", "F", "G\u266D", "G"}
       
            };

        
            String [][][] arrayPositions = new String[][][]{
            	{
            		{"1", "F", "B\u266D", "E\u266D", "A\u266D", "C", "F"},
            		{"2", "G\u266D", "B", "E", "A", "D\u266D", "G\u266D"},
            		{"3", "G", "C", "F", "B\u266D", "D", "G"},
            		{"4", "A\u266D", "D\u266D", "G\u266D", "B", "E\u266D", "A\u266D"}
            	},
            	{
            	
            		{"5", "A", "D", "G", "C", "E", "A"},
            		{"6", "B\u266D", "E\u266D", "A\u266D", "D\u266D", "F", "B\u266D"},
            		{"7", "B", "E", "A", "D", "G\u266D", "B"},
            		{"8", "C", "F", "B\u266D", "E\u266D", "G", "C"}
            	},
            	{
            		{"09", "D\u266D", "G\u266D", "B", "E", "A\u266D", "D\u266D"},
            		{"10", "D", "G", "C", "F", "A", "D"},
            		{"11", "E\u266D", "A\u266D", "D\u266D", "G\u266D", "B\u266D", "E\u266D"},
            		{"12", "E", "A", "D", "G", "B", "E"}
            	}
            };
            	
            //for (int x = 0; x < arrayScale.length; x++){
            	
                //System.out.println(x+1 + " Scale  : " + arrayScale[x]);
                
                int randomPosition = GenerateRandom.getRandom(0, 2);
                //int randomPosition = 2;
                System.out.println("randomPosition  : " + randomPosition);

                int randomRoot = GenerateRandom.getRandom(0, 11);
                //int randomRoot = x;
                //String randomStrRoot = arrayNotes[randomRoot][0];
                String randomStrRoot = arrayNotes[randomRoot][0];
                
                int randomLength = GenerateRandom.getRandom(1, 12);
                //int randomLength = 1;
                
                System.out.println("randomStrRoot  : " + randomStrRoot);
                System.out.println("randomLength  : " + randomLength);

                List<List<String>> positionList = new ArrayList<List<String>>();
                String [][] arrayPosition = arrayPositions[randomPosition];
                
                for (String [] array : arrayPosition) {

                	positionList.add(Arrays.asList(array));      
                }

                
                String[] arrayNote = arrayNotes[randomRoot];
                List<List<String>> combinationsListListString = new ArrayList<List<String>>();

                for (int i = 1; i <= randomLength; i++){
                	
                	combinationsListListString.addAll(Combination.combinationsListListString(arrayNote, i, 0, new String[i]));
                }

                int combinationCount = 0;
                
                List<List<String>> outputCombinationsListListString = new ArrayList<List<String>>();

                Iterator<List<String>> iteratorRow = combinationsListListString.iterator();
                
             	while (iteratorRow.hasNext()) {
            		
            		List<String> row = iteratorRow.next();

            		if ( row.size() == randomLength ){
            			
                        if ( row.get(0).equals(randomStrRoot)) {
                        	
                        	combinationCount++;
                        	
                        	outputCombinationsListListString.add(row);
                        }
            		}
             	}

             	int randomPatternNum = GenerateRandom.getRandom(0, combinationCount - 1);
                
             	List<String> outputRow = outputCombinationsListListString.get(randomPatternNum);

             	String rowStr = outputRow.toString();

            	int indexOfOpenBracket = rowStr.indexOf("[");
                int indexOfLastBracket = rowStr.lastIndexOf("]");
                String outputStr = rowStr.substring(indexOfOpenBracket+1, indexOfLastBracket);
            	
                System.out.println(outputStr);

                List<List<String>> outputPositionListListString = new ArrayList<List<String>>();

             	Iterator<List<String>> iteratorPositionListListString = positionList.iterator();

        		while (iteratorPositionListListString.hasNext()) {
            		
            		List<String> positionOutRow = new ArrayList<String>();

            		List<String> positionInRow = iteratorPositionListListString.next();

             		//System.out.println(rowIn.toString());

             		Iterator<String> iteratorNotePositionRow = positionInRow.iterator();

                 	while (iteratorNotePositionRow.hasNext()) {
                 		
                		String positionNote = iteratorNotePositionRow.next();
                		
            			if ( StringUtility.isItNumeric(positionNote)) {
            				
            				positionOutRow.add(positionNote);
            			}
            			else {
            				
                    		if ( outputRow.contains(positionNote) ) {
                    			
                    			if ( randomStrRoot.equals(positionNote) ) {
                    				
                        			positionOutRow.add("R(" + positionNote + ")");
                    			}
                    			else {
                    				
                        			positionOutRow.add(positionNote);
                    			}
                    		}
                    		else {

                    			positionOutRow.add("X");
                			}
                		}
                 	}
             		
                 	outputPositionListListString.add(positionOutRow);
             	}

                Iterator<List<String>> outputPositionListStringIterator = outputPositionListListString.iterator();

             	while (outputPositionListStringIterator.hasNext()) {
             		
             		List<String> outputListString = outputPositionListStringIterator.next();
             		 
             		System.out.println(outputListString.toString());
             	}

            //}

            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}

    }

}