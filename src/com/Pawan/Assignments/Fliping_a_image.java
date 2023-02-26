package com.Pawan.Assignments;

import java.util.Arrays;

public class Fliping_a_image {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {1,0,1}
        };
        for (int i = 0; i < image.length ; i++) {
            System.out.println(Arrays.toString(image[i]));
        }
//        System.out.println(Arrays.toString(image));
    }
    static int[][] flip (int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
                int start = 0;
                int end = arr.length -1;

                while (start<end){
                    if(arr[i][start] == arr[i][end]){
                        arr[i][start] = 1 - arr[i][start];
                        arr[i][end] = arr[i][start];
                    }
                    start++;
                    end--;
                }
        }
        return arr;
    }
}
