package com.Pawan.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        Class name = arr1.getClass();
        String naam = name.getName();
        System.out.println(naam);

//
        int[] arr = new int[5];
//        arr[0] = 96;
//        arr[1] = 12;
//        arr[2] = 54;
//        arr[3] = 63;
//        arr[4] = 71;
//        System.out.println(arr[2]);
//      input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        printing using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//          printing using for each loop
        for (int a : arr) {
            System.out.print(a + " ");
        }


//        printing using to string method
        System.out.println(Arrays.toString(arr));


/*
//        printing string in array
        String[] str = new String[5];
        for (int i = 0; i < str.length ; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }

 */
    }
}
