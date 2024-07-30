package com.dsa.strings;

public class RotateString {

	public static void main(String[] args) {
     System.out.println(rotateString("abcde","abced"));
	}
	
	 public static boolean rotateString(String s, String goal) {
		 boolean flag = false;
		 StringBuilder stringBuilder = new StringBuilder(s);
		 for (int i = 0; i < stringBuilder.length(); i++) {
			  Character val = stringBuilder.charAt(0);
			  stringBuilder.deleteCharAt(0);
			  stringBuilder.insert(stringBuilder.length(), val);
			  if (stringBuilder.toString().equals(goal)) {
				  flag = true;
				  break;
			}
		}
		 return flag;
	 }

}
