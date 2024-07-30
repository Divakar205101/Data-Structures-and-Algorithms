package com.gfg.dailyproblem;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElementsinArray {
  public static void main(String[] args) {
	
}
  public static int[] topK(int[] nums, int k) {
      // Code here
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int num : nums){
           map.put(num,map.getOrDefault(num,0)+1);
       }
        PriorityQueue<Integer> maxHeap = new 
        PriorityQueue<>((a, b) -> {
            if(map.get(a).equals(map.get(b))){
                return b-a;
            }
            return map.get(b)-map.get(a);
        });
        for(int num : map.keySet()){
            maxHeap.offer(num);
        }
        int res[] = new int[k];
        for(int i=0;i<k;i++){
            res[i]=maxHeap.poll();
        }
        return res;
  }
}
