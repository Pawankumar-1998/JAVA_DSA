package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Eligible_for_vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter his or her age to know the eligibility");
        int num = sc.nextInt();
        eligibility(num);


    }

    static void eligibility(int age){
        if (age>=18){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }
    }
}
