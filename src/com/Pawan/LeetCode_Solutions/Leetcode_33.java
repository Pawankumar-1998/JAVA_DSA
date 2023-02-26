package com.Pawan.LeetCode_Solutions;

public class Leetcode_33 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(pivot(arr));
        System.out.println(pivot(arr));
    }

    static int findingTarget(int[] nums , int target){
        int pivot = pivot(nums);
        if (pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if (nums[pivot]==target){
            return pivot;
        }
        if (target>=nums[0]){
            return binarySearch(nums,target,0 , pivot-1);
        } else {
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }

    static int binarySearch(int[] ans , int target , int start , int end){
        while (start<end){
            int mid = start + (end - start)/2;
            if (ans[mid]==target){
                return target;
            } else if (target>ans[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
//    finding the pivot
    static int pivot(int[] ans){
        int start = 0;
        int end = ans.length - 1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (mid<end && ans[mid]>ans[mid+1]){
                return mid;
            }
            if (mid>start && ans[mid]<ans[mid-1]){
                return mid - 1;
            }
            if ( ans[mid]<=ans[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
            return  -1;
    }
}
