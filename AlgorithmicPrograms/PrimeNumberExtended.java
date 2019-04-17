 package com.BridgelabzAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberExtended {
public void isPalindrome(int number) {
	int temp=number,reminder=0,result = 0;
	
	while(temp!=0)
	{
		reminder = temp%10;
		result = result*10+reminder;
		temp /= 10;
	}
	if(result==number)
	{
		System.out.println(number);
	}
}

public void isAnagram(int number) {
	int temp1=number;
	int temp2=number;
	char [] array1= (""+temp1).toCharArray();
	char [] array2= (""+temp2).toCharArray();
	
	
	Arrays.sort(array1);
	Arrays.sort(array2);
	temp1=Integer.parseInt(new String(array1));
	temp2=Integer.parseInt(new String(array2));
	if(temp1==temp2)
	{
		System.out.println(number);
	}
	
}

	public static void main(String[] args) {
		      int low=10,high=1000;
		      boolean flag = false;
		      PrimeNumberExtended obj = new PrimeNumberExtended();
		      Scanner scanner = new Scanner(System.in);
		      
				System.out.println("Eneter choice: \n1.To check prime Palindrome numbers\n2.To check Prime Anagram Numbers\n");
	    		int choice=scanner.nextInt();
		       for(int i=low;i<high;i++)
				{
					int count=0;
					for(int j=1;j<=i;j++)
					{
						if(i%j==0)
						{
							count++;
						}
					}
					if(count==2)
			    	  {

			    		if(choice==1)
			    		{
			    		    obj.isPalindrome(i);
			    		}
			    		
			    		else if(choice==2) {
			    			obj.isAnagram(i);
			    		}
			    		else
			    		{
			    			System.out.println("Wrong choice!");
			    			
			    		}
						
			    		
			    		
			    	  }
			      }
		       
		      
		  }
}


