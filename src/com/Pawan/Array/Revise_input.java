package com.Pawan.Array;

import java.util.Scanner;

public class Revise_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int[][] Arr2D = {
                {1 , 2 , 3},
                {4 , 5},
                {6 , 7 , 8 , 9}
        };

        for (int i = 0; i < Arr2D.length ; i++) {
            for (int j = 0; j <Arr2D[i].length ; j++) {
                System.out.print(Arr2D[i][j] + " ");
            }
            System.out.println();
        }

         */


/*

//        Input a array
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        Output an array using a for loop
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        Output an array using Arrays.toString
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

//        Output a array using for each loop
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

 */

        String[] arr1 = new String[4];
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i] = sc.next();
        }

            for (String ele : arr1){
                System.out.println(ele);
            }


    }
}
