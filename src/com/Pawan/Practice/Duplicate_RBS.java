package com.Pawan.Practice;

public class Duplicate_RBS {
    public static void main(String[] args) {
        int[] ans = {2,2,2,2,2,2,2,9,9,9,2,2,2,2,2};
        System.out.println(findingPivot(ans));
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
//          for duplicate elements
            if (nums[end] == nums[start] && nums[end]==nums[start]){
                if (nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if (nums[end]<nums[end-1]){
                    return end - 1;
                }
                end --;
            } else if (nums[start]<nums[mid] || nums[start]==nums[mid] && nums[mid]>nums[end]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
