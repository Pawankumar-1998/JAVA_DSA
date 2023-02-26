package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class LCM_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        int hcf = 0;

        for (int i = 1; i <=num1 || i<=num2 ; i++) {
            if (num1%i==0 && num2%i==0){
                hcf = i;
            }
        }

        int lcm = (num1*num2)/hcf;
        System.out.println("The LCM of " + num1 + " and " + num2 +" is :" + lcm);
    }
}
