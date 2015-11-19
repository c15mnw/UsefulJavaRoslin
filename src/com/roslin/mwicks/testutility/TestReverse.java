package com.roslin.mwicks.testutility;

import com.roslin.mwicks.utility.StringUtility;
import com.roslin.mwicks.utility.Wrapper;

public class TestReverse {

	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

            String inString = "The quick brown fox jumps over the lazy dog";
            String outString = "";
            
    		long startReverse = System.currentTimeMillis();
    		outString = StringUtility.reverse1(inString);
    		long endReverse = System.currentTimeMillis();
    		long timeDiff = endReverse - startReverse;
            System.out.println("inString : " + inString);
            System.out.println("outString: " + outString);
            System.out.println("DONE reverse1 took " + timeDiff + " milliseconds");
            System.out.println("");

    		startReverse = System.currentTimeMillis();
    		outString = StringUtility.reverse2(inString);
    		endReverse = System.currentTimeMillis();
    		timeDiff = endReverse - startReverse;
            System.out.println("inString : " + inString);
            System.out.println("outString: " + outString);
    		System.out.println("DONE reverse2 took " + timeDiff + " milliseconds");
            System.out.println("");

    		startReverse = System.currentTimeMillis();
    		outString = StringUtility.reverse3(inString);
    		endReverse = System.currentTimeMillis();
    		timeDiff = endReverse - startReverse;
            System.out.println("inString : " + inString);
            System.out.println("outString: " + outString);
    		System.out.println("DONE reverse3 took " + timeDiff + " milliseconds");
            System.out.println("");

    		startReverse = System.currentTimeMillis();
    		outString = StringUtility.reverse4(inString);
    		endReverse = System.currentTimeMillis();
    		timeDiff = endReverse - startReverse;
            System.out.println("inString : " + inString);
            System.out.println("outString: " + outString);
    		System.out.println("DONE reverse4 took " + timeDiff + " milliseconds");
            System.out.println("");
            
    		startReverse = System.currentTimeMillis();
    		outString = StringUtility.reverse5(inString);
    		endReverse = System.currentTimeMillis();
    		timeDiff = endReverse - startReverse;
            System.out.println("inString : " + inString);
            System.out.println("outString: " + outString);
    		System.out.println("DONE reverse5 took " + timeDiff + " milliseconds");
            System.out.println("");
    		
    		startReverse = System.currentTimeMillis();
    		outString = StringUtility.reverse6(inString);
    		endReverse = System.currentTimeMillis();
    		timeDiff = endReverse - startReverse;
            System.out.println("inString : " + inString);
            System.out.println("outString: " + outString);
    		System.out.println("DONE reverse6 took " + timeDiff + " milliseconds");
            System.out.println("");

    		startReverse = System.currentTimeMillis();
    		outString = StringUtility.reverse7(inString);
    		endReverse = System.currentTimeMillis();
    		timeDiff = endReverse - startReverse;
            System.out.println("inString : " + inString);
            System.out.println("outString: " + outString);
    		System.out.println("DONE reverse7 took " + timeDiff + " milliseconds");
            System.out.println("");

            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
