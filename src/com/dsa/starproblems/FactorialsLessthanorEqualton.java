package com.dsa.starproblems;

import java.util.ArrayList;

public class FactorialsLessthanorEqualton {
	ArrayList<Long> res = new ArrayList<Long>();
	int c=1;
	public static void main(String[] args) {
		FactorialsLessthanorEqualton equalton = new FactorialsLessthanorEqualton();
		ArrayList<Long> factorialNumbers = equalton.factorialNumbers(6);
		System.out.println(factorialNumbers);

	}
	
	 ArrayList<Long> factorialNumbers(long n) {
		Long getfact = getfact(c);
		if(getfact>n)
			return res;
		
		c++;
		res.add(getfact);
		factorialNumbers(n);
       return res;
    }
	
	public static Long getfact(long n) {
		Long sum=1l;
		while(n>1) {
			sum*=n--;
		}
		return sum;
	}

}
