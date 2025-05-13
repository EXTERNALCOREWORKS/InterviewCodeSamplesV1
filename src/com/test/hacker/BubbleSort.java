package com.test.hacker;

import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
            	System.out.println("HOLA");
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
    	BubbleSort bs= new BubbleSort();
    	int[] arr= {12, 90, 25, 34, 64, 11,22};
    	bs.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));  // Output: [11, 12, 22, 25, 34, 64, 90]
    } 
}

