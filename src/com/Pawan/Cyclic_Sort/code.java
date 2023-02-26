package com.Pawan.Cyclic_Sort;

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correct = arr[i] - 1; // current index of the element is value of the element - 1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            } else {
                i++;
            }
        }
     }
//      this method is used for swapping the array
     static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
     }
}
