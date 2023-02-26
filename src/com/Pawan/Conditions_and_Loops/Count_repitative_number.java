package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Count_repitative_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(" Which number you want to check");
        int s = sc.nextInt();
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == s) {
                count++;
            }
            num = num / 10;
        }

        System.out.println("The number of time the entered number is repeated is " + count);
    }
}
