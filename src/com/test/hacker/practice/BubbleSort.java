package com.test.hacker.practice;

import java.util.Arrays;

public class BubbleSort {
    public void bubbleSortAsc(int[] arr) {
    	int n=arr.length;
    	int aux;
        for(int i=0; i < n-1;i++) {
        	for (int j=0;j < n-i-1;j++) {
        		if(arr[j]>arr[j+1]) {
        			aux=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=aux;
        		}
        	}
        }
    }
    
    public void bubbleSortDesc(int[] arr) {
    	int n=arr.length;
    	int aux;
        for(int i=0; i < n-1;i++) {
        	for (int j=0;j < n-i-1;j++) {
        		if(arr[j]<arr[j+1]) {
        			aux=arr[j+1];
        			arr[j+1]=arr[j];
        			arr[j]=aux;
        		}
        	}
        }       
    }
    
    public static void main(String[] args) {
    	BubbleSort bs= new BubbleSort();
    	int[] arr= {12, 90, 25, 34, 64, 11,22};
    	bs.bubbleSortAsc(arr);
        System.out.println(Arrays.toString(arr));  // Output: [11, 12, 22, 25, 34, 64, 90]
        bs.bubbleSortDesc(arr);
        System.out.println(Arrays.toString(arr));  // Output: [90, 64, 34, 25, 22, 12, 11]
    } 
}
