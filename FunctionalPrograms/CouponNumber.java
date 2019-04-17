package com.Bridgelabz;

public class CouponNumber {
	public static void main(String[] args) {
		char array[]="abcdefghijklmnopqrstuvwxyz123456789".toCharArray();
		int max = 10000000;
		int randomNumber = (int) (Math.random()*max);
		StringBuffer sb = new StringBuffer();
		while(randomNumber>0)
		{
			sb.append(array[randomNumber%array.length]);
			randomNumber/=array.length;
		}
		String string=sb.toString();
		System.out.println(string);
	}
}
