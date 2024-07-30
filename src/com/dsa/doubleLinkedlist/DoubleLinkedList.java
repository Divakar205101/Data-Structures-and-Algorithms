package com.dsa.doubleLinkedlist;

public class DoubleLinkedList {

	private Node head;
	private Node tail;
	private Integer count;
	
	public DoubleLinkedList() {
		this.head=null;
		this.tail=null;
		this.count=0;
	}
	
	public boolean isEmpety() {
		return count==0;
	}
	
	public void add(Object value) {
		Node newnode = new Node(value);
		if (isEmpety()) {
			head = newnode;
		}else {
			tail.next=newnode;
		}
		newnode.previous = tail;
		tail = newnode;
		count++;
	}
	
	public void disPlayforward() {
		Node temp = head;
		while (temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void insertNodeatFirst(Object value) {
		Node newnode = new Node(value);
		head.previous = newnode;
		newnode.next= head;
		head=newnode;
	}
	
	public void insertNodeatLast(Object value) {
		Node newnode = new Node(value);
		newnode.previous=tail;
		tail.next=newnode;
		tail=newnode;
	}
	
	public void deleteFirst() {
		Node temp = head;
		if(head==tail) tail=null;
		if (!isEmpety()) {
			head.next.previous=null;
			head=head.next;
			temp.next=null;
		}
	}
	
	public void deleteLast() {
		if (!isEmpety()) {
			tail.previous.next=null;
			tail=tail.previous;
			tail.next=null;
		}
	}
}
