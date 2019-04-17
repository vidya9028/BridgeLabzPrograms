/*
 * Author: Vidyasagar Kamble
 * Stmt: Table of power of 2 using command line argument.
 */
package com.Bridgelabz;

public class PowerofTwo {
	public static void main(String[] args) {
		int number= Integer.parseInt(args[0]);
		int result = 0; 
		if(number>=0 && number<=31)
		{
			for(int i=1;i<=number;i++)
			{
				result = (int) Math.pow(2,i);
				System.out.print(result+" ");
			}
		}
		else
		{
			System.out.println("Overflow");
		}
	}
}
