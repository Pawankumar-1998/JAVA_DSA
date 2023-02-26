package com.Pawan.LeetCode_Solutions.Jan;

import java.util.Arrays;

public class Number_1389 {
    public static void main(String[] args) {
        /*
        Input: nums = [0,1,2,3,4],
        index = [0,1,2,2,1]
        Output: [0,4,1,3,2]
         */
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }
    static int[] createTargetArray(int[] nums , int[] index){
        int n = nums.length;
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            target[index[i]]=nums[i];
        }
        return target;
    }
}
