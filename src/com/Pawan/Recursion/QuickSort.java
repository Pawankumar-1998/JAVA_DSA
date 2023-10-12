package com.Pawan.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
            int[] arr = { 5 , 4, 3 , 2, 0};
            f(arr,0,arr.length-1);
       System.out.println(Arrays.toString(arr));
    }

    static void f(int[] arr , int low , int high ) {
        if (low >= high) {
            return;
        }
//            pivot index


        int start = low;
        int end = high;
        int mid = start + (end-start) / 2;
        int pivotNumber = arr[mid];

        while (start <= end) {

//            keep going if the start is less than pivot
            while (arr[start] < pivotNumber) {
                start++;
            }

//            keep going if the end is greater than the pivot
            while (arr[end] > pivotNumber) {
                end--;
            }

            if (start<=end) {
//            swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
//            send the left array
        f(arr, low, end);

//            send the right array
        f(arr, start , high);
    }

    }


