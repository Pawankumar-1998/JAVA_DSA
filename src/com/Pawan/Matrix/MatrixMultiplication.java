package com.Pawan.Matrix;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {
                {1,3},
                {4,5}
        };

        int[][] b = {
                {1,2},
                {3,1}
        };
        matrixMultiplication(a,b,a.length);
    }
    static void matrixMultiplication(int[][] A , int[][] B , int n){
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n ; k++) {
                    c[i][j] = c[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(c[i]));
        }
    }
}
