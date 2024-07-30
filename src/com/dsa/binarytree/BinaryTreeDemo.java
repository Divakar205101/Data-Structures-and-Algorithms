package com.dsa.binarytree;

public class BinaryTreeDemo {

	public static void main(String[] args) {
	BinaryTree bt = new BinaryTree();
		    bt.add(6);
		    bt.add(4);
		    bt.add(8);
		    bt.add(3);
		    bt.add(5);
		    bt.add(7);
		    bt.add(9);
		    
//		    bt.preOrder();
//		    System.out.println("--------------------");
//			bt.preOrderIterative();
			
//		    System.out.println("--------------------");
			bt.inOrder();
			
//		    bt.postOrder();

	}

}
