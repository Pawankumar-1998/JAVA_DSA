package com.Pawan.LeetCode_Solutions;

public class Leetcode_1732 {
    public static void main(String[] args) {
        /*
        Input: gain = [-5,1,5,0,-7]
        Output: 1
        Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
         */

        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] arr){
        int max = 0;
        int sum =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }
}
