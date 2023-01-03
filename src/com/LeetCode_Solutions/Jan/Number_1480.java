package com.LeetCode_Solutions.Jan;

import java.util.Arrays;

public class Number_1480 {
    public static void main(String[] args) {
        /*
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
         */
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums){
        int n  = nums.length;
        int[] ans = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
