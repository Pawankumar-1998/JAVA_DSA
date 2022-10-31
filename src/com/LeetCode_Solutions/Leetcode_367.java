package com.LeetCode_Solutions;

import java.util.Scanner;

public class Leetcode_367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see its a perfect square or not");
        int num = sc.nextInt();
//        returns true if the number is perfect or else returns false
        System.out.println(square(num));
    }
    static boolean square(int num){
        int start = 1;
        int end = num;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (mid*mid==num){
                return true;
            } else if (mid * mid < num ){
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return false;
    }
}
