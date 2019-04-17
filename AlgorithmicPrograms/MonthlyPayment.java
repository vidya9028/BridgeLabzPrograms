package com.BridgelabzAlgo;

public class MonthlyPayment {

	public static void main(String[] args) {
		int year;
		float principal,rate;
		principal=Float.parseFloat(args[0]);
		rate=Float.parseFloat(args[1]);
		year=Integer.parseInt(args[2]);
		
		Utility utility = new Utility();
		utility.calculateMonthlyPayment(principal,rate,year);

	}

}
