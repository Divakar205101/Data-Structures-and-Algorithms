package com.dsa.starproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElementII {

	public static void main(String[] args) {
		int [] arr = {3,2,3};
		List<Integer> majorityElement = majorityElement(arr);
		System.out.println(majorityElement);
	}
	
	 public static List<Integer> majorityElement(int[] nums) {
		 int n =nums.length;
		 Map<Integer,Integer> map = new HashMap<>();
		 for (Integer integer : nums) {
			 map.put(integer, map.getOrDefault(integer, 0)+1);
		  }
	      
		 List<Integer> collect = map.entrySet().stream().filter(enter -> enter.getValue()>n/3).map(x -> x.getKey()).collect(Collectors.toList());
		 
		 return collect;
	 }
	 
	 public static List<Integer> optimal(int[] nums) {
		 List<Integer> collect = new ArrayList<>();
		 int e1=0,e2=0,c1=0,c2=0;
		 for (int i : nums) {
			 if (c1==0 && i!=e2) {
				  c1+=1;
				  e1=i;
			} else if (c2==0 && i!=e1){
				  c2+=1;
				  e2=i;	
			}else if(e1==i)
				  c1++;
			else if(e2==i)
				  c2++;
			else {
				c1--;
				c2--;
			}
		}
		 int count1=0,count2=0;
		 for(int i :nums) {
			 
			 if(i==e1)
				 count1++;
			 else if(i==e2)
				 count2++;
			 
		 }
		 
		 if(count1>nums.length/3)collect.add(e1);
		 if(count2>nums.length/3)collect.add(e2);
		 
		 return collect;
	 }

}
