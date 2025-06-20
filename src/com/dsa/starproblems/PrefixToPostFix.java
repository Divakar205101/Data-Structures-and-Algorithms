package com.dsa.starproblems;

import java.util.Stack;

public class PrefixToPostFix {

	public static void main(String[] args) {
		String ans = "*-A/BC-/AKL";
		System.out.println(preToPost(ans));

	}
	
	static String preToPost(String pre_exp) {
		String ans="";
		Stack<String> stack = new Stack<>();
		for (int i = pre_exp.length()-1; i>=0; i--) {
			char charAt = pre_exp.charAt(i);
			   if ((charAt>='A'&&charAt<='Z') || (charAt>='a'&&charAt<='z')) {
				   stack.push(""+charAt);
			   }else {
				   if(!stack.isEmpty()) {
					String pop1 = stack.pop();
					String pop2 = stack.pop();
					String c = ""+charAt;
					String res = pop1.concat(pop2).concat(c);
					stack.push(res);
				}
			   }
		}
		
		return stack.pop();
        
    }

}
