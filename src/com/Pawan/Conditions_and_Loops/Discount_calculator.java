package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Discount_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Actual price of the product ");
        float amount = sc.nextFloat();
        System.out.println("Enter the discount percentage ");
        float percentage = sc.nextFloat();

        float discount = (percentage / 100) * amount;
        float total = amount - discount;
        System.out.println("The price to be payed after the discount is " + total);
    }
}
