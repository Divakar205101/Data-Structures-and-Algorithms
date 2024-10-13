package com.dsa.starproblems;

public class CountInversions {
	static long c=0;
	public static void main(String[] args) {
		long arr[] = {5,3,2,4,1};
		
		System.out.println(inversionCount(arr));

	}

	
	   // Function to count inversions in the array.
    static long inversionCount(long arr[]) {
        // Create a temporary array to help with the merge process
        long temp[] = new long[arr.length];
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    }

    // Function that sorts the array and counts the inversions
    static long mergeSortAndCount(long arr[], long temp[], int left, int right) {
        long count = 0;
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Count inversions in left half
            count += mergeSortAndCount(arr, temp, left, mid);

            // Count inversions in right half
            count += mergeSortAndCount(arr, temp, mid + 1, right);

            // Merge both halves and count cross inversions
            count += mergeAndCount(arr, temp, left, mid, right);
        }
        return count;
    }

    // Function to merge two halves and count inversions
    static long mergeAndCount(long arr[], long temp[], int left, int mid, int right) {
        int i = left;    // Starting index for left subarray
        int j = mid + 1; // Starting index for right subarray
        int k = left;    // Starting index to be sorted
        long count = 0;

        // While both subarrays have elements to compare
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                // There are mid - i inversions because all elements left of i
                // in the left subarray are greater than arr[j].
                count += (mid + 1 - i);
            }
        }

        // Copy remaining elements of the left subarray, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of the right subarray, if any
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted subarray into the original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return count;
    }

}
