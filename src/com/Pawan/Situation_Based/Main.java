package com.Pawan.Situation_Based;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollNo;
        float subject1;
        float subject2;
        float subject3;
        System.out.println("Enter the number of students in class");
        int n = sc.nextInt();
        int sum;

        int[][] student = new int[n][3];
        int[] total = new int[n];
        for (int i = 0; i < n; i++) {
            rollNo = 0;
            System.out.println("Enter the roll number of the student " + (i+1));
            rollNo = sc.nextInt();
            sum = 0;
            for (int j = 0; j < student[i].length ; j++) {
                System.out.println("Enter the marks of roll no "+ rollNo+" in subject " + (j+1));
                    student[i][j] = sc.nextInt();
                    sum = sum + student[i][j];
                }
            total[i] = sum;
        }
        for (int i = 1; i <= n ; i++) {
            System.out.println("The total marks of roll no " + i + " is " + total[i] );
            System.out.println("The percentage of the student no " + i + " is " + (total[i] / 300) * 100);
        }

    }
}
