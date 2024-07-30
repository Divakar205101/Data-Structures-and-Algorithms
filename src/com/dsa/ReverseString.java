package com.dsa;

public class ReverseString {

	public static void main(String[] args) {
	  char[]s = {'h','e','l','l','o'};
	  reverseString(s);
	}
	
	public static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j) {
        	char temp = s[i];
        	s[i] = s[j];
        	s[j] = temp;
        	i++;
        	j--;
        }
        for (char c : s) {
			System.out.println(c);
		}
    }

}