package com.coderscamp.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class UserLoginApp {
	
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		UserService userService = new UserService();
		System.out.println("Welcome, please login...");
		
		int loginAttempts = 0;
		User validUser = null;
		
		while(true) {
			System.out.println("Enter your email: ");
			String username = scanner.nextLine();
			
			System.out.println("Enter Password: ");
			String password = scanner.nextLine();
			
			validUser = userService.getUserCredential(username, password);
			
			if(validUser != null) {
				System.out.println("Welcome " + validUser.name);
				break;
			}
			
			else if (loginAttempts == 4) {
				System.out.println("Too many invalid logins. You are locked out");
				break;
			}
			
			else {
				System.out.println("Invalid login, try again");
				loginAttempts++;
				

			}	
		}	
	}
}
