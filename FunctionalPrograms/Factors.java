/*
 * Author: Vidyasagar Kamble
 * Stmt: Print Prime factors of a Number.
 */
package com.Bridgelabz;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		for(int i=2;i<=number;i++)
		{
			
			while(number%i==0)
			{
				System.out.println(""+i);
				number/=i;
			}
			
		}
	}

}
