package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		 String name = "Divakar";
	        String str = "";
	        List<Character> chars = new ArrayList<>();
	        List<String> elements = new ArrayList<>();
	        for(int i=0;i<name.length();i++){
	        	chars.add(name.charAt(i));
	            str+=name.charAt(i);
//	            elements.add(str);
	            for(int j=i+1;j<name.length();j++){
//	            	str+=name.charAt(j);
	            	if(!chars.contains(name.charAt(j))){
	                	chars.add(name.charAt(j));
	                   str+=name.charAt(j); 
	                }else {
//	                	str = str.substring(i, j);
	                     elements.add(str);
	                     str="";
	            	
	            	chars.clear();
	                }
	            	System.out.println(str);
	            }
	            str="";
	            chars.clear();
	        }
	        
	       System.out.println(elements);
	        

	}

}
