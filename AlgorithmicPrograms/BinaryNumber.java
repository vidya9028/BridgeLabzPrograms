package com.BridgelabzAlgo;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter the Decimal Number:");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		Utility utility = new Utility();
		utility.toBinary(number);

	}

}
