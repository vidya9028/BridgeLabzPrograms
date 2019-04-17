package com.Bridgelabz;

import java.util.Scanner;

public class SumofInteger {
	public static void main(String[] args) {
		
		int number,i,j,k,count=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of element  :");
		number=scanner.nextInt();
		int array[]=new int[number];

		//Scanning array elements
		System.out.println("Enter array elements :");
		for(i=0;i<array.length;i++)
		{
			array[i]=scanner.nextInt();
			
		}
		
	
		//Displaying array elements	
		System.out.println("Array elements :");
		for(int var :array)
		{
			System.out.print(" "+var);
		}
	
		
		//Logic for finding sum of integer numbers equal to zero	
		System.out.println("");
		for(i=0;i<array.length;i++)
		{
			for(j=i+1;j<array.length;j++)
			{
				for(k=j+1;k<array.length;k++)
				{
					if(array[i]+array[j]+array[k]==0)
					{
						System.out.println("["+array[i]+" "+array[j]+" "+array[k]+"]");
						count++;
						
					}
				}
			}
		}
		System.out.println(" Number of triples exactly zero  :"+count);
	}
}
