/*
 * Author: Vidyasagar Kamble
 * Stmt: Check if year is leap year or not.
 */
package com.Bridgelabz;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year,digit = 0;
		System.out.println("Enter the year: ");
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		int temp=year;
		while(temp!=0)
		{		
			temp/=10;
			++digit;
		}
		if(digit==4)
		{
			if(year % 400==0 || year % 4 == 0)
			{
				System.out.println("Year "+year+" is a leap year");
			}
			else if(year%100==0)
			{
				System.out.println("Year is not a leap year");
			}
			else
			{
				
				System.out.println("Year is not a leap year");
			}
		}
		else
		{
			System.out.println("Please Enter 4 digit Year!");
		}
	}
}
