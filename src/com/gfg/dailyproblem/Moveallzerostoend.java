package com.gfg.dailyproblem;

public class Moveallzerostoend {

	public static void main(String[] args) {
		int[] ar = {2,0,5,1,0,1};
		pushZerosToEnd(ar,ar.length);
	}
	
	 public static void pushZerosToEnd(int[] arr, int n) {
	        int start=-1;
	        for(int i=0;i<n;i++){
	            if(arr[i]!=0){
	                start++;
	                int temp=arr[i];
	                arr[i]=arr[start];
	                arr[start]=temp;
	            }
	        }
	    }
}
