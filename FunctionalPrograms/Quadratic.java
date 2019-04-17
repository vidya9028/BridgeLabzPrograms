package com.Bridgelabz;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		
		int a,b,c,x;
		double delta;
		double root1 = 0,root2 = 0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the values:");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		delta=(b*b)-(4*a*c);
		System.out.println(delta);
		if(delta>0)
		{
			root1 =  (-b+(Math.sqrt(delta)))/(2*a);
			root2=  (-b-(Math.sqrt(delta)))/(2*a);
		}
		else if(delta<0)
		{
			System.out.println("Roots are Real and equal");
		}
		System.out.println("Roots of Quadratic Equation");
		System.out.println("Root 1 of x:"+root1);
		System.out.println("Root 1 of x:"+root2);
}
}
