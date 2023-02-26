package com.Pawan.Linear_Search;

public class Code {
    public static void main(String[] args) {
        int[] nums = { 25 , 45 , 78 , 98 , 74 , 12 , 14 };
        int target = 98;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] nums , int target){
        if (nums.length==0){
            return -1;
        }
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
