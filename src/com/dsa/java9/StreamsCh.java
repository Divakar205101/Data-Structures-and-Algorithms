package com.dsa.java9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCh {

    public static void main(String[] args) {
        // it will take all values until condition true
        Stream.of(1,57,6,6,8).dropWhile(x -> x%2!=0).forEach(System.out::println);
        // it will take all values after condition returns true
        Stream.of(1,57,6,6,8).dropWhile(x -> x%2!=0).forEach(System.out::println);
        var list=Stream.iterate(1,x -> x<=10,x -> x+1).collect(Collectors.toList());
        System.out.println("ans "+list);
    }
}
