package com.Pawan.LeetCode_Solutions.Jan;

public class Number_1512 {
    public static void main(String[] args) {
        /*
        Input: nums = [1,2,3,1,1,3]
        Output: 4
         */
        int[] nums = {1,1,1,1};
        System.out.println(goodPair(nums));


    }
    static int goodPair(int[] nums){
        int secondPointer = nums.length - 1;
        int count = 0;
        for (int firstPointer = 0; firstPointer < nums.length ; firstPointer++) {
            if (secondPointer<firstPointer){
                secondPointer = nums.length - 1;
            }
            while (secondPointer>firstPointer){
                if (nums[firstPointer]== nums[secondPointer]){
                    count++;
                }
                secondPointer--;
            }
        }
        return count;
    }
}
