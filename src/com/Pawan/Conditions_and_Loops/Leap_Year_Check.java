package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Leap_Year_Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to see its a leap year or not");
        int year = sc.nextInt();
        if (year%400!=0){
            System.out.println("Its not a leap year");
        } else if (year%4==0){
            System.out.println("Its  a leap year");
        } else {
            System.out.println("Its not a leap year");
        }


//        System.out.println(1900%400);
    }
}
