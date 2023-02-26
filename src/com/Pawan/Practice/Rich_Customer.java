package com.Pawan.Practice;

public class Rich_Customer {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {7,8,6}
        };
        System.out.println(sum(accounts));
    }

    static int sum(int[][] nums){
        int n = nums.length;
        int max = 0;
        for (int i = 0; i <nums.length ; i++) {
            int sum = 0;
            for (int j = 0; j <nums[i].length ; j++) {
                sum = nums[i][j] + sum ;
            }
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }
}
