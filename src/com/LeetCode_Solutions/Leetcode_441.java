package com.LeetCode_Solutions;

public class Leetcode_441 {
    public static void main(String[] args) {
        int n = 10;
//        return the number of rows it can be fit in
        System.out.println(arrangingCoin(n));
    }
    static int arrangingCoin(int n){
        int num = n;
        int i = 1;
        while (num>=i){
            num = num - i;
            i++;
        }
        return i - 1;
    }
}
