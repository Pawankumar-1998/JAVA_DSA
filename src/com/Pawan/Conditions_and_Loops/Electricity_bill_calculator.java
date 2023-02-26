package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Electricity_bill_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of units");
        float unit = sc.nextFloat();
        float amount;
        float fc = 20;   // fc = fixed charge
        float mr = 20;  // mr = meter reading
        float ed = 43.35f; // ed = electricity duty

        if (unit >= 0 && unit <= 50) {
            amount = unit * 2.5f;
        } else if (unit >= 50 && unit <= 200) {
            amount = (unit - 50) * 4.3f + 125;
        } else if (unit >= 200 && unit <= 400) {
            amount = (unit - 200) * 5.3f + 125 + 645;
        } else {
            amount = (unit - 400) * 5.7f + 125 + 645 + 1060;
        }
        float ans = amount + fc + mr + ed;

        System.out.println("The amount to be paid is" + ans);
    }
}
