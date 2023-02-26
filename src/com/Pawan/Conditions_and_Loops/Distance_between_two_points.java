package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Distance_between_two_points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X co-ordinates");
        float x1 = sc.nextFloat();
        float x2 = sc.nextFloat();

        System.out.println("Enter the Y co_ordinates");
        float y1 = sc.nextFloat();
        float y2 = sc.nextFloat();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The distance between the points are " + distance);
    }
}
