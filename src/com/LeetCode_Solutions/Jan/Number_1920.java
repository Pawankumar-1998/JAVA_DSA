package com.LeetCode_Solutions.Jan;

import java.util.Arrays;

public class Number_1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
//        return ans = { 0,1,2,4,5,3 }
        System.out.println(Arrays.toString(permutation(nums)));
    }

    static int[] permutation(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
