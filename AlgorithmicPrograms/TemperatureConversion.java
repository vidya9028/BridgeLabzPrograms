package com.BridgelabzAlgo;

import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {

		int choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Choice\n1.Fahrenheit To Celsius\n2.Celsius To Fahrenheit\n");
		choice=scanner.nextInt();
		Utility utility = new Utility();
		utility.temperatureConversion(choice);

	}

}
