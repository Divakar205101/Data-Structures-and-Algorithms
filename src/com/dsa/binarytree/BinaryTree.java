package com.dsa.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

@SuppressWarnings("unused")
public class BinaryTree {

	private TreeNode root;
	private int length;
	
	public void add(int value) {
	    root = addRecursive(root, value);
	    length++;
	}
	
	
	private TreeNode  addRecursive(TreeNode current,int value) {
		if (current == null) {
	        return new TreeNode(value);
	    }

	    if (value < current.data) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.data) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        return current;
	    }

	    return current;
	}
	
	public void preOrder() {
		preOrderRecursive(root);
	}
	
	public void preOrderRecursive(TreeNode cuurnode) {
		if (cuurnode==null) {
			return;
		}
		System.out.println(cuurnode.data);
		preOrderRecursive(cuurnode.left);
		preOrderRecursive(cuurnode.right);
	}
	
	public void preOrderIterative() {
		if (root==null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			   TreeNode temp = stack.pop();
			   System.out.println(temp.data);
			   if (temp.right!=null) {
				  stack.push(temp.right);
			  }
			   if (temp.left!=null) {
				  stack.push(temp.left);
			}
		}
	}
	
	public void inOrder() {
		//inOrderRecursice(root);
		traverseInOrder(root);
	//	traverseInOrderIterative(root);
	}
	
	
	public void traverseInOrder(TreeNode node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.data);
	        traverseInOrder(node.right);
	    }
	}
	
	public void traverseInOrderIterative(TreeNode node) {
		if (root==null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode temp = root;
		while (!stack.isEmpty() || temp!=null) {
			  if (temp!=null) {
				stack.push(temp);
				temp=temp.left;
			} else {
                 temp=stack.pop();
                 System.out.println(temp.data);
                 temp=temp.right;
			}	
		}
	}
	
	public void postOrder() {
		traversePostOrder(root);
	}
	
	public void traversePostOrder(TreeNode node) {
	    if (node != null) {
	        traversePostOrder(node.left);
	        traversePostOrder(node.right);
	        System.out.print(" " + node.data);
	    }
	}
	
	public void traversePostOrderIterative(TreeNode node) {
		if (root==null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode curr = root;
		while (!stack.isEmpty() || curr!=null) {
			if (curr!=null) {
				stack.push(curr);
				curr= curr.left;
			} else {
			TreeNode temp = stack.peek().right;
				if (temp==null) {
					temp=stack.pop();
					System.out.println(temp.data);
					while (!stack.isEmpty()&&temp==stack.peek().right) {
						temp=stack.pop();
						System.out.println(temp.data);
					}
				} else {
                     curr=temp;
				}
			}
		}
	}
	
	public void levelorder() {
	Queue<TreeNode>	 queue=new LinkedList<>();
	queue.offer(root);
	while (!queue.isEmpty()) {
		TreeNode poll = queue.poll();
		System.out.println(poll.data);
		if (poll.left!=null) {
			queue.offer(poll.left);
		}
		if (poll.right!=null) {
			queue.offer(poll.right);
		}
	}
	}
	
	public int size() {
		return length;
	}
}
