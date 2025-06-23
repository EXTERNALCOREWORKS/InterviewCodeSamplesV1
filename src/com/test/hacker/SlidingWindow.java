package com.test.hacker;

public class SlidingWindow {
	public static int maxSumSubarray(int[] arr, int k) {
		int n = arr.length;
		if (n < k) {
			throw new IllegalArgumentException("Array length must be greater than or equal to k");
		}

		int maxSum = 0;
		for (int i = 0; i < k; i++) {
			maxSum += arr[i];
		}

		int windowSum = maxSum;
		for (int i = k; i < n; i++) {
			windowSum += arr[i] - arr[i - k];
			//windowSum -= arr[i - k];
			maxSum = Math.max(maxSum, windowSum);
		}

		return maxSum;
	}
	
	public static int maxSumSubarray2(int[] arr, int k) {
		int n = arr.length;
		if (n < k) {
			throw new IllegalArgumentException("Array length must be greater than or equal to k");
		}

		int maxSum = 0, windowSum = 0;

		for (int i = 0; i < n; i++) {
			windowSum += arr[i];
			if(i>=k)
				windowSum -= arr[i - k];
			maxSum = Math.max(maxSum, windowSum);
		}

		return maxSum;
	}

	public static int getMaxPerformanceSum(int[] performanceScores, int[] activationStatus, int k) {
		int n = performanceScores.length;

		// Calculate the current active performance score
		int currentActiveScore = 0;
		// Calculate the performance contribution for inactive servers
		int[] inactiveScores = new int[n];
		for (int i = 0; i < n; i++) {
			if (activationStatus[i] == 1) {
				currentActiveScore += performanceScores[i];
			}
			if (activationStatus[i] == 0) {
				inactiveScores[i] = performanceScores[i];
			}
		}

		// Find the maximum sum of 'k' consecutive inactive servers
		int maxInactiveSum = 0, windowSum = 0;

		// Sliding window technique
		for (int i = 0; i < n; i++) {
			windowSum += inactiveScores[i];
			if (i >= k) {
				windowSum -= inactiveScores[i - k];
			}
			maxInactiveSum = Math.max(maxInactiveSum, windowSum);
		}

		// Maximum performance is the sum of current active and best possible activation
		// of k servers
		return currentActiveScore + maxInactiveSum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int k = 3;
		System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSumSubarray(arr, k));
		System.out.println("2 Maximum sum of subarray of size " + k + " is: " + maxSumSubarray2(arr, k));
		/////////
		int[] performanceScores = { 3, 2, 1, 10, 1 };
		int[] activationStatus = { 1, 0, 0, 1, 0 };
		k = 2;

		int result = getMaxPerformanceSum(performanceScores, activationStatus, k);
		System.out.println("Maximum Performance: " + result); // Output: 16
	}
}
