package com.Pawan.LeetCode_Solutions.June;

import java.util.Arrays;

public class Leetcode1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums){
        for(int i=1;i< nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}