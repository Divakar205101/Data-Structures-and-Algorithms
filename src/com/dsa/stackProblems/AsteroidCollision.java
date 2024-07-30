package com.dsa.stackProblems;


import java.util.Stack;

public class AsteroidCollision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,10,-5};
		int[] asteroidCollision = asteroidCollision(arr);
		for (int i = 0; i < asteroidCollision.length; i++) {
			System.out.println(asteroidCollision[i]);
		}
		
	}
	
	public static int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < asteroids.length; i++) {
			int j = asteroids[i];
			if (j>0 || stack.isEmpty()) {
				stack.push(j);
			} else {
				while (!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(j)) {
						stack.pop();
					if (!stack.isEmpty() && stack.peek()==Math.abs(j)) {
						stack.pop();
					} else {
						if (stack.isEmpty() || stack.peek() < 0) {
							stack.push(asteroids[i]);
	                    }
					}
				}
			}
		}
		int[] ar = new int[stack.size()];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = stack.pop();
			
		}
        return ar;
    }

}
