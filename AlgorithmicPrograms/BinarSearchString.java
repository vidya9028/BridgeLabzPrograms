package com.BridgelabzAlgo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BinarSearchString {
	static  int count = 0;


	public static void main(String[] args)throws IOException {
		
			
				File file = new File("abc.txt");
				Scanner scanner = new Scanner(System.in);
				scanner = new Scanner(file);
				int length = (int) file.length();
				String words[] = new String[length];
			
		//Scanning contents from file and storing it into array
				while(scanner.hasNext()) {
					String string = scanner.next();
					words[count] = string;
					count++;			
				}
				System.out.println("Words from Wordlist file ");
				for(int i=0;i<count;i++)
				{
					System.out.println(""+words[i]);
				}
				Utility utility = new Utility();
				utility.BubbleSortString(words, count);
				
				utility.searchString(words, count);

}
}