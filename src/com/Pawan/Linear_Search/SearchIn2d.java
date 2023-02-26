package com.Pawan.Linear_Search;

import java.util.Arrays;

public class SearchIn2d {
    public static void main(String[] args) {
        int[][] arr = {
                {12 , 15 , 78 , 65},
                {41 , 54 , 76},
                {12 , 61 }
        };
        int target = 76;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr , int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
