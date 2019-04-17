package com.Bridgelabz;

public class Distance {
	
	
	public static void main(String[] args) {
		
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		double distance=Math.sqrt(Math.pow(x,x)+Math.pow(y,y));
		System.out.println("Distance is  :"+distance);
		
	}

}
