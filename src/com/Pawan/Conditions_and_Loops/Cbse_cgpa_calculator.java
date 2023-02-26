package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Cbse_cgpa_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of subject");
        float sub = sc.nextInt();
        float GradePoints = 0;
        for (int i = 1; i <= sub; i++) {
            System.out.println(" Enter the marks of " + i + " Subject");
            int marks = sc.nextInt();
            if (marks >= 91 && marks <= 100) {
                GradePoints += 10;
            } else if (marks >= 81 && marks <= 90) {
                GradePoints += 9;
            } else if (marks >= 71 && marks <= 80) {
                GradePoints += 8;
            } else if (marks >= 61 && marks <= 70) {
                GradePoints += 7;
            } else if (marks >= 51 && marks <= 60) {
                GradePoints += 6;
            } else if (marks >= 41 && marks <= 50) {
                GradePoints += 5;
            } else if (marks >= 33 && marks <= 40) {
                GradePoints += 4;
            } else {
                System.out.println("You are eligible for re_appearing the exam");
            }
        }
        float cgpa = GradePoints / sub;
        System.out.println("Your CGPA is " + cgpa);
    }
}
