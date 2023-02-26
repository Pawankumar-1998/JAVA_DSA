package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Factorial_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see its factorial");
        int num = sc.nextInt();
        int fac = 1;

        for (int i = 1; i <= num; i++) {
            fac = fac * i;
        }
        System.out.println("The factorial of the entered number is " + fac);
    }
}
