package com.dsa.doubleLinkedlist;

public class Node {

	public Object data;
	public Node previous;
	public Node next;
	
	public Node(Object data) {
		this.previous = null;
		this.next=null;
		this.data=data;
	}
	
	
}
