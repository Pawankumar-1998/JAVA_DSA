package com.Pawan.LeetCode_Solutions.May;

import java.util.Arrays;

public class Leetcode_832 {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        for(int[] ele : image){
            System.out.println(Arrays.toString(image));
        }


    }

    static int[][] flippingImage (int[][] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n/2 ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]==0){
                    arr[i][j]=1;
                } else {
                    arr[i][j]=0;
                }
            }

        }

        return arr;
    }
}
