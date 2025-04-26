package com.dsa.starproblems;

import java.util.LinkedList;
import java.util.Queue;

public class ImplStackUsingQueue {
	
	static class MyStack {
		Queue<Integer> queue;
		
		MyStack(){
			queue = new LinkedList<Integer>(); 
		}
		
		public void push(int x) {
			queue.add(x);
			for(int i=0;i<queue.size()-1;i++) {
				queue.add(queue.poll());
			}
	    }
	    
	    public int pop() {
	    	return queue.poll();
	    }
	    
	    public int top() {
	        return  queue.peek();
	    }
	    
	    public boolean empty() {
	    	return queue.isEmpty(); 
	    }
		
	}

	public static void main(String[] args) {
		MyStack obj = new MyStack();
		 obj.push(2);
		 obj.push(8);
		 obj.push(1);
		  int param_2 = obj.pop();
		  System.out.println(param_2);
		 int param_3 = obj.top();
		 System.out.println(param_3);
		 boolean param_4 = obj.empty();
		 System.out.println(param_4);

	}

}
