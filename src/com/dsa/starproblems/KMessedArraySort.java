package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.List;

public class KMessedArraySort {

    public static void main(String[] args) {
      int [] a = {6,3,8,1,2,3,4,2,2};
        sortKMessedArray(a,0);
        for(int x : a){
            System.out.println(x);
        }
    }

    static int[] sortKMessedArray(int[] arr, int k) {
        sort(arr,0,arr.length-1);
        return arr;
    }

    public static void sort(int[] arr,int start,int end) {
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    static void merge(int [] arr,int start,int mid,int end){
        List<Integer> list = new ArrayList<>();
        int left=start,right=mid+1;
        while(left<=mid && right<=end){
            if(arr[left]<=arr[right])
                list.add(arr[left++]);
            else
                list.add(arr[right++]);
        }
        while(left<=mid)
            list.add(arr[left++]);

        while(right<=end)
            list.add(arr[right++]);

        for(int i=start;i<=end;i++)
            arr[i]=list.get(i-start);
    }
}
