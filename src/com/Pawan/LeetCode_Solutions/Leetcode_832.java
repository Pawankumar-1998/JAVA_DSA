package com.Pawan.LeetCode_Solutions;

import java.util.Arrays;

public class Leetcode_832 {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        flipImage(image);
        for (int i = 0; i <image.length ; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
    }

    static int[][] flipImage(int[][] image){
        for (int i = 0; i <image.length ; i++) {
            int start = 0;
            int end = image.length -1 ;

            while (start<=end){
                if (image[i][start]==image[i][end]){
                    image[i][start] = 1 - image[i][start];
                    image[i][end] = image[i][start];
                }
                start++;
                end--;
            }
        }
        return image;
    }
}
