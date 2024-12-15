package com.dsa.starproblems;

public class ReverseWordInString {

	public static void main(String[] args) {
		String str = "a good   example";
		System.out.println(reverseWords1(str));
	}
	
	 public static String reverseWords(String s) {
		 String[] split = s.split(" ");
		 StringBuilder str= new StringBuilder();
		 for (int i =split.length-1; i>=0; i--) {
			if(!split[i].isEmpty()) {
			str.append(split[i].trim());
			if(i!=0)
			str.append(" ");
			}
		}
		 return str.toString().trim();
	 }
	 
	 public static String reverseWords1(String s) {if (s == null) return null;
	    
	    char[] a = s.toCharArray();
	    int n = a.length;
	    
	    // step 1. reverse the whole string
	    reverse(a, 0, n - 1);
	    // step 2. reverse each word
	    reverseWord(a, n);
	    // step 3. clean up spaces
	    return cleanSpaces(a, n);}
	 
	 private static void reverse(char [] arr,int i,int j) {
		 while(i<=j) {
			 char c = arr[i];
			 arr[i]=arr[j];
			 arr[j]=c;
			 i++;
			 j--;
		 }
	 }
	 
	 public static void reverseWord(char []arr,int n) {
		int i=0;int j=0;
		while(i<n) {
			while(i<n || i<n && arr[i]==' ')i++;
			while(j<i || j<n && arr[j]!=' ')j++;
			reverse(arr,i,j-1);
		}
	}
	 
	 static String cleanSpaces(char[] a, int n) {
		    int i = 0, j = 0;
		      
		    while (j < n) {
		      while (j < n && a[j] == ' ') j++;             
		      while (j < n && a[j] != ' ') a[i++] = a[j++]; 
		      while (j < n && a[j] == ' ') j++;            
		      if (j < n) a[i++] = ' ';                     
		    }
		  
		    return new String(a).substring(0, i);
		  }

}
