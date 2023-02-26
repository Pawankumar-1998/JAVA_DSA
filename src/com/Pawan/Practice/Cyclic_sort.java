package com.Pawan.Practice;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclicSort(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 1+i; j > 0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    static void swap(int[] arr , int first , int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }
}
