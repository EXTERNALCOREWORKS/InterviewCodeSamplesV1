package com.test.hacker;

public class LinearSearch {
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = ls.linearSearch(arr, target);
        System.out.println("Element found at index: " + result);  // Output: Element found at index: 4
    }
}
