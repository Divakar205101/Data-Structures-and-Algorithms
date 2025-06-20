package com.dsa.starproblems;

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		System.out.println(optimal("AABABBA",1));

	}
	
	 public static int characterReplacement(String s, int k) {
	        int maxLength = 0;
	        for (int i = 0; i < s.length(); i++) {
	        	int[] hash = new int[26]; 
	        	int curmax=0;
				   for (int j = i; j < s.length(); j++) {
					   hash[s.charAt(j)-'A']++;
					   
					   curmax = Math.max(curmax, hash[s.charAt(j)-'A']);
					   
					   int numofchnages = (j-i+1) - curmax;
					   
					   if (numofchnages<=k) 
						   maxLength = Math.max((j-i)+1, maxLength);
						   else
							   break;
					
				}
			}
	        return maxLength;
	  }
	 
	 public static int optimal(String s, int k) {
		 int[] hash = new int[26]; 
		
		 int begin=0,maxlength=0,curmax=0;
		
		 for (int i = 0; i < s.length(); i++) {
			
			 hash[s.charAt(i) - 'A']++;
			 
			 curmax = Math.max(curmax, hash[s.charAt(i)-'A']);
			 
			 if(i - begin+1-curmax > k) {
				 hash[s.charAt(begin) - 'A']--;
				 begin++;
			 }
			 maxlength = Math.max(i-begin+1, maxlength);
		}
		 return maxlength;
	 }

}
