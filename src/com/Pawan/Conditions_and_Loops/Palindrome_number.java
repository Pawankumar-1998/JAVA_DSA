package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see its palindrome or not ");
        int num = sc.nextInt();
        int temp = num;
        int pal = 0;

        while (num != 0) {
            int rem = num % 10;
            pal = pal * 10 + rem;
            num = num / 10;
        }

        if (temp == pal) {
            System.out.println("Its a palindrome number ");
        } else {
            System.out.println("Its not a palindrome number ");
        }
    }

}
