package com.BridgelabzAlgo;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int notesOf1=0,notesOf2=0,notesOf5=0,notesOf10=0,notesOf50=0,notesOf100=0,notesOf500=0,notesOf1000=0;
		int totalAmount=0;
		int change;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Rupees:");
		change=scanner.nextInt();
		while(change!=0) {
		if(change>=1000) {
			notesOf1000++;
			change = change-1000;
			totalAmount+=1000;
		}
		
		else if(change<1000 && change>=500) {
			notesOf500++;
			change-=500;
			totalAmount+=500;
		}
		
		else if(change<500 && change>=100) {
			notesOf100++;
			change-=100;
			totalAmount+=100;
		}
		
		else if(change<100 && change>=50) {
			notesOf50++;
			change-=50;
			totalAmount+=50;
		}
		
		else if(change<50 && change>=10) {
			notesOf10++;
			change-=10;
			totalAmount+=10;
		}
		
		else if(change<10 && change>=5) {
			notesOf5++;
			change-=5;
			totalAmount+=5;
		}
		
		else if(change<5 && change>=2) {
			notesOf2++;
			change-=2;
			totalAmount+=2;
		}
		else {
			notesOf1++;
			change--;
			totalAmount++;
		}
		
		}
		
		System.out.println("Notes of 1000: "+notesOf1000);
		System.out.println("Notes of 500: "+notesOf500);
		System.out.println("Notes of 100: "+notesOf100);
		System.out.println("Notes of 50: "+notesOf50);
		System.out.println("Notes of 10: "+notesOf10);
		System.out.println("Notes of 5: "+notesOf5);
		System.out.println("Notes of 2: "+notesOf2);
		System.out.println("Notes os 1: "+notesOf1);
		System.out.println("Total Amount: "+totalAmount);
}

}
