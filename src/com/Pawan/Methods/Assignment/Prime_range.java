package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Prime_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range");
        int start = sc.nextInt();
        System.out.println("Enter the ending range");
        int end = sc.nextInt();
        prime(start,end);
    }

    static void prime(int a , int b){
        int count;
        for (int i = a;i<=b;i++){
            count=0;
            for (int j = 1; j <=i ; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i + " ");
            }
        }
    }
}
