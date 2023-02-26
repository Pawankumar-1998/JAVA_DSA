package com.Pawan.Practice;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = { 4 , 3 , 1 , 5 , 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
   static void bubbleSort(int[] arr){
        boolean sorted ;
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            sorted = false;
            for (int j = 1; j < n-i ; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    sorted = true;
                }
            }
            if (sorted==false){
                break;
            }
        }
    }


}
