package com.test.hacker.practice;

public class SlidingWindow {
	public static int maxSumSubarray(int[] arr, int k) {
		int n=arr.length;
		int maxSum=0;
		//window bigger than the arr length
		if(k>n) {
			return -1;
		}
		for(int i=0;i<k;i++) {
			maxSum=maxSum+arr[i];
		}
		int windowSum=maxSum;
		for(int i=k;i<n;i++) {
			windowSum=windowSum+arr[i]-arr[i-k];
			maxSum=Math.max(maxSum, windowSum);
		}
		return maxSum;
	}
	
	public static int maxSumSubarray2(int[] arr, int k) {
		int n=arr.length;
		int maxSum=0;
		//window bigger than the arr length
		if(k>n) {
			return -1;
		}
		int windowSum=0;
		for(int i=0;i<n;i++) {
			if(i<k) {
				windowSum=windowSum+arr[i];
			}else {
				windowSum=windowSum+arr[i]-arr[i-k];
			}
			maxSum=Math.max(maxSum, windowSum);
		}
		return maxSum;
	}

	public static int getMaxPerformanceSum(int[] performanceScores, int[] activationStatus, int k) {
		
		int n=performanceScores.length;
		int currentActiveScore=0;
		//window bigger than the arr length
		if(k>n) {
			return -1;
		}
		int[] inactiveScores=new int[n]; 
		//Obtain the performanceSum and the 
		for(int i=0;i<n;i++) {
			if(activationStatus[i]==1)
				currentActiveScore+=performanceScores[i];
			if(activationStatus[i]==0)
				inactiveScores[i]=performanceScores[i];
		}
		
		int windowSum=0;
		int maxInactiveSum=0;
		for(int i=0;i<n;i++) {
			if(i<k) {
				if(activationStatus[i]==0)
					windowSum=windowSum+inactiveScores[i];
			}else {
				if(activationStatus[i]==0)
					windowSum=windowSum+inactiveScores[i]-inactiveScores[i-k];
			}
			maxInactiveSum=Math.max(maxInactiveSum, windowSum);
		}
		return currentActiveScore+maxInactiveSum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 3;
		System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSumSubarray(arr, k));
		System.out.println("2 Maximum sum of subarray2 of size " + k + " is: " + maxSumSubarray2(arr, k));
		/////////
		int[] performanceScores = { 3, 2, 1, 10, 1 };
		int[] activationStatus = { 1, 0, 0, 1, 0 };
		k = 2;

		int result = getMaxPerformanceSum(performanceScores, activationStatus, k);
		System.out.println("Maximum Performance: " + result); // Output: 16
	}
}
