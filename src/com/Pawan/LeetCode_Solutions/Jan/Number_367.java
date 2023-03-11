package com.Pawan.LeetCode_Solutions.Jan;

public class Number_367 {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(validPerfectSqaure(num));
    }
    static boolean validPerfectSqaure(int num){
        int start = 1;
        int end = num;

        while (start<=end){
            int mid = start + (end - start)/2;
            if (mid*mid==num){
                return true;
            } else if (mid*mid>num){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
