package com.Pawan.Assignments;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
//        https://leetcode.com/problems/concatenation-of-array/
        int[] nums = {1,2,1};

        System.out.println(Arrays.toString(concatenation(nums)));

    }
    static int[] concatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i <n ; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
