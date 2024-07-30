package com.gfg.dailyproblem;

public class ReverseVowelsofaString {

	public static void main(String[] args) {
		solve("leetcode");
	}
    public static void solve(String s) {
    	 char[] ch = s.toCharArray();
    	int i=0;int j=ch.length-1;
    	while(i<j) {
    		char x = Character.toLowerCase(ch[i]);
    		char y = Character.toLowerCase(ch[j]);
				 if ((x=='a'||x=='e'||x=='i'||x=='o'||x=='u')&&
						  (y=='a'||y=='e'||y=='i'||y=='o'||y=='u')) {
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					i++;
					j--;
				}else {
					if (x!='a'&&x!='e'&&x!='i'&&x!='o'&&x!='u'){
							   i++;
				}
					if (y!='a'&&y!='e'&&y!='i'&&y!='o'&&y!='u'){
						   j--;
					} 	
			}
		}
    	 for (int j2 = 0; j2 < ch.length; j2++) {
    		 System.out.print(ch[j2]);
    	}
    }
}
