package com.dsa.starproblems;

public class Pow {
	public static void main(String[] args) {
       System.out.println(myPow(2.0d,3));
	}

	public static double myPow(double x, int n) {
         return s(x,n,1);
	}
	
	public static double s(double x, int n,double c) {
		if(n==0)
			return c*x;
		s(x,n-1,c);
		return c;
	}

}
