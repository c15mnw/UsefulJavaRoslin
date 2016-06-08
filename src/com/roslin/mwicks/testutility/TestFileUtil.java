package com.roslin.mwicks.testutility;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import com.roslin.mwicks.utility.CsvUtil;
import com.roslin.mwicks.utility.FileUtil;
import com.roslin.mwicks.utility.Wrapper;

import java.util.ArrayList;
import java.util.Iterator;

public class TestFileUtil {

	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

    		/*
    		//String directory = "/Users/gwentoulin/Downloads/Roslin/4_submission_folder";
    		String directory = "/Users/gwentoulin/Downloads/Roslin/test";
    		
    		String[] filesString = FileUtil.listAllUnhiddenFilenamesInDirectory(directory);
    		
    		for ( String fileString : filesString ) {
        		
                System.out.println("Strings - Directory : " + directory + " : " + fileString);
        	}

    		File[] filesFile = FileUtil.listAllFilesInDirectory(directory);
    		
    		for ( File file : filesFile ) {
        		 
                System.out.println("Files   - Directory : " + directory + " : " + file.getName());
                
                // Format InputStream for CSV.
                InputStream csvInput = FileUtil.readStream(file);
                
                // Create CSV List
                List<List<String>> csvList = CsvUtil.parseCsv(csvInput, '\t');

                // Create CSV List
                List<String> outputList = new ArrayList<String>();

                Iterator<List<String>> iteratorRow = csvList.iterator();
                
             	while (iteratorRow.hasNext()) {
            		
            		List<String> row = iteratorRow.next();

                    Iterator<String> iteratorColumn = row.iterator();
                    
                    int i = 1;
                    
                    String column1 = "";
                    String column2 = "";
                    String column3 = "";
                    String column4 = "";
                    String column5 = "";
                    String column6 = "";
                    String column7 = "";
                    String column8 = "";
                    String column9 = "";
                    String column10 = "";
                    String column11 = "";
                    String column12 = "";
                    String column13 = "";
                    String column14 = "";
                    String column15 = "";
                    String column16 = "";
                    String column17 = "";
                    String column18 = "";
                    String column19 = "";
                    String column20 = "";
                    String column21 = "";
                    String column22 = "";
                    String column23 = "";
                    String column24 = "";
                    String column25 = "";
                    
                 	while (iteratorColumn.hasNext()) {
                		
                		String column = iteratorColumn.next();
                		
                		if ( i == 1 ) {
                			column1 = column.trim();
                		}
                		if ( i == 2 ) {
                			column2 = column.trim();
                		}
                		if ( i == 3 ) {
                			column3 = column.trim();
                		}
                		if ( i == 4 ) {
                			column4 = column.trim();
                		}
                		if ( i == 5 ) {
                			column5 = column.trim();
                		}
                		if ( i == 6 ) {
                			column6 = column.trim();
                		}
                		if ( i == 7 ) {
                			column7 = column.trim();
                		}
                		if ( i == 8 ) {
                			column8 = column.trim();
                		}
                		if ( i == 9 ) {
                			column9 = column.trim();
                		}
                		if ( i == 10 ) {
                			column10 = column.trim();
                		}
                		if ( i == 11 ) {
                			column11 = column.trim();
                		}
                		if ( i == 12 ) {
                			column12 = column.trim();
                		}
                		if ( i == 13 ) {
                			column13 = column.trim();
                		}
                		if ( i == 14 ) {
                			column14 = column.trim();
                		}
                		if ( i == 15 ) {
                			column15 = column.trim();
                		}
                		if ( i == 16 ) {
                			column16 = column.trim();
                		}
                		if ( i == 17 ) {
                			column17 = column.trim();
                		}
                		if ( i == 18 ) {
                			column18 = column.trim();
                		}
                		if ( i == 19 ) {
                			column19 = column.trim();
                		}
                		if ( i == 20 ) {
                			column20 = column.trim();
                		}
                		if ( i == 21 ) {
                			column21 = column.trim();
                		}
                		if ( i == 22 ) {
                			column22 = column.trim();
                		}
                		if ( i == 23 ) {
                			column23 = column.trim();
                		}
                		if ( i == 24 ) {
                			column24 = column.trim();
                		}
                		if ( i == 25 ) {
                			column25 = column.trim();
                		}
                		
                		i++;
                 	}

                 	String query = column1 + ";" + 
                			column2 + ";" + 
                			column3 + ";" + 
                			column4 + ";" + 
                			column5 + ";" + 
                			column6 + ";" + 
                			column7 + ";" + 
                			column8 + ";" + 
                			column9 + ";" + 
                			column10 + ";" + 
                			column11 + ";" + 
                			column12 + ";" + 
                			column13 + ";" + 
                			column14 + ";" + 
                			column15 + ";" + 
                			column16 + ";" + 
                			column17 + ";" + 
                			column18 + ";" + 
                			column19 + ";" + 
                			column20 + ";" + 
                			column21 + ";" + 
                			column22 + ";" + 
                			column23 + ";" + 
                			column24 + ";" + 
                			column25 + ";";
                 	
                    outputList.add(query);
             	}

             	int i =0;
             	
        		for ( String outputString : outputList ) {
            		
        			i++;
                    System.out.println(i + " : " + outputString);
            	}

        	}
    		 */


            //File file1 = new File("/Users/gwentoulin/Desktop/output.txt");

    		//FileUtil.ZipTextWithChecksum("/Users/gwentoulin/Desktop/test/output.zip", "/Users/gwentoulin/Desktop/");

            /*
            if ( FileUtil.isZipFileValid( file1 ) ) {
            	
                //System.out.println("file1, " + file1 + " is a VALID Zipfile!");
            }
            else {
            	
                //System.out.println("file1, " + file1 + " is an INVALID Zipfile!");
            }

            File file2 = new File("/Users/mwicks/Documents/emapa-edit.obo");

            if ( FileUtil.isZipFileValid( file2 ) ) {
            	
                //System.out.println("file2, " + file2 + " is a VALID Zipfile!");
            }
            else {
            	
                //System.out.println("file2, " + file2 + " is an INVALID Zipfile!");
            }
             */

            /*
            File file1 = new File("/Users/mwicks/Desktop/LoremIpsum1.txt");
            FileUtil.write(file1, "The Cat Sat On The Mat\n", true);

            File file2 = new File("/Users/mwicks/Desktop/LoremIpsum2.txt");
            FileUtil.write(file2, "The Cat Sat On The Mat\n", false);

            File file3 = new File("/Users/mwicks/Desktop/LoremIpsum3.txt");
            FileUtil.write(file3, "The Cat Sat On The Mat\n");

            List<String> fileList1 = FileUtil.readRecords(file1);
        	Iterator<String> iterator1 = fileList1.iterator();
        	int i1 = 0;

        	while (iterator1.hasNext()) {
        		
        		i1++;
        		String str1 = iterator1.next();
                //System.out.println("file1, Record " + i1 + " : " + str1);
        	}

            List<String> fileList2 = FileUtil.readRecords(file2);
        	Iterator<String> iterator2 = fileList2.iterator();
        	int i2 = 0;

        	while (iterator2.hasNext()) {
        		
        		i2++;
        		String str2 = iterator2.next();
                //System.out.println("file2, Record " + i2 + " : " + str2);
        	}
        	*/

            File file3 = new File("/Users/mwicks23/Desktop/ensembl_gene_names.csv");

            List<String> fileList3 = FileUtil.readRecords(file3);
        	Iterator<String> iterator3 = fileList3.iterator();
        	int i3 = 0;
        	int matched = 0;

        	while (iterator3.hasNext()) {
        		
        		i3++;
        		String str3 = iterator3.next();
        		if ( str3.endsWith("117") ) {
        			matched++;
                    System.out.println("file3, " + matched + ", Record " + i3 + " : " + str3);
        		}
        		if ( matched > 9) {
        			break;
        		}
        	}

            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
