package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see its sum");
        int num = sc.nextInt();
        int sum = 0;
        while (num!=0){
            int rem = num%10;
            sum =sum + rem;
            num = num/10;
        }
        System.out.println("The sum of the entered number is " + sum);
    }
}
