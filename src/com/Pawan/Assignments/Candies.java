package com.Pawan.Assignments;

import java.util.ArrayList;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int n = 3;
//        Output: [true,true,true,false,true]
        System.out.println((candies(candies,n)));
    }
    static List<Boolean> candies (int[] candies , int extraCandies ){
        ArrayList<Boolean> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i <candies.length ; i++) {
            if (candies[i]>max){
                max = candies[i];
            }
        }
        for (int i = 0; i <candies.length ; i++) {
            if (candies[i]+extraCandies >= max){
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
