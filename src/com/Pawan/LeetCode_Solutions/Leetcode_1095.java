package com.Pawan.LeetCode_Solutions;

public class Leetcode_1095 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,3,2,1};
        int target = 2;
//        here return the index of the target
//        System.out.println(peakElement(arr));
        System.out.println(targetInMountainArray(arr,target));
    }

    static int targetInMountainArray(int[] arr , int target){
        int peak = peakElement(arr);
        int firstHalf = orderAgnostic(arr , target , 0 , peak);
        if (firstHalf!=-1){
            return firstHalf;
        }

        return orderAgnostic(arr,target,peak+1,arr.length-1);
    }

//    function for finding the peak element
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length -1 ;

        while (start<end){
            int mid = start + (end - start)/2;
            if (arr[mid]<arr[mid+1]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }

//    order agnostic binary search
    static int orderAgnostic(int[] arr , int target , int start , int end){


        while (start<=end){
            int mid = start + (end-start)/2;
            boolean isAscending;
            if (arr[start]<arr[end]){
                isAscending = true;
            } else {
                isAscending = false;
            }
            if (arr[mid]==target){
                return mid;
            }

            if (isAscending){
                if (target>arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target>arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
