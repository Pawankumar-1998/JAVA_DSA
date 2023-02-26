package com.Pawan.Linear_Search;

public class Min_Max_In2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12 , 15 , 78 , 65},
                {41 , 54 , 76},
                {12 , 61 }

        };
        System.out.println(min(arr)); // this print the minimum number in the array
        System.out.println(max(arr)); // this print the maximum number in the array

    }
//    function for finding the min element value in 2D array
    static int min (int[][]arr){
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
        }
        return min;
    }
//    function for finding the max element value in the 2D array
        static int max (int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] e : arr){
            for (int f : e){
                if (f>max){
                    max = f;
                }
            }
        }
        return max;
        }
}
