package com.Bridgelabz;

public class StopWatch {
  public static void main(String[] args) {
	  long start=System.currentTimeMillis();
	  for(int i=0;i<100;i++)
	  {
	  	System.out.println(i);
	  }
	  long end= System.currentTimeMillis();
   long time = end-start;
  System.out.println("Elapsed time "+time);
  }
}
