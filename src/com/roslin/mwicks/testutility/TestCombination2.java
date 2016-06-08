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

public class TestCombination2 {
	
    public static void main(String[] args) {
    	
    	try {

    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

            //String[] arrayFrets = new String[]{"1", "2", "3", "4", "2", "1", "3", "4", "3", "1", "2", "4", "4", "1", "2", "3"};
            String[] arrayFrets1 = new String[]{"1", "2", "3", "4"};
            String[] arrayFrets2 = new String[]{"2", "1", "3", "4"};
            String[] arrayFrets3 = new String[]{"3", "1", "2", "4"};
            String[] arrayFrets4 = new String[]{"4", "1", "2", "3"};

            List<List<String>> stringListList = new ArrayList<List<String>>();

            stringListList.addAll(Combination.combinationsListListString(arrayFrets1, 4, 0, new String[4]));
            stringListList.addAll(Combination.combinationsListListString(arrayFrets2, 4, 0, new String[4]));
            stringListList.addAll(Combination.combinationsListListString(arrayFrets3, 4, 0, new String[4]));
            stringListList.addAll(Combination.combinationsListListString(arrayFrets4, 4, 0, new String[4]));

            System.out.println("stringListList.size() : " + stringListList.size());
            
            Iterator<List<String>> iteratorStringListList = stringListList.iterator();
            
         	while (iteratorStringListList.hasNext()) {
        		
        		List<String> stringList = iteratorStringListList.next();
        		
                System.out.println(stringList.toString());
         	}

            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}

    }

}