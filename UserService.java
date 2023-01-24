package com.bootcamp;

import java.io.IOException;
import java.util.Scanner;

//this class validate the user
public class UserService {
	public void userServiceMethod(User[] users) throws IOException {
		
		for (int i = 0; i< users.length; i++ ) {
			
			System.out.println(users[i].getRole());
			System.out.println(users[i].getUsername());
			System.out.println(users[i].getPassword());
			System.out.println(users[i].getName());
			
		}
		
		
		//System.out.println(users[3]);
/*
		Scanner scanner = null;
		String userInput = null, passInput = null;
		boolean found = false;
		int loginAttempts = 4;
		
		//System.out.println(users.length);

		int i = 0;
		
		while (i < 5) {
			
			System.out.println("Enter your email: ");

			scanner = new Scanner(System.in);
			
			userInput = scanner.nextLine();
			

			System.out.println("Enter your password: ");
			passInput = scanner.nextLine();
			
			for (User current_user : users) {
				System.out.println(current_user.getUsername() + " " + current_user.getPassword());
				System.out.println(userInput + " " + passInput);
				if (userInput.equals(current_user.getUsername())
						&& (passInput.equals(current_user.getPassword()))) {
					System.out.println("Welcome: " + current_user.getName());
					found = true;
					break;
				} else {
					found = false;
				}
			}
			
			if (found == true) {
				break;

			}

			
			if (i == 4) {
				scanner.close();
				System.out.println("Too many failed login attempts, you are now locked out.");

			}
			
			i++;
		
			
		}
		
		System.out.println("Please choose from the following options:\r\n"
				+ "\r\n"
				+ "(1) Update username\r\n"
				+ "\r\n"
				+ "(2) Update password\r\n"
				+ "\r\n"
				+ "(3) Update name\r\n"
				+ "\r\n"
				+ "(4) Exit");
		
		/*
		 * while (i <= users.length) {
			
			
			
			
			//User user = users[i]; //removed this prints out of bounds exc

			
			
			
			System.out.println("Enter your email: ");
			userInput = scanner.nextLine();

			System.out.println("Enter your password: ");
			passInput = scanner.nextLine();

			// loop check current_user in the array of all the Users
			//for (User current_user : users)
			

			for (User current_user : users) {
				if (userInput.equalsIgnoreCase(current_user.getUsername())
						&& (passInput.equals(current_user.getPassword()))) {
					System.out.println("Welcome: " + current_user.getName());
					found = true;
					return users; // break
				} else {
					found = false;
				}
			}


			if (loginAttempts != 0) {
				System.out.println("Invalid login, please try again.");
				loginAttempts--;
			} else {
				if (loginAttempts == 0) {
					System.out.println("Too many failed login attempts, you are now locked out.");
					}
			}

			i++;
		}

		scanner.close();
		return users; // return the User
	}*/
		
}
	}