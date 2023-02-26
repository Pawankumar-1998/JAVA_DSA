package com.Pawan.LeetCode_Solutions.Jan;

public class Number_1672 {
    public static void main(String[] args) {
        int[][] nums = {
                {1,2,3},
                {3,2,1}
        };
        //Output: 6
        System.out.println(richCustomerWealth(nums));

    }
    static int richCustomerWealth(int[][] nums){
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n ; i++) {
            int sum = 0;
            for (int j = 0; j < nums[i].length ; j++) {
                sum = sum + nums[i][j];
            }
            if (sum>max){
                max =  sum;
            }
        }
        return max;
    }
}
