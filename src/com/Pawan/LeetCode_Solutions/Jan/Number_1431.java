package com.Pawan.LeetCode_Solutions.Jan;

import java.util.ArrayList;
import java.util.List;

public class Number_1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies=3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies , int extraCandies){
        int n = candies.length;
        ArrayList<Boolean> list = new ArrayList<>();
        int max =0;
        for (int i = 0; i < n ; i++) {
            if (candies[i]>max){
                max = candies[i];
            }
        }
        for (int i = 0; i < n ; i++) {
            if (candies[i]+extraCandies >= max){
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
