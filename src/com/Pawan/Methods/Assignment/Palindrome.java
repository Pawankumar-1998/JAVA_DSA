package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see its a palindrome or not");
        int num = sc.nextInt();
        palindrome(num);
    }

    static void palindrome(int num){
        int temp = num;
        int rev = 0;

        while (num!=0){
            int rem = num%10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        if (rev==temp){
            System.out.println("Its a palindrome");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}
