package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to see its a Armstrong number or not");
        int num = sc.nextInt();
        int temp = num;
        int rem;
        int sum = 0;

        while (num != 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }

        if (sum == temp) {
            System.out.println("Its a Armstrong number ");
        } else {
            System.out.println(" Its not an Armstrong number");
        }
    }
}
