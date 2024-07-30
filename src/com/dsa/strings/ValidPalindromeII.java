package com.dsa.strings;

public class ValidPalindromeII {

	public static void main(String[] args) {
	   
        System.out.println(validPalindrome("abc"));
	}
	
	public static boolean validPalindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;			
			}else return isPalindrome(i+1,j,s) || isPalindrome(i,j-1,s) ;
				
			
		}
		return false;
	}
	
	 public static boolean isPalindrome(Integer start,Integer end,String s){
		 int i =start;
	        int j = end;
	        while(i<=j) {
	        	if(s.charAt(i)!=s.charAt(j)) {
	        		return false;
	        	}else {
	        		i++;
	        		j--;
	        	}
	        }
	        return true;
	 }

}
