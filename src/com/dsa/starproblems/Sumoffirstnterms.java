package com.dsa.starproblems;

public class Sumoffirstnterms {
    int sum=0;
	public static void main(String[] args) {
		Sumoffirstnterms sumoffirstnterms = new Sumoffirstnterms();
		System.out.println(sumoffirstnterms.sumOfSeries(7));
	}
	
	 int sumOfSeries(int n) {
	      if(n==0)
	    	  return 1;
	      sum+=n*n*n;
	      sumOfSeries(n-1);
	      return sum;
	 }
	 
	 

}
