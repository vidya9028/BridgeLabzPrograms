package com.Bridgelabz;

import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {
		int stake,goal,noOfTrials;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Cash:");
		stake=scanner.nextInt();
		System.out.println("Enter The goal:");
		goal=scanner.nextInt();
		System.out.println("Enter the trials:");
		noOfTrials=scanner.nextInt();
		
		int bets=10,wins=0,loss=0;
		
		for(int i=0;i<noOfTrials;i++)
		{
			while(stake>0&&stake<=goal)
			{
				double random = Math.random();
				
				if(random>0.5)
				{
					stake=stake+bets;
				}
				else
				{
					stake=stake-bets;
					
				}
			}
			if(stake>=goal)
			{
				wins++;
			}
		}
		System.out.println("wins-"+wins);
		System.out.println("Percentage of wins "+100*wins/noOfTrials);
} 

}
