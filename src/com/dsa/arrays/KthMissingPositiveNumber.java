package com.dsa.arrays;

public class KthMissingPositiveNumber {

	public static void main(String[] args) {
		int[] nums = {2,3,4,7,11};
		System.out.println(findKthPositive1(nums,5));
	}

	public static int findKthPositive(int[] arr, int k) {
		int [] res = new int [k];
		int i=0;
		int index =0;
		int val = 1;
		while(i<k && index<arr.length) {
			if(arr[index]==val) {
				index++;
				val++;
			}else if(arr[index]!=val) {
				res[i++] = val++; 
			} 
		}
		while(i<k && index>=arr.length) {
			res[i++] = val++; 
		}
		return res[k-1];
	}
	
	 static int findKthPositive1(int[] arr, int k) {
		    // Initialize the left and right pointers
		    int left = 0;
		    int right = arr.length;

		    // Start a loop and keep moving till left is less than right
		    while (left < right) {
		      // Calculate the mid
		      int mid = left + (right - left) / 2;

		      // If the number of missing elements is less than k
		      if (arr[mid] - mid - 1 < k) {
		        // Move left to mid + 1
		        left = mid + 1;
		      } else {
		        // Move right to mid
		        right = mid;
		      }
		    }

		    // Return the kth missing element
		    return left + k;
		  }

}
