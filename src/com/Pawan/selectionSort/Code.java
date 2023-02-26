package com.Pawan.selectionSort;

import java.util.Arrays;

public class Code {
    public static void main(String[] args) {
        int[] arr = { 5 , 3 , 4 , 1 , 2};
//        System.out.println(insertion(arr));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr ){
        for (int i=0;i< arr.length;i++){
            int last = arr.length - i - 1;
            int max = maxItem(arr , 0 , last);
            swap(arr,max,last);
        }
    }

     static void swap(int[] arr, int max, int last) {
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max]=temp;
    }

    static int maxItem(int[] arr , int start , int end ) {
         int max = start;
         for (int i = start; i <= end ; i++) {
             if (arr[max]<arr[i]){
                 max = i;
             }
         }
         return max;
    }
}
