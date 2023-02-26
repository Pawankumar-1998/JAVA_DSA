package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Average_of_N_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to add ");
        int num = sc.nextInt();
        float sum = 0;

        /*
        float sum = 0;
//        int ans;

        for (int i = 1; i <= num ; i++) {
            System.out.println("Enter the " + i + " st  number");
            float num1 = sc.nextInt();
            sum = sum + num1;
        }
        float ans = sum / num;
        System.out.println("The average of the entered number is " + ans);

         */

//        Solving the same using while loop
        int count = 0;

        while (num != 0) {
            System.out.println("Enter a number");
            num = sc.nextInt();
            sum = sum + num;
            if (num != 0) {
                count++;
            }
        }
        float ans = sum / count;
        System.out.println("The average of the entered number are " + ans);
    }
}
