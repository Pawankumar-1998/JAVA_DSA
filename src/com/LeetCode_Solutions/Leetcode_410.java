package com.LeetCode_Solutions;

public class Leetcode_410 {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int peices = 2;
//        System.out.println(Math.max(5,2));
        System.out.println(largestSum(arr,peices));
    }

    static int largestSum(int[] nums , int peices){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length - 1 ; i++) {
            start = Math.max(nums[i] , 0);
            end = end + nums[i];
        }

        while (start<end){
            int mid = start + (end - start) / 2;
            int sum = 0;
            int count = 1;
            for (int num : nums){
                if (sum+num>mid){
                    sum = num;
                    count++;
                } else {
                    sum = sum + num;
                }
            }
            if (count>peices){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }


}
