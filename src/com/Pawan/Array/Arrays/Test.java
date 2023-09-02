package com.Pawan.Array.Arrays;

import java.util.Scanner;

public class Test {
    public synchronized   static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 1; i <= arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
