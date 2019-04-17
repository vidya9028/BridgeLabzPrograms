package com.BridgelabzAlgo;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		int number;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = scanner.nextInt();
		
		Utility utility = new Utility();
		utility.sqrt(number);

	}

}
