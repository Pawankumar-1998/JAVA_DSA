package com.Pawan.LeetCode_Solutions;

public class Leetcode_1672 {
    public static void main(String[] args) {
        int[][] accounts= {
                {1,2,3},
                {3,2,1}
        };
        System.out.println((max(accounts)));
    }
    static int max(int[][] accounts){
        int n = accounts.length;
        int max =0;
        for (int i = 0; i <n ; i++) {
            int sum =0;
            for (int j = 0; j <accounts[i].length ; j++) {
                sum = accounts[i][j] + sum;
            }
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }
}
