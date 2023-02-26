package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Queston_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to start");
        int num = sc.nextInt();
        int great = 0;

        while (num != 0) {
            System.out.println("Enter a number ");
            num = sc.nextInt();
            if (num > great) {
                great = num;
            }
        }
        System.out.println("The greatest number you have entered till now is " + great);
    }
}
