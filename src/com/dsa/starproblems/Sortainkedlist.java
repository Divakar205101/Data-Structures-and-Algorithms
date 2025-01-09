package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.List;

class Node {
	int val;
	Node next;

	public Node(int val) {
		super();
		this.val = val;
	}

	public Node(int val, Node next) {
		super();
		this.val = val;
		this.next = next;
	}

}

class SinglieLinkedList {
	Node head;

	void add(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = node;
		}
	}

	void display() {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}

public class Sortainkedlist {

	public static void main(String[] args) {
		SinglieLinkedList list = new SinglieLinkedList();
		list.add(new Node(1));
		list.add(new Node(2));
		list.add(new Node(2));
		list.add(new Node(1));
		list.add(new Node(2));
		list.add(new Node(0));
		list.add(new Node(2));
		list.add(new Node(2));

//		list.display();

		Node segregate = segregate(list.head);
		while (segregate != null) {
			System.out.println(segregate.val);
			segregate = segregate.next;
		}
	}

	static Node segregate(Node head) {
		int zeros = 0;
		int ones = 0;
		int twos = 0;

		while (head != null) {
			if (head.val == 0) {
				zeros++;
			} else if (head.val == 1) {
				ones++;
			} else {
				twos++;
			}
			head = head.next;
		}

		Node temp = new Node(-1);
		Node curr = temp;
		  while(zeros>0) {
			Node node = new Node(0);
			temp.next = node;
			temp = temp.next;
			zeros--;
		}
		 while(ones>0) {
			Node node = new Node(1);
			temp.next = node;
			temp = temp.next;
			ones--;
		}
		while(twos>0) {
			Node node = new Node(2);
			temp.next = node;
			temp = temp.next;
			twos--;
		}
		return curr.next;
	}

}
