package com.BridgelabzAlgo;

import com.BridgelabzAlgo.Utility;;

public class DayofWeek {
public static void main(String[] args) {
	int m,d,y;
	
	System.out.println("Enter the Details:");
	
	m=Integer.parseInt(args[0]);
	
	d=Integer.parseInt(args[1]);
	
	y=Integer.parseInt(args[2]);
	
	Utility utility =new Utility();
	utility.dayOfWeek(m, d, y);
}
}
