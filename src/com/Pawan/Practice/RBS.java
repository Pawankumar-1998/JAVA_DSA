package com.Pawan.Practice;

public class RBS {
    public static void main(String[] args) {
        int[] arr= { 8 , 9 , 12 , 15 , 3 , 5 , 7};
//        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6}; // this is not rotated so this will return -1;
        System.out.println(findingPivot(arr));
    }

    static int binarySearch(int[] nums , int target , int start , int end ){
        while(start<=end){
            int mid = start + (end - start)/2;
            if (target==nums[mid]){
                return mid;
            }
            if (target>nums[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return  -1;
    }
    static int findingPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
//            this is the first case
            if (mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
//            this is second case
            if (mid>start &&nums[mid]<nums[mid-1]){
                return mid - 1;
            }
//            this is the 3rd case
            if (nums[start]>=nums[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
//            this is the fourth case

        }
        return -1;
    }
}
