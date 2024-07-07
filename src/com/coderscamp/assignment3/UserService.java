package com.coderscamp.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class UserService {
	
	private User[] userList = new User[4];
	
	public UserService() {
		
		generateUsers();
		
	}

	private void generateUsers() {
		FileService fileService = new FileService();
		userList = fileService.readDataFile();
		
	}
	
	public User getUserCredential(String username, String password) {
		for (User user : userList) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				
				
				
				return user;
			}
		}
		
		return null;
			
	}
}
