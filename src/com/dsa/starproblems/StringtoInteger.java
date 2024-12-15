package com.dsa.starproblems;

public class StringtoInteger {

	public static void main(String[] args) {
		String s =  "-91283472332";
		System.out.println(myAtoi(s));
	}

	public static int myAtoi(String s) { 
		int lowerBound = Integer.MIN_VALUE; 
		int upperBound = Integer.MAX_VALUE;
		int i=0,n=s.length(); long sum=0;
		boolean sine = false;
		
		while(i<n && s.charAt(i)==' ')
			   i++;
		
		if(i<n && s.charAt(i)=='-') {
			sine = true;
				i++;
		}else if(i<n && s.charAt(i)=='-') {
			i++;
		}
		
		while(i<n && Character.isDigit(s.charAt(i))) {
			   long r = s.charAt(i++)-'0';
			   sum = sum * 10 +r;
			   if(sum>upperBound || sum<lowerBound)
				   return sine ? lowerBound : upperBound;
		}
		
		 return (int) (sine ? -sum : sum);
	}

}



