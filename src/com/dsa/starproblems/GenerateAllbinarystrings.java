package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateAllbinarystrings {
    public static void main(String[] args) {
        List<String> strings = generateBinaryStrings(3);
        System.out.println(strings);
    }

    public static List<String> generateBinaryStrings(int n) {
        ArrayList<String> list = new ArrayList<>(n);
        String word = "";
        word+='0';
        generateBinaryStrings(word,n,list);
        word ="1";
        generateBinaryStrings(word,n,list);
        return list;
    }

    public static void generateBinaryStrings(String num,int n,List<String> list) {
        if(num.length()==n) {
            list.add(num);
            return;
        }else if(num.charAt(num.length()-1)=='1') {
            generateBinaryStrings(num+'0',n,list);
        }else {
            generateBinaryStrings(num+'0',n,list);
            generateBinaryStrings(num+'1',n,list);
        }
    }

}
