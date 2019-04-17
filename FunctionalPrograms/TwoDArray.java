package com.Bridgelabz;


import java.io.*;
import java.util.*;

public class TwoDArray {
public static void main(String[] args) {
	int row,column;
	PrintWriter pw = new PrintWriter(System.out,false);
	
	

	System.out.println("Enter the row and column values:");
	Scanner scanner= new Scanner(System.in);
	row=scanner.nextInt();
	column=scanner.nextInt();
	int array[][]=new int[row][column];
	
//Scanning array elements	
	System.out.println("Enter the array values:");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			array[i][j]=scanner.nextInt();
		}
	}

	//Displaying array elements using Printwriter 		
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			//System.out.println(array[i][j]);
			pw.print("["+array[i][j]+"]");
			
			
		}
		pw.print("\n");
	}
	
	pw.close();

}
}
