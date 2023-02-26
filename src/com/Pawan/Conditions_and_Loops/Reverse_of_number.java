package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Reverse_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see the reverse of it");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        System.out.println("The reverse of the number is  : " + sum);

    }
}
