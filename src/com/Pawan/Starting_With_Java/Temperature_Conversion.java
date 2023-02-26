package com.Pawan.Starting_With_Java;
import java.util.Scanner;

public class Temperature_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in celcius  : ");
        float cel = sc.nextFloat();

        float far = (cel * 1.8f) + 32;
        System.out.print("The Entered Temperature in ferhanite is : " + far);
    }
}
