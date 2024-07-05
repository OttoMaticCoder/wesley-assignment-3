package com.coderscamp.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
	
	public User[] readDataFile() {
		try (BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"))) {
			User[] userList = new User[4]; 
			String line;
			int i = 0;
			
			while((line = fileReader.readLine()) != null) {
				String[] element = line.split(",");
				userList[i] = new User(element[0], element[1], element[2]);
				i++;
				
				
				
				System.out.println(line);
				System.out.println(element);
			}
					
			return userList;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
