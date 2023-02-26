package com.Pawan.Assignments;

import java.util.Arrays;

public class Sum_OfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(sum(nums)));
    }
    static int[] sum(int[] nums){
        int n = nums.length;
        for (int i = 1; i <n ; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
