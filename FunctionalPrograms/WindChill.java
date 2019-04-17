package com.Bridgelabz;

public class WindChill {

	public static void main(String[] args) {
		double temprature=Integer.parseInt(args[0]);
		double velocity=Integer.parseInt(args[1]);
		double windchill=0;
		if((temprature>0 && temprature<=50) && (velocity>3 && velocity <=120))
		{
			windchill=35.74+0.6215*temprature+(0.4275*temprature-35.75)*Math.pow(velocity, 0.16);
		}
		System.out.println(windchill);
	}

}
