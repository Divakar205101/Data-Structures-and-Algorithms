package com.dsa.starproblems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseStack {

    /*poping all elements from stack after inserting into stack before inserting removing all old elements
    and add new element after that adding poped elements*/

     static Stack<Integer> reslist = new Stack<Integer>();
    public static void main(String[] args) {
        System.out.println("Enter the element to be reversed: ");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String[] split = next.split(",");
        int[] array = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();

        Stack<Integer> list = new Stack<Integer>();
        int[] numbers = {3,2,1,7,6};
        for (int num : numbers) {
            list.push(num);
        }

        reverse(list);

        for(int i : list) {
            System.out.print(i + " ");
        }
    }

    static void reverse(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }

        int v = stack.pop();
        reverse(stack);
        insert(stack, v);
    }

    public static void insert(Stack<Integer> stack,int element) {
        if(stack.isEmpty()) {
            stack.push(element);
           return;
        }
        int v = stack.pop();
        insert(stack,element);
        stack.push(v);
    }
}
