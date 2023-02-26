package com.Pawan.Assignments;

public class Matrix_Rotation {
    public static void main(String[] args) {

        int[][] matrix = {
                {0,1},
                {1,0}
        };
        int[][] target = {
                {1,0},
                {0,1}
        };
        System.out.println(rotate(matrix,target));
    }
// this function rotates the array 4 times because after rotating 3 times the 4th rotation comes to first
    static boolean rotate(int[][] matrix , int[][] target){
        for (int i = 0; i < 4 ; i++) {
//    this will return true if the given array matches the target array without rotating
            if (check(matrix,target)){
                return true;
            }
//            if the given array doesn't match with given target array then pass the array in flip function
            flip(matrix);
        }
        return false;
    }
     static boolean check(int[][] matrix, int[][] target) {
         for (int i = 0; i < matrix.length ; i++) {
             for (int j = 0; j < matrix.length ; j++) {
                    if (matrix[i][j]!=target[i][j]){
                        return false;
                    }
                    /*
                    else {
                        return false;
                    }

                     */
             }
         }
         return true;
    }
//        this is the main function that rotates the array
    static void flip(int[][] matrix){
        //        this is basically transposing the matrix through the diagonal
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < i ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
//      after transposing the matrix here the value are swapped so that it will be a rotation of 90 degree
        int start = 0;
        int end = matrix.length-1;
        while (start<=end){
        for (int row = 0; row < matrix.length ; row++) {
            int temp = matrix[row][start];
            matrix[row][start]=matrix[row][end];
            matrix[row][end] = temp;
        }
        start++;
        end--;
        }
    }
}
