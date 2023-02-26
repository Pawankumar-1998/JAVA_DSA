package com.Pawan.Linear_Search;

public class Minimum {
    public static void main(String[] args) {
        int[] nums = { 25 , 45 , 78 , 98 , 74 , 12 , -3 , 14 , 1 };
        System.out.println(min(nums));
    }
    static int min(int[] nums){
        int minimum = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]<minimum){
                minimum = nums[i];
            }
        }
        return minimum;
    }
}
