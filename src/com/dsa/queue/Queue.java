package com.dsa.queue;

import java.util.NoSuchElementException;

public class Queue {

	private Node front;
	private Node rear;
	
	int count;
	
	public void add(Object value) {
		Node node = new Node(value);
		if (isEmpety()) {
			front=node;
			
		}else {
			rear.next=node;
		}
		rear=node;
		count++;
	}
	
	public void display() {
		Node temp = front;
		Node dum=front;
		while (temp!=null) {
			System.out.println(temp.data);
			temp =front.next;
			front=temp;
			temp=front;
		}
	}
	
	public void romove() {
		if (isEmpety()) {
			throw new NoSuchElementException();
		}
		Node bummy=front.next;
		front = bummy;
		count--;
	}
	
	public boolean isEmpety() {
		return count==0;
	}
	
	public int size() {
		return count;
	}
}
