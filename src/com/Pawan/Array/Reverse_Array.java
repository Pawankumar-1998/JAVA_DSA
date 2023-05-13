package com.Pawan.Array;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = { 12 , 54 , 87  , 4 , 7};
        reverse(arr);
    }

    static void reverse(int[] arr){
       int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start ,end);
            start++;
            end--;
        }
    }


//    This function is used to swapping the elements in the array
    static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
