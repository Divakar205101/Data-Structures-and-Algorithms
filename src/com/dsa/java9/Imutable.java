package com.dsa.java9;

import java.util.List;
import java.util.Map;

public class Imutable {

    public static void main(String[] args) {
        List<Integer> list =List.of(1,2,3,3);
        list.forEach(System.out::println);

        Map<Integer, Integer> integerIntegerMap = Map.ofEntries(Map.entry(1, 2));
        System.out.println(integerIntegerMap);
    }
}
