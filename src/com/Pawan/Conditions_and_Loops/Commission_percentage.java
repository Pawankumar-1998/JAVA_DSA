package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Commission_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the actual amount in Rs");
        float actual = sc.nextFloat();
        System.out.println("Enter your commission ");
        float commission = sc.nextFloat();

        float percentage = (commission / actual) * 100;
        System.out.println(" Your commission is " + percentage + " % ");
    }
}
