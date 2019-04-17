package com.BridgelabzAlgo;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number = scanner.nextInt();
		int array[] = new int[8];
		Utility utility = new Utility();
		array=utility.toBinary(number);
		
		utility.swapNibbles(array);

	}

}
