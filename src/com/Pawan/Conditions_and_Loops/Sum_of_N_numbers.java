package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Sum_of_N_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see its natural sum");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("The natural sum of the entered number is " + sum);
    }
}
