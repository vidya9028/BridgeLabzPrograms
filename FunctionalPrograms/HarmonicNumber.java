/*
 * Author: Vidyasagar Kamble
 * Stmt: Print Nth Harmonic number.
 */
package com.Bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		int number;
		float result=0.0f;
		System.out.println("Enter the Number: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		if(number!=0)
		{
			for(int i=1; i<=number;i++)
			{
				result +=1/(float)i;
				System.out.print(" "+result);
			}
			
			System.out.println("\n The Harmonic number-- "+result);
		}
		else
		{
			System.out.println("Enter Non Zero value!");
		}
		
	}

}
