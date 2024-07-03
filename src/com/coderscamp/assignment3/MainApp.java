package com.coderscamp.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class MainApp {
	
	public static void main(String[] args) {
		
		
		
//		String input = "exampleUsername,examplePassword,exampleName";
//	    String[] parsed = UserService.parseText(input);
//	    
//	    
//	    for (String str : parsed) {
//	        System.out.println(str);
//
//			}
	    
	    
		
     BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			String line;
			while((line = fileReader.readLine()) != null) {
				
				String[] parsed = UserService.parseText(line);
			    
			    
			    for (String str : parsed) {
			        System.out.println(str);
			        
			        UserService userService = new UserService();
					
					User[] users = new User[1];
					
					
					users[0] = userService.createUser(str, str, str);
					
					System.out.println(Arrays.toString(users));

					}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Oops, the file wasn't found");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("Oops there was an IO Exception");
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Closing file reader");
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
}
