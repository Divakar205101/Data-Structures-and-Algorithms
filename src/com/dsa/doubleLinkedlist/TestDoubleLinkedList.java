package com.dsa.doubleLinkedlist;

public class TestDoubleLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		doubleLinkedList.add(10);
		doubleLinkedList.add(20);
		doubleLinkedList.add(30);
		doubleLinkedList.insertNodeatFirst(5);
		doubleLinkedList.insertNodeatFirst(2);
		doubleLinkedList.add(32);
		doubleLinkedList.add(33);
		doubleLinkedList.deleteFirst();
		doubleLinkedList.deleteFirst();
		doubleLinkedList.deleteLast();
		doubleLinkedList.disPlayforward();
	}

}
