package com.bootcamp;

import java.io.IOException;

public class Assigment4App {
	
	public static void main(String[] args) throws IOException {


		FileService fileservice = new FileService();
		User[] allUsers = fileservice.getUsers();
	
		//for (User i : allUsers) {
		//System.out.println(i.getRole());

		//}
		
		//pass the allUsers data to the userservice method
		UserService userservice = new UserService();
		userservice.userServiceMethod(allUsers);
				
	}
}
