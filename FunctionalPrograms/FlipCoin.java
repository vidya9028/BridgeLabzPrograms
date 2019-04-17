/*
 * Author: Vidyasagar kamble
 * Stmt: Flip coin and print the percentage of heads and tails.
 */
package com.Bridgelabz;
import java.util.*;
public class FlipCoin {

	public static void main(String[] args) {
		int flips,heads = 0,tails = 0;
		float percentageOfHeads = 0f,percentageOfTails = 0.f;
		double result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of flips: ");
		flips = scanner.nextInt();
		if(flips>=0)
		{
			for(int i=0;i<flips;i++)
			{
				result=Math.random();
				if(result<0.5)
				{
					System.out.println("Tail");
					tails++;
				}
				else
				{
					System.out.println("Head");
					heads++;
				}
			}
			percentageOfHeads = (heads*100)/flips;
			percentageOfTails = (tails*100)/flips;
			System.out.println(percentageOfHeads);
			System.out.println(percentageOfTails);

		}
		else
		{
			System.out.println("Please Enter Positive Number!");
		}

	}

}
