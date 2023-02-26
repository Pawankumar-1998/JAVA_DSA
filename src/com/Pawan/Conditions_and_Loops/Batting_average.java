package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Batting_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total runs scored by the batsmen");
        int run = sc.nextInt();
        System.out.println("Enter the total no of time he got out ");
        int out = sc.nextInt();

        int average = run / out;
        System.out.println(" The batting average of the batsmen is " + average);
    }
}
