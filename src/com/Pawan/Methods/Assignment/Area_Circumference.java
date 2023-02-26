package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Area_Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float radius = sc.nextInt();
        System.out.println("The area of the circle is " + area(radius));
        System.out.println("The circumference of the circle is " + circumference(radius));
    }

    static float area(float radi){
        return 3.14f * radi * radi;
    }

    static float circumference(float radi){
        return 2 * 3.14f * radi;
    }
}
