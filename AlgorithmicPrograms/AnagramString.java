package com.BridgelabzAlgo;

import java.util.Scanner;
import com.BridgelabzAlgo.Utility;
public class AnagramString {
	public static void main(String[] args) {
		
		String string1,string2;
		
		System.out.println("Enter two Strings:");
		Scanner scanner = new Scanner(System.in);
		
		string1 = scanner.nextLine();
		string2 = scanner.nextLine();
		
		Utility utility = new Utility();
		utility.isAnagram(string1, string2);
		
	}

}
