package com.dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

	public static void main(String[] args) {
	String [] emails = {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
	 System.out.println(numUniqueEmails(emails));
	}
	
	public static int numUniqueEmails(String[] emails) {
		Set<String> unique = new HashSet<>();
        for(int i=0;i<emails.length;i++) {
        	String mail = emails[i];
        	StringBuilder builder = new StringBuilder();     	
        	String[] split = mail.split("@");
        	String s1 = split[0];
        	String s2 = split[1];
        	if (split[0].contains("+")) {
				for (int j = 0; j < s1.length(); j++) {
					if (s1.charAt(j)=='+') {
						break;						
					}else {
						if (s1.charAt(j)!='.') {
							builder.append(s1.charAt(j));
						}					
					}					
				}
			}else {
				for (int j = 0; j < s1.length(); j++) {
					if (s1.charAt(j)!='.') {
						builder.append(s1.charAt(j));
					}
				}
			}
        	builder.append("@");
        	builder.append(s2);
        	System.out.println(builder.toString());
        	unique.add(builder.toString());
        }
        return unique.size();
    }

}
