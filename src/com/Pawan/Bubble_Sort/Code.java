package com.Pawan.Bubble_Sort;

import java.util.Arrays;

public class Code {
    public static void main(String[] args) {
        int[] arr = { 4,5,1,2,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Time Complexity is O(N^2) and space is O(1)
    // this is not adaptive we are making it adaptive by using boolean
    static void bubbleSort(int[] arr){
        boolean sorted;
        for (int i = 0; i < arr.length; i++) {
            sorted = false;
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j]<arr[j-1]){
//                    if entered swap will be done
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    sorted = true; //-> for adaptive check 
                }
            }

//            if swap didnt happen for a particular value of i , that means array is sorted
            if (sorted==false){
                break;
            }
        }
    }
}
