package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Febbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Q.21 febbonaci series in java
        int a = 0;
        int b = 1;
        System.out.println("Enter a number to see its febonnaci value");
        int n = sc.nextInt();
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println("The febonnacci value of the entered number is : " + b);
    }
}
