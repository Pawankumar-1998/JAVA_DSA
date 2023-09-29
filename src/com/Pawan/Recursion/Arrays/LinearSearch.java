package com.Pawan.Recursion.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
            int[] arr = {3,9,5,15,6};
        System.out.println("the number you are searching for is at index : " + f(arr,5,0));
    }
    static boolean f(int[] arr , int target , int index){
        if (index == arr.length){
            return false;
        }

        return  (arr[index] == target)  ||  f(arr, target, index+1);

    }
}
