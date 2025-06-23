package com.test.hacker.practice;

import java.util.Arrays;

public class MergeSort2 {
	public static void mergeSort(int[] arr) {
		if(arr.length<2)
			return;
		int mid=arr.length/2;
		int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
		int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);
		//
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(arr,leftArr,rightArr);
	}
	
	public static void merge(int[] arr, int[] leftArr, int[] rightArr) {
		int i=0,j=0,k=0;
		while(i<leftArr.length && j < rightArr.length) {
			arr[k++]=(leftArr[i]<=rightArr[j])? leftArr[i++]:rightArr[j++];
		}
		while(i<leftArr.length) {
			arr[k++]=leftArr[i++];
		}
		while(j<rightArr.length) {
			arr[k++]=rightArr[j++];
		}
	}

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        System.out.println("Original: " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Sorted:   " + Arrays.toString(array));
    }
}
