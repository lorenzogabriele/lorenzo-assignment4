package com.bootcamp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
	User[] users;
	
	public FileService() throws IOException {
		users = myArray();
	}
	
	public User[] getUsers() {
		return users;
	}

	public void setUsers(User[] users) {
		this.users = users;
	}

	public static User[] myArray() throws IOException {
		User[] users = new User[20];
		//System.out.println("Start!");
		BufferedReader myReader = null;
		
		
		try {
			myReader = new BufferedReader(new FileReader("users.txt"));

			int i = 0;
			String line = "";
			while ((line = myReader.readLine()) != null) {
				//System.out.println(line);
				
				String[] data = line.split(",");
	
				//System.out.println(data);

				User user = new User();

				user.setUsername(data[0].trim());
				user.setPassword(data[1].trim());
				user.setName(data[2].trim());
				user.setRole(data[3].trim());
				
				users[i] = user;
				i++;
				
				//System.out.println(user.getUsername());
				//System.out.println(user.getPassword());
				//System.out.println(user.getName());
				//System.out.println(user.getRole());
				
				//System.out.println(users[1]);


			}

		} catch (FileNotFoundException e) {
			System.out.println("Oops, the file wasn't found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Oops, there was an I/O Exception");
			e.printStackTrace();
		} finally {
			try {
				myReader.close();
				//System.out.println("Closing file reader");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Stack Trace exception Print");
			}
		}
		//System.out.println("Return Array");
		return users;
	}
}
