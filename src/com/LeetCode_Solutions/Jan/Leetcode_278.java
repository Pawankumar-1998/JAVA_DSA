package com.LeetCode_Solutions.Jan;

public class Leetcode_278 {
    public static void main(String[] args) {
//        int[] badVersion = { 1 , 2 , 3 , 4 , 5 , 6};
        System.out.println(badVersion(1));
    }
    static int badVersion(int n){
        int start =1;
        int end = n;
        int result =n;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (isBadVersion(mid)){
                end = mid - 1;
                result = mid;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

     static boolean isBadVersion(int mid) {
        if (mid>=4){
            return true;
        } else {
            return false;
        }
    }
}
