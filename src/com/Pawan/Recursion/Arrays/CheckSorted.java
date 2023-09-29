package com.Pawan.Recursion.Arrays;

public class CheckSorted {
    public static void main(String[] args) {
//        check if the array is sorted or not
        int[] arr = { 1,3,9,4,12};
        System.out.println(f(arr,0));


    }

    static boolean f(int[] arr , int index){
        if (index == arr.length-1){
            return true;
        }

        if (arr[index] > arr[index+1]){
            return false;
        }

        return f(arr, index+1);
    }
}
