package com.BridgelabzAlgo;

import java.util.Scanner;


public class BubbleSortString {
	
	public static void main(String[] args) {
		int size;
		String string;
		
		Scanner scanner =new Scanner(System.in);

		System.out.println("Enter the size:");
		size=scanner.nextInt();
		
		String array[] =new String[size];
		
		System.out.println("Enter Strings: ");
		for(int i=0;i<size;i++)
		{
			array[i]=scanner.next();
		}
		
		
		Utility utility = new Utility();
		utility.BubbleSortString(array, size);
	}


}
