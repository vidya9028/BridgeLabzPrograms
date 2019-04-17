/**
 * Author: Vidyasagar Kamble
 * Stmt:Take Username as input.(Ensure username has minimum 3 char)
 *      Replace <<username>> with proper String.
*/
package com.Bridgelabz;
import java.util.Scanner;
public class UserName {

	public static void main(String[] args) {
		String string = "Hello UserName, How are You!";
		String username, replaceString = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User Name: ");
		username = scanner.nextLine();
		if(username.length()>=3)
		{
			 replaceString = string.replace("UserName", username);
			 System.out.println(string);
			 System.out.println(replaceString);
		}
		else
		{
			System.out.println("Please Enter Minimum 3 Characters!");
		}
		

	}

}
