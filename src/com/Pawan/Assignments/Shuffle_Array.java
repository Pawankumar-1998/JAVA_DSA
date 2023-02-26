package com.Pawan.Assignments;

import java.util.Arrays;

public class Shuffle_Array {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
//        Output: [2,3,5,4,1,7]
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static int[] shuffle(int[] nums , int n){
        int n2 = n;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length/2 ; i++) {
            ans[i*2]=nums[i];
            ans[i*2+1]=nums[n2];
            n2++;
        }
        return ans;
    }
}
