package com.Pawan.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
//        Input array
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        output array
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        Printing using enhanced for loop
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
//        Printing using foreach loop
        for (int[] a : arr){
            System.out.println(a);
        }

    }
}
