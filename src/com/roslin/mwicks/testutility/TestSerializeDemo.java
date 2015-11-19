package com.roslin.mwicks.testutility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.roslin.mwicks.utility.Employee;

public class TestSerializeDemo {

	public static void main(String... args) throws Exception {

		Employee e = new Employee("Reyan Ali", "Phokka Kuan, Ambehta Peer", 11122333, 101);
		
		//System.out.println("An About to be Serialized Employee...");
		//System.out.println(e.toString());

		      
		try {
		    
			FileOutputStream fileOut = new FileOutputStream("/Users/mwicks/Desktop/employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
		    
			//System.out.println("\nSerialized data is saved in /Users/mwicks/Desktop/employee.ser");
		}
		catch(IOException i) {
		          
			i.printStackTrace();
		}
	}
}
