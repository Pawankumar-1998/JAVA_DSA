package com.Pawan.Methods;

import java.util.Scanner;

public class Range_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Note the starting range should be 3 digit number");
        System.out.println("Enter the starting range");
        int start = sc.nextInt();
        for (int i = start; i <1000 ; i++) {
            if (arm(i)){
                System.out.print(i + " ");
            }
        }

    }
    static boolean arm(int n){
        int temp = n;
        int sum = 0;

        while (n!=0){
            int rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        return sum==temp;
    }
}
