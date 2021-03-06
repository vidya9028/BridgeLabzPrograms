package com.BridgelabzAlgo;

import java.util.Scanner;
import com.BridgelabzAlgo.Utility;

public class BubbleSort{
	
public static void main(String[] args) {
		int size;
		long Start = System.currentTimeMillis();
		
		System.out.println("Enter the array Size:");
		Scanner scanner =new Scanner(System.in);
		size = scanner.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++) 	
		{
			array[i] = scanner.nextInt();
		}
		
		Utility utility = new Utility();
		utility.BubbleSort(size, array);
		
		
		long end = System.currentTimeMillis();
		long time = (end-Start)/1000;
		System.out.println("\nElasped time "+time);

	}

}
