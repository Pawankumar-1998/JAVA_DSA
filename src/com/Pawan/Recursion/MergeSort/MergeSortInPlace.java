package com.Pawan.Recursion.MergeSort;


import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = { 5 , 4,  3, 2 , 1};
        f(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void f(int[] arr , int start , int end){
        if (start==end){
            return;
        }

        int mid = (start + end) / 2;

        f(arr, start, mid);
        f(arr, mid+1, end);

        merge(arr,start,mid,end);
    }

    static void merge(int[] arr , int start , int mid , int end){

        int[] ansArray =  new int[ (end-start) + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i<=mid && j<=end){
            if (arr[i] < arr[j]){
                ansArray[k] = arr[i];
                i++;
            } else {
                ansArray[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<=mid){
            ansArray[k] = arr[i];
            i++;
            k++;
        }

        while (j<=end){
            ansArray[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < ansArray.length; l++) {
            arr[start+l] = ansArray[l];
        }
    }
}
