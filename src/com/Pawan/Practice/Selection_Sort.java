package com.Pawan.Practice;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = { 4 , 5, 2 , 3 , 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = max(arr,0,lastIndex);
            swap(arr,lastIndex,maxIndex);
        }
    }

    static int max(int[] arr , int start , int end){
        int max = start;
        for (int i = 1; i <=end ; i++) {
            if (arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr , int min , int max){
        int temp = arr[min];
        arr[min] = arr[max];
        arr[max] =temp;
    }
}
