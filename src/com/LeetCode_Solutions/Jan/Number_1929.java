package com.LeetCode_Solutions.Jan;

import java.util.Arrays;

public class Number_1929 {
    public static void main(String[] args) {
        /*
        Input: nums = [1,2,1]
        Output: [1,2,1,1,2,1]
         */
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(concatination(nums)));
    }
    static int[] concatination(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n ; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }

}
