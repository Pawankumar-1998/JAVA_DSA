package com.Arrays;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        arr[0] = 96;
        arr[1] = 12;
        arr[2] = 54;
        arr[3] = 63;
        arr[4] = 71;
        System.out.println(arr[2]);

/*
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

 */



//        input using for loop
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
