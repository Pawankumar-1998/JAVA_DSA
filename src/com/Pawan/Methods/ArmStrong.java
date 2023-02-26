package com.Pawan.Methods;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see its a armstrong or not");
        int num = sc.nextInt();
        arm(num);
    }

    static void arm(int num){
        int sum = 0;
        int temp = num;
        while (num>0){
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            num = num / 10;
        }

        if (sum==temp){
            System.out.println("Its a armstrong number");
        } else {
            System.out.println("Not a armstrong number");
        }
    }
}
