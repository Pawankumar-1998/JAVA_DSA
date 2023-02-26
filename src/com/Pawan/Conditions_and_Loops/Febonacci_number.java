package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Febonacci_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the n th number to see its febonacci value ");
        int n = sc.nextInt();
/*
        int a = 0;
        int b = 1;
        int count = 2;

        while (count<=n){
            int temp = b;
            b = a+b;
            a=temp;
            count++;
        }
        System.out.println(b);

 */


//        Febonacci using for loop

        int a = 0;
        int b = 1;
        int count = 2;

        for (count = 2; count <= n; count++) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        System.out.println("Febonnaci of the entered value is " + b);
    }
}
