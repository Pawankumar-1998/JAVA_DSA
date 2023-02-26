package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Sum_of_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see its sum");
        int num = sc.nextInt();
        int result = sum(num);
        System.out.println(result);
    }
    static int sum(int num){
        int ans =0;
        for (int i = 1; i <=num ; i++) {
            ans = ans + i;
        }
        return ans;
    }
}
