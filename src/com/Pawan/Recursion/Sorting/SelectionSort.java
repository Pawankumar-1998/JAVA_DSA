package com.Pawan.Recursion.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,8,1};
        f(arr, arr.length-1, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void f(int[] arr , int largestIndex , int row , int col){
        if (row==0){
            return;
        }

        if (col<row){
            if (arr[col] > arr[largestIndex]){
                largestIndex = col;
            }
            f(arr,largestIndex,row,col+1);
        } else {
            int temp = arr[row];
            arr[row] = arr[largestIndex];
            arr[largestIndex] = temp;
            f(arr,row-1,row-1,0);
        }
    }
}
