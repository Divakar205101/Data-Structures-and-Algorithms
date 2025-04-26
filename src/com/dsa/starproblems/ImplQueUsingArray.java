package com.dsa.starproblems;

public class ImplQueUsingArray {
	
	static class MyQueue {

	    int front, rear;
		int arr[] = new int[100005];

	    MyQueue()
		{
			front=0;
			rear=0;
		}
		
		//Function to push an element x in a queue.
		void push(int x)
		{
			arr[rear]=x;
			rear+=1;
		} 

	    //Function to pop an element from queue and return that element.
		int pop()
		{
			if(front==rear)
				return -1;
			int ele = arr[front];
			front+=1;
			return ele;
		} 
	}

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.push(5);
		myQueue.push(7);
		System.out.println(myQueue.pop());
		myQueue.push(8);
		System.out.println(myQueue.pop());
	}

}
