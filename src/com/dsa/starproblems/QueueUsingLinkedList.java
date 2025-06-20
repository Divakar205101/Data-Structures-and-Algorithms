package com.dsa.starproblems;

public class QueueUsingLinkedList {

	static class QueueNode {
		int data;
		QueueNode next;

		QueueNode(int a) {
			data = a;
			next = null;
		}
	}

	static class MyQueue {
		QueueNode front, rear;

		// Function to push an element into the queue.
		void push(int a) {
			QueueNode temp = new QueueNode(a);
			if (rear == null) {
				rear = temp;
				front = rear;
			}else {
				rear.next=temp;
				rear = rear.next;
			}
			
			if (front == null ) {
				front = rear;
			}

		}

		// Function to pop front element from the queue.
		int pop() {

			if (front == null) {
				return -1;
			}
			int x= front.data;
			front = front.next;
			return x;
		}
	}

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.push(78);
		System.out.println(myQueue.pop());
		System.out.println(myQueue.pop());
		System.out.println(myQueue.pop());
		myQueue.push(93);
		System.out.println(myQueue.pop());
		System.out.println(myQueue.pop());
		myQueue.push(28);
		myQueue.push(60);
		System.out.println(myQueue.pop());
		myQueue.push(41);
	}

}
