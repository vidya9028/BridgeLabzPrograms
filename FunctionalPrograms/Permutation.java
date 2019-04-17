package com.Bridgelabz;

import java.util.Scanner;

public class Permutation {
	
	public String swap(String string ,int i,int n)
	{
		char temp;
		char array[]=string.toCharArray();
		temp=array[i];
		array[i]=array[n];
		array[n]=temp;
		return String.valueOf(array);
	}
	public void permute(String str,int i,int n)
	{
		
		
		
		if(i==n)
		{
			System.out.println(str);
		}
		else
		{
			for(int j=i;j<=n;j++)
			{
			str=swap(str,i,j);
			permute(str, i+1, n);
			str=swap(str,i,j);
			}
		}
	}
	
	public static void main(String[] args) {
	
		String string;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String :");
		string=scanner.nextLine();
		Permutation obj=new Permutation();
		int len=string.length();
		int i=0;
		obj.permute(string, i, len-1);
		
		
	}

}
