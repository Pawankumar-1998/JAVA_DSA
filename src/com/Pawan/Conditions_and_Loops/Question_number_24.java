package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Question_number_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println(" Press any number to start " +
                "press to 0 to stop");
        int num = sc.nextInt();

        while (num != 0) {
            System.out.println(" Enter a number to add ");
            num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("The sum of the entered number is  " + sum);

    }
}
