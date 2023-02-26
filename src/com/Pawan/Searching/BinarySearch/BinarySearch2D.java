package com.Pawan.Searching.BinarySearch;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10,24,33,52},
                {23,35,42,68},
                {31,48,52,72},
                {51,65,78,89}
        };
        int target = 1;
         System.out.println(Arrays.toString(binarySearch(arr,target)));
    }
    static int[] binarySearch(int[][] matrix , int target){
        int row = 0;
        int column = matrix.length - 1;

        while (row<matrix.length && column>=0){
           if (matrix[row][column] == target){
               return new int[] { row , column};
           } else if (matrix[row][column] > target){
               column -- ;
           } else {
               row ++;
           }
        }
        return new int[] {-1 , -1};
    }
}
