package com.Pawan.Linear_Search;

public class SearchINRAnge {
    public static void main(String[] args) {
        int[] nums = { 25 , 45 , 78 , 98 , 74 , 12 , 14 };
        int target = 98;
        System.out.println(linearSearch(nums,target,1,4));
    }
    static int linearSearch(int[] nums , int target , int start , int end){
        if (nums.length==0){
            return -1;
        }
        for (int i = start; i <end ; i++) {
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
