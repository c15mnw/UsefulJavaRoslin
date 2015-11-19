package com.roslin.mwicks.testutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.roslin.mwicks.utility.Employee;

public class TestDeSerializeDemo {

	
	public static void main(String... args) throws Exception {

		Employee e = null;
	    
		try{
	       
			FileInputStream fileIn = new FileInputStream("/Users/mwicks/Desktop/employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);

			e = (Employee) in.readObject();
			
			in.close();
			fileIn.close();
			
			//System.out.println("\nDeSerialized data retrieved from /Users/mwicks/Desktop/employee.ser");

		}
		catch(IOException i) {
	         
			i.printStackTrace();
			return;
		}
		catch(ClassNotFoundException c) {
	         
			//System.out.println("Employee class not found");
	        
			c.printStackTrace();
			return;
	      
		}

		//System.out.println("\nA Deserialized Employee...");
		//System.out.println(e.toString());
	}
}
