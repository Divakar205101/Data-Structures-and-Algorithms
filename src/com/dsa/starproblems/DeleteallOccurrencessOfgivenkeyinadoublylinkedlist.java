package com.dsa.starproblems;

public class DeleteallOccurrencessOfgivenkeyinadoublylinkedlist {

	static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}

	}

	static class DoubleLinkedList {
		Node head;

		public void add(Node node) {
			if (head == null) {
				head = node;
			} else {
				Node temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}
				node.prev = temp;
				temp.next = node;
			}
		}

		void display() {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		doubleLinkedList.add(new Node(2));
		doubleLinkedList.add(new Node(5));
		doubleLinkedList.add(new Node(2));
		doubleLinkedList.add(new Node(4));
		doubleLinkedList.add(new Node(8));
		doubleLinkedList.add(new Node(10));
		doubleLinkedList.add(new Node(2));
		doubleLinkedList.add(new Node(2));
		Node node = deleteAllOccurOfX1(doubleLinkedList.head, 2);
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	static Node deleteAllOccurOfX(Node head, int x) {
		if (head == null)
			return null;
		Node dumy = new Node(-1);
		Node s = dumy;
		Node temp = head;
		while (temp != null) {
			if (temp.data != x) {
				Node node = new Node(temp.data);
				dumy.next = node;
				node.prev = dumy;
				dumy = dumy.next;
			}
			temp = temp.next;
		}
		return s.next;
	}

	static Node deleteAllOccurOfX1(Node head, int x) {
		if (head == null)
			return head;
		while (head != null && head.data == x) {
			head = head.next;
			head.prev = null;
		}
		Node temp = head;
		while (temp != null) {
			if (temp.data == x) {

				if (temp.next != null) {
					temp.next.prev = temp.prev;
				}
				temp.prev.next = temp.next;
			}
			temp = temp.next;
		}
		return head;
	}

}
