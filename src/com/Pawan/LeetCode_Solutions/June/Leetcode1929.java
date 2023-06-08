package com.Pawan.LeetCode_Solutions.June;

import java.util.Arrays;

public class Leetcode1929 {
    public static void main(String[] args) {

        /*
        Input: nums = [1,2,1]
        Output: [1,2,1,1,2,1]
        Explanation: The array ans is formed as follows:
        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
        - ans = [1,2,1,1,2,1]
         */

        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(nums));
//        getConcatenation(nums);
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }
    static int[] getConcatenation(int[] arr){
        int n = arr.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i <n ; i++) {
            ans[i] = arr[i];
            ans[i+n] = arr[i];
        }
        return ans;
    }

}
