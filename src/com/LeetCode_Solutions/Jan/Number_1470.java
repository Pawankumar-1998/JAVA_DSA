package com.LeetCode_Solutions.Jan;

import java.util.Arrays;

public class Number_1470 {
    public static void main(String[] args) {
        /*
    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7]
     */
        int[] nums = {2,5,1,3,4,7};
        int n =4;
        System.out.println(Arrays.toString(shuffleArray(nums,n)));

    }
    static int[] shuffleArray(int[] nums , int n){
        int[] ans = new int[2*n];
        for(int i=0 ; i<n ; i++){
            ans[i*2]=nums[i];
            ans[i*2+1]=nums[i+n];
        }
        return ans;
    }


}
