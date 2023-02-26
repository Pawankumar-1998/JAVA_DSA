package com.Pawan.LeetCode_Solutions.Feb;

public class Number_441 {
    public static void main(String[] args) {
        /*
        Input :- 5
        Output :- 2
         */
        int a = 5;
//        arrangingCoins(arrangingCoins(a));
        System.out.println(arrangingCoins(a));
    }

    static int arrangingCoins(int num){
        int count = 0;
        for (int i = 1; num >=i ; i++) {
            count++;
            num=num-i;
        }
        return count;
    }
}
