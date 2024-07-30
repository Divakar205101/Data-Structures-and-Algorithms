package com.dsa.map;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	int size = 0;
	int re = -1 ;
	Map<Integer, Integer> map = new HashMap<>();
	
	public LRUCache(int capacity) {
        this.size=capacity;
    }
     
	public static void main(String[] args) {
		
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(1, 1);
		lRUCache.put(2, 2);
		System.out.println(lRUCache.get(1));
		lRUCache.put(3, 3);
		System.out.println(lRUCache.get(2));
		lRUCache.put(4, 4);
		System.out.println(lRUCache.get(1));
		System.out.println(lRUCache.get(3));
		System.out.println(lRUCache.get(4));
		
	}
	 
	
    
    public int get(int key) {
       if (map.containsKey(key)) {
    	    re = key;
		    return map.get(key);
		} else {
	        return -1;
		} 
    }
    
    public void put(int key, int value) { 
			
			if (map.size()==size) {
				map.remove(map.get(re));
			}
			map.put(key, value);
    }

}
