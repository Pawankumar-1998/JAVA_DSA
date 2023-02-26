package com.Pawan.Searching.BinarySearch;

public class Ceiling_Number {
    public static void main(String[] args) {
//        ceiling means finding a number greater than equal to target
        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
        System.out.println(ceiling(arr,target));

    }
    static int ceiling(int[] arr , int target){
//        if target is greater than the last index return -1
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start<=end){
             mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return arr[mid];
            } else if (arr[mid]<target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
