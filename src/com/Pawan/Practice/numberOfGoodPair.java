package com.Pawan.Practice;

public class numberOfGoodPair {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));

    }
    static int numIdenticalPairs(int[] nums) {
        int count=0;
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(j<i){
                j=nums.length-1;
            }
            while(i<j){
                if(nums[i]==nums[j]){
                    count+=1;
                }
                j--;
            }
        }
        return count;
    }





    /*
    class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(j<i){
                j=nums.length-1;
            }
            while(i<j){
                if(nums[i]==nums[j]){
                    count+=1;
                }
                j--;
            }
        }
        return count;
    }
}

     */




}
