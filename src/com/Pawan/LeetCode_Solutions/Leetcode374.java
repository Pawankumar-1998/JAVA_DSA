package com.Pawan.LeetCode_Solutions;

public class Leetcode374 {
    public static void main(String[] args) {
        int n = 10;
        int pick = 18;
        System.out.println(guessTheNumber(n,pick));
    }
    static int guessTheNumber(int n , int pick){
        int start = 0;
        int end = n;
        while (start<=end){
            int mid = start + (end - start)/2;
            if (guess(mid,pick)==0){
                return mid;
            }
            if (guess(mid,pick)==1){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int guess(int guess , int pick){
        if (guess==pick){
            return 0;
        }
        if (guess<pick){
            return 1;
        } else {
            return -1;
        }
    }
}
