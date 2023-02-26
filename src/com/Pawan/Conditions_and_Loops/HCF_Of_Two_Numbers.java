package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class HCF_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hcf = 0;
        System.out.println("Enter the first number ");
        int num = sc.nextInt();
        System.out.println("Enter the second number ");
        int num1 = sc.nextInt();

        for (int i = 1; i <=num  || i<=num1; i++) {
            if (num % i==0 && num1 % i==0){
                hcf = i;
            }
        }
        System.out.println("The hcf of the entered number is " + hcf);

    }
}
