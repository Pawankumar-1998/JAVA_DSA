package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class ProductAndSumOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
//        int ans = product - sum;

        while (n > 0) {
            int rem = n % 10;
            product = product * rem;
            sum = sum + rem;
            n = n / 10;
        }
        int ans = product - sum;
        System.out.println("The diffrence between the product and sum of the entered number is " + ans);
    }
}
