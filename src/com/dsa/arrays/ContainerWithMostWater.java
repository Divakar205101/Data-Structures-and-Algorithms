package com.dsa.arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
       int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
	}
	
    public static int maxArea(int[] height) {
        int size = 0;
        int left = 0;
        int right = height.length-1;
        while (left<right) {
        	 int temp = (right - left) * Math.min(height[left], height[right]);
        	 size = Math.max(size, temp);
			if (height[left]<height[right]) {
				left++;
			}else {
				right--;
			}
		}		
        return size;
    }

}
