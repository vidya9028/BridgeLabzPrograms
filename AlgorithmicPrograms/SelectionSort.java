package com.BridgelabzAlgo;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int size,i,j;
		System.out.println("Enter the array Size:");
		Scanner scanner =new Scanner(System.in);
		size = scanner.nextInt();
		
		int array[] = new int[size];
		
	//scanning array elements
		System.out.println("Enter the array elements:");
		for(i=0;i<size;i++) 	
		{
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Array Elements Before Sorting: ");
		for(i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	//Sorting Elements
		
		for(i=0;i<size;i++)
		{
			int position=i;
			for(j=i+1;j<size;j++)
			{
				if(array[position]>array[j])
					position = j;
			}
			if(position!=i)
			{
				int swap = array[i];
				array[i] = array[position];
				array[position] = swap;
			}
		}
	//Sorting End	
		
		System.out.println("");
		System.out.println("Array Elements After Sorting: ");
		for(i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}

	}

}
