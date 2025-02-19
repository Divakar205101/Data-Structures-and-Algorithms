package com.dsa.starproblems;

import java.util.Stack;

public class Sortastack {

    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.add(19);
        integers.add(2);
        integers.add(33);
        integers.add(22);
        integers.add(3);
        integers.add(3);

        Sortastack sortastack = new Sortastack();

        Stack<Integer> sort = sortastack.sort(integers);
        while(!sort.isEmpty()){
            System.out.print(sort.pop()+" ");
        }

    }

    public Stack<Integer> sort(Stack<Integer> s) {
        popelemets(s);
       return s;
    }

    public void popelemets(Stack<Integer> s) {
        if(s.isEmpty())
            return;
        int element = s.pop();
        popelemets(s);
        sort2(s,element);

    }

    public void sort2(Stack<Integer> s,int element) {
        if (s.isEmpty()) {
            s.add(element);
            return;
        }
        if (s.peek() > element) {
            int temp = s.pop();
            sort2(s, element);
            s.push(temp);
        }else
            s.push(element);
    }
}
