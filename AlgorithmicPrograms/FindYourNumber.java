package com.BridgelabzAlgo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FindYourNumber {
public static void main(String[] args) {
	int number = Integer.parseInt(args[0]);
	int low=0,high=number;
	System.out.println("Think a Number between o to "+number);
	
	Utility utility = new Utility();
	utility.findNumber(low,high);
	

}
}
