package com.test.hacker.practice;

public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
    	int low=0;
    	int high=arr.length-1;
    	while(low<=high) {
    		int mid= low + (high-low)/2;
    		if(arr[mid]==target) {
    			return mid;
    		}else if(arr[mid]<target) {
    			low=mid+1;
    		}else {
    			high=mid-1;
    		}
    	}
    	return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = bs.binarySearch(arr, target);
        System.out.println("Element found at index: " + result);  // Output: Element found at index: 4
    }
}
