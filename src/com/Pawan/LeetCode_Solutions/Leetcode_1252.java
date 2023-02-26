package com.Pawan.LeetCode_Solutions;

public class Leetcode_1252 {
    public static void main(String[] args) {
        int[][] indices = {
                {0,1},
                {1,1}
        };
        int m = 2;
        int n = 3;
        int result = oddNum(m,n,indices);
        if (result== 0){
            System.out.println("There are no odd values in the matrix");
        } else {
            System.out.println("there are " + result + " number of odd cells in the matrix");
        }
    }
    static int oddNum(int m , int n , int[][] indices ){
        int[][] ans = new int[m][n];
        int count = 0;

        for (int i = 0; i < ans.length ; i++) {
            for (int j = 0; j < n ; j++) {
                ans[indices[i][0]][j]++;
            }
            for (int j = 0; j < m ; j++) {
                ans[j][indices[i][1]]++;
            }
        }
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}
