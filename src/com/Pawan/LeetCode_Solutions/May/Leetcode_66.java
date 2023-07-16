package com.Pawan.LeetCode_Solutions.May;

import java.util.Arrays;

public class Leetcode_66 {
    public static void main(String[] args) {

        /*
        You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
        The digits are ordered from most significant to the least significant in left-to-right order.
        The large integer does not contain any leading 0's.
        Increment the large integer by one and return the resulting array of digits.

        Example 1:
        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].
         */

        int[] arr = {1,2,3};


        System.out.println(Arrays.toString(plusOne(arr)));
    }

    static int[] plusOne(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

//        this is used to convert the number into the array
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = (sum*10)+arr[i];
        }
        sum = sum + 1;

//        int size = String.valueOf(sum).length(); // for getting the length of the integer

        for (int i = 0; i < ans.length ; i++) {
            ans[i] = sum%10;
            sum= sum/10;
        }


//         Reversing the array
        for (int i = 0; i < n / 2; i++) {
            int temp = ans[i];
            ans[i] = ans[n - i - 1];
            ans[n - i - 1] = temp;
        }


        return ans;
    }
}
