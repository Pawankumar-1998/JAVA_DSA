package com.Pawan.LeetCode_Solutions;

import java.util.Scanner;

public class leetcode_1281 {
    public static void main(String[] args) {
//        https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

        /*
        Given an integer number n, return the difference between the product of its digits and the sum of its digits.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("The difference between the product and sum of the entered number is ");
        System.out.println(SubProductSum(n));
    }

    public static int SubProductSum(int n){
        int sum = 0;
        int product = 1;
        while (n>0){
            int rem = n % 10;
            product = product * rem;
            sum = sum + rem;
            n = n / 10;
        }
        return product - sum;
    }
}
