package com.atcs.loginassignment.validation;

import java.util.Scanner;
import java.util.regex.*;

public class ValidPassword{

	// Function to validate the password.
	public static boolean isValidPassword(String password)
	{

	
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		
		if (password == null) {
			return false;
		}

		
		Matcher m = p.matcher(password);

		// Return if the password
		// matched the ReGex
		return m.matches();
	}

	// Driver Code.
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		//String pass = sc.next();
		if(isValidPassword("Danny"))
			System.out.println("True");
		else
			System.out.println("False");
		sc.close();
	}
}
