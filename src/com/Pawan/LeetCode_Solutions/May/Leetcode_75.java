package com.Pawan.LeetCode_Solutions.May;

import java.util.Arrays;

public class Leetcode_75 {
    public static void main(String[] args) {
        /*

        Given an array nums with n objects colored red, white, or blue,
        sort them in-place so that objects of the same color are adjacent,
        with the colors in the order red, white, and blue.
        We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
        You must solve this problem without using the library's sort function.

        Example 1:
        Input: nums = [2,0,2,1,1,0]
        Output: [0,0,1,1,2,2]
         */

        int[] nums = {2,0,2,1,1,0};
        sortingColors(nums);

        System.out.println(Arrays.toString(nums));

    }

    static void sortingColors(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j>0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }


    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
