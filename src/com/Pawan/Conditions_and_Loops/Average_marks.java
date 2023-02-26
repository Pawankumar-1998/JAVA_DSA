package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Average_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int sub = sc.nextInt();
        float marks = 0;

        for (int i = 1; i <= sub; i++) {
            System.out.println("Enter marks of " + i + " Subject ");
            float score = sc.nextFloat();
            marks += score;
        }

        float average = marks / sub;
        System.out.println("The average marks is " + average);

    }
}
