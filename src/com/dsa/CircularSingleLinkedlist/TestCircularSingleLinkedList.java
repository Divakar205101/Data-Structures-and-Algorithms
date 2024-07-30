package com.dsa.CircularSingleLinkedlist;

public class TestCircularSingleLinkedList {

	public static void main(String[] args) {
		CircularSinglyLinkedList circsinlist = new CircularSinglyLinkedList();
		circsinlist.add(10);
		circsinlist.add(20);
		circsinlist.add(30);
//		circsinlist.addNodeatFirst(5);
//		circsinlist.addNodeLast(35);
//		circsinlist.addNodeLast(40);
//		circsinlist.removeFirstNode();
		circsinlist.reomveLastNode();
		circsinlist.display();
	}

}
