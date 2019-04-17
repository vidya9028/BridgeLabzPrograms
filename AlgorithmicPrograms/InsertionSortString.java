package com.BridgelabzAlgo;

import java.util.Scanner;





public class InsertionSortString {

	public static void main(String[] args) {
		int i,j,size;
		
		 
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the size:");
		size=scanner.nextInt();
		String array[] =new String[size];
		
		System.out.println("Enter Strings: ");
		for(i=0;i<size;i++)
		{
			array[i]=scanner.next();
		}
		
		Utility utility = new Utility();
		utility.insertionSortString(array, size);

	}

}
