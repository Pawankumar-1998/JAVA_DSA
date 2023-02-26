package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks out of hundred to see your grade");
        int num = sc.nextInt();
        grades(num);
    }

    static void grades(int marks){
        if (marks>=91&&marks<=100){
            System.out.println("AA");
        }else if (marks>=81&&marks<=90){
            System.out.println("AB");
        }else if (marks>=71&&marks<=80){
            System.out.println("BB");
        }else if (marks>=61&&marks<=70){
            System.out.println("BC");
        }else if (marks>=51&&marks<=60){
            System.out.println("CD");
        }else if (marks>=41&&marks<=50){
            System.out.println("DD");
        } else if (marks<=40){
            System.out.println("Fail , please re-appear for the exam");
        }else {
            System.out.println("Please enter a valid input");
        }
    }
}
