package com.BridgelabzAlgo;

import java.util.Scanner;

public class Utility {

//Method for Checking Anagram Sting
	
public static void isAnagram(String string1,String string2) {
	char array1[] = string1.toCharArray();
	char array2[] = string2.toCharArray();
	if(array1.length==array2.length)
	{
		
	//Sorting First String	
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1.length-1;j++)
			{
				if(array1[j]>array1[j+1])
				{
					char temp=array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=temp;
				}
			}
		}
		
	//Sorting Second String	
		for(int i=0;i<array2.length;i++)
		{
			for(int j=0;j<array2.length-1;j++)
			{
				if(array2[j]>array2[j+1])
				{
					char temp=array2[j];
					array2[j]=array2[j+1];
					array2[j+1]=temp;
				}
			}
		}
	}
	else {
		System.out.println("The lengths are not equal so can't be anagrams");
		
	}
//Sorting Ends
	
	//Converting Char array to string
			string1 = new String(array1);
			string2 = new String(array2);
		//Checking if they are equal	
			if(string1.equals(string2))
			{
				System.out.println("The Strings are Anagram to each others");
			}
			else
			{
				System.out.println("The Strings are not Anagrams!");
			}
}


//Method for Checking Prime number
public static void  isPrimeNumber(int firstNumber, int lastNumber){
	for(int i=firstNumber;i<lastNumber;i++)
	{
		int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				count++;
		}
		if(count==2)
			System.out.println(i);
	}
}

//Method for Bubble Sort
public static void BubbleSort(int size,int array[])
{
	
	System.out.println("Array Elements Before Sorting: ");
	for(int i=0;i<size;i++)
	{
		System.out.print(array[i]+" ");
	}
	
//Sorting Elements	
	for(int i=0;i<size;i++)
	{
			for(int j=0;j<size-1;j++)
			{
				int temp;
				if(array[j]>array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
	}

//Sorting End	
	System.out.println("");
	System.out.println("Array Elements After Sorting: ");
	for(int i=0;i<size;i++)
	{
		System.out.print(array[i]+" ");
	}
}

//Method for sorting string array using bubble sort 
public static void BubbleSortString(String array[],int size) {
	
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(array[j].compareTo(array[j+1])>0)
				{
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("\nArray After Sorting:");
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i]);
		}
		
	
}

//Method for Binary search
public static void BinarySearch(int size,int[] array)
{
int low = 0,high = size,mid,key;
	BubbleSort(size,array);
	Scanner scanner = new Scanner(System.in);
	System.out.println("\nEnter the number to be searched: ");
	key = scanner.nextInt();
	//Calculating Mid
		mid = (low+high)/2;
		
	//Searching the Element
		while(low<high)
		{
			if(array[mid]==key)         //if mid equal to key, then print
			{
				System.out.println(key+" Element found at location "+(mid+1));
				break;
			}
			else if(array[mid]<key)    //if mid is less than key, search in right part
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;           //if mid is less than key, search in left part
			}
			mid = (low+high)/2;
		}
	System.out.println("Element Not Found");
	
}

public static void search(String[] words, int count) {
	System.out.println("\nEnter the word which you want to search");
	String key;
	Scanner scan = new Scanner(System.in);
	key = scan.nextLine();
	int low=0,high=count-1,mid=0;
	
	mid = (low+high)/2;
	
	while(low<=high) {
		if(words[mid].compareTo(key)==0) {
			System.out.println("Found at location "+(mid+1));
			break;
		}
		else if(words[mid].compareTo(key)>0) {
			high = mid-1;
		}
		else
		{
			low = mid+1;
		}
		mid = (low+high)/2;
	}
	if(low>high) {
	System.out.println("Not found");
	}
}


//Method for sorting Integer numbers using Insertion sort
public static void InsertionSort(int size, int[] array) {
	
	int i,j,temp;
	
	System.out.println("Array Elements Before Sorting: ");
	for(i=0;i<size;i++)
	{
		System.out.print(array[i]+" ");
	}
	
	
	//Sorting Elements
	
			for(i=1;i<size;i++)
			{
				temp=array[i];
				for(j=i-1;j>=0 && array[j]>temp;j--)
				{
					array[j+1]=array[j];
				}
				array[j+1]=temp;
			}
		//Sorting End	
			System.out.println("");
			System.out.println("Array Elements After Sorting: ");
			for(i=0;i<size;i++)
			{
				System.out.print(array[i]+" ");
			}
}

//Method for sorting string array using Insertion sort
public static void insertionSortString(String array[],int size) {
	
	int i,j;
	System.out.println("Array Before Sorting:");
	for(i=0;i<size;i++)
	{
		System.out.println(array[i]);
	}
	
	for(i=1;i<size;i++)
	{
		String temp=array[i];
		for(j=i-1;j>=0 && (array[j].compareTo(temp)>0);j--)
		{
			array[j+1]=array[j];
		}
		array[j+1]=temp;		
	}
	
	System.out.println("\nArray After Sorting:");
	for(i=0;i<size;i++)
	{
		System.out.println(array[i]);
	}
}

//Method for day of week
public static void dayOfWeek(int month,int day,int year) {
	year = year-(14-month)/12;
	int leap = year+year/4-year/100+year/100;
	month = month+12*((14-month)/12);
	day = (day+leap+31*month/12)%7;
	
	System.out.print("Day-");
	switch(day+1) {
	case 0:System.out.println("Sunday");
		break;
	case 1:System.out.println("Monday");
		break;
	case 2:System.out.println("Tuesday");
		break;
	case 3:System.out.println("Wednesday");
		break;
	case 4:System.out.println("Thursday");
		break;
	case 5:System.out.println("Friday");
		break;
	case 6:System.out.println("Saturday");
		break;
	default:
		break;
	}
	
	System.out.print("Month-");
	switch(month)
	{
	case 1:System.out.println("Jan");
		break;
	case 2:System.out.println("Feb");
		break;
	case 3:System.out.println("Mar");
		break;
	case 4:System.out.println("Apr");
		break;
	case 5:System.out.println("May");
		break;
	case 6:System.out.println("Jun");
		break;
	case 7:System.out.println("Jul");
		break;
	case 8:System.out.println("Aug");
		break;
	case 9:System.out.println("Sep");
		break;
	case 10:System.out.println("Oct");
		break;
	case 11:System.out.println("Nov");
		break;
	case 12:System.out.println("Dec");
		break;
	default:
		break;
	}
	System.out.println("Year "+year);

	
}

//Method to Convert temperature   
public static void temperatureConversion(int choice) {
	float temperatur,celsius,fahrenheit;
	Scanner scanner = new Scanner(System.in);
	switch(choice)
	{
	case 1:
		System.out.println("Enter the Fahrenheit Temperature:");
		temperatur=scanner.nextFloat();
		celsius=(temperatur-32)*5/9;
		System.out.println("Temperature in Celsius: "+celsius+"C");
		break;
	case 2:	
		System.out.println("Enter the Celsius Temperature:");
		temperatur=scanner.nextFloat();
		fahrenheit=(temperatur*9/5)+32;
		System.out.println("Temperature in Fahrenheit: "+fahrenheit+"F");
		break;
	default:
			break;
	}
}

//Method for calculating monthly payment
public static void calculateMonthlyPayment(float principal,float rate, int year) {
	int n=12*year;
	float r =rate*((float)rate/(12*100));
	
	double payment = (principal*r)/1-(Math.pow((1+r),(-n))) ;
	System.out.println("Monthly Salary is:"+payment);
}

//Method for finding square root of a number
public static void sqrt(int number) {
	double epsilon = 1e-15;
	double t = number;
	
	while(Math.abs(t-number/t)>epsilon*t) {
		t = (number/t+t)/2;
	}
	System.out.println("Sqare root of a Number "+number+" is "+t);
}

//Method for converting decimal number to binary
public static int[] toBinary(int number) {
	int decimalNumber = number;
	int i=0;
	int array[] = new int[8];
	int array1[] = new int[8];
	while(decimalNumber!=0)
	{
		array[i] = decimalNumber % 2;
		decimalNumber /=2;
	i++;
	}
	System.out.print("The Binary Number for "+number+" is ");
	for(int j=0;j<array.length;j++) {
		System.out.print(array[array.length-j-1]);
		array1[j]=array[array.length-j-1];
	}
	
	return array1;
	
}

//method for swapping nibbles
public static int[] swapNibbles(int array[]) {
	int temp, j=array.length-4;
	for(int i=0;i<4;i++)
	{
		temp = array[i];
		array[i] = array[j];
		array[j]  = temp;
		j++;
	}
	System.out.println("\nSwapped Nibbles-");
	for(int i=0;i<8;i++) {
		System.out.print(array[i]);	
	}
	isPowerOf2(array);
	return array;
}

public static int isPowerOf2(int[] array) {
	
	int number=0;
	int j=7;
	for(int i=0;i<8;i++) {
		 number += (int) (array[i]*Math.pow(2, j));
		 j--;
	}
	//System.out.println(number);
	
	while(number!=1) {
		if(number%2!=0) {
			System.out.println("\nThe number is not power of two");
			return 0;
		}
		number/=2;
	}
	System.out.println("\nThe number is power of two");
	return 0;
	
}
//Method for finding your number
public static void findNumber(int first,int last) {
	
	char choice;
	
	int mid = (first+last)/2;
	System.out.println(mid+" Is this is your Number.(Y/N)");
	
	Scanner scanner = new Scanner(System.in);
	choice = scanner.next().charAt(0);
	while(first<last) { 
	if(choice=='y' || choice=='Y') {
		System.out.println("Your Number is Found");
		break;
		
	}
	else
	{
		System.out.println("Ok! Let's give it a one chance.\nIs your number is between "+first+" and "+(mid+1)+" (Y/N)");
		choice = scanner.next().charAt(1);
		
		if(choice=='y' || choice=='Y')
		{
			last=mid-1;
			findNumber(first,last);
		}
		else
		{
			first=mid+1;
			findNumber(first,last);
		}
		}
		
	}
}
	
}


