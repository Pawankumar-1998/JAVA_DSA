package com.Pawan.Assignments;

import java.util.Arrays;

public class Permuntation {
    public static void main(String[] args) {
//        https://leetcode.com/problems/build-array-from-permutation/
        int[] nums = {0,2,1,5,3,4};
//        Output: [0,1,2,4,5,3]
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    static int[] buildArray(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i <n ; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
