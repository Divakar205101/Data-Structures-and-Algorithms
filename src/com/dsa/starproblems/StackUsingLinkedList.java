package com.dsa.starproblems;

public class StackUsingLinkedList {
	// adding elemets front side
	static class MyStack {
	      class StackNode {
	         int data;
	         StackNode next;
	         StackNode(int a) {
	             data = a;
	             next = null;
	         }
	     }
	    StackNode top;

	    void push(int a) {
	    	 
	        StackNode temp = new StackNode(a);
	        temp.next = top;
	        top = temp;
	      
	    }

	    public void reverse() {
	    	
	    	StackNode next;
	    	StackNode prev = null;
	    	StackNode curr = top;
	    	while(curr!=null) {
	    		next = curr.next;
	    		curr.next = prev;
	    		prev = curr;
	    		curr = next;
	    		
	    	}
	    	
	    	top = prev;
	    	
	    	while(top!=null) {
//	    		System.out.println(top.data);
	    		top = top.next;
	    	}
	    	
	    }
	    
	    int pop() {
	    	if(top==null) {
	    		return -1;
	    	}
	    	int x = top.data;
	    	 top = top.next;
	    	 return x;
	    }
	}

	public static void main(String[] args) {
		MyStack m = new MyStack();
		m.push(2);
		m.push(6);
		m.push(3);
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());

	}

}
