package com.Pawan.Starting_With_Java;

import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1. Program to print a number odd or even
//        System.out.print("Enter a number to check weather its odd or even  :  ");
//        int num = sc.nextInt();
//        if (num % 2 == 0){
//            System.out.println("It is a even number");
//        } else {
//            System.out.println("It is a odd number");
//        }

//        2. Taking name as input and displaying with a message
//        System.out.println("Please enter your name");
//        String name = sc.nextLine();
//        System.out.println(" Hey " + name + " Good morning have a nice day");


//        3. Programe to calculate Simple intrest
//        System.out.print("Enter the principal amount : ");
//        int p = sc.nextInt();
//        System.out.print("Enter the time :");
//        int t = sc.nextInt();
//        System.out.print("Enter the rate of intrest : ");
//        int r = sc.nextInt();
//        int simple = (p * t * r ) / 100;
//
//        System.out.println(" Your Simple Intrest is : " + simple);


//        4. Take Two numbers and operator
//        System.out.println("Enter the first number");
//        float num1 = sc.nextInt();
//
//        System.out.println("Enter the second number");
//        float num2 = sc.nextInt();


//      Press 1 for Addition , press 2 for substraction , press 3 for multiplication , press 4 for division
//        System.out.println(" Select a number to perform a operation");
//        int sel = sc.nextInt();
//
//
//        float ans;
//
//        if (sel == 1){
//             ans = num1 + num2;
//        }
//        else if (sel == 2){
//            ans = num1 - num2;
//        }
//        else if (sel == 3){
//             ans = num1 * num2;
//        } else {
//             ans = num1 / num2;
//        }
//
//        System.out.println(" You have selected operator number :" + sel );
//        System.out.println(" The operation of the entered number is : " + ans);


//        5. Program to print the larger number among the smaller number

//        System.out.println("Enter two number to check the greater one");
//        System.out.println("Enter first number ");
//        int num3 = sc.nextInt();
//        System.out.println("Enter second number ");
//        int num4 = sc.nextInt();
//        if (num3>num4){
//            System.out.println("The Greater number is  :" + num3);
//        }else {
//            System.out.println("The Greater number is  :" + num4);
//        }

//        6. Convertion Of dollar and rupees
        System.out.println("Enter the amount in rupees to convert into doller");
        float ind = sc.nextFloat();

        float convert = ind / 61.06f;

        System.out.println("The entered amount in USD is : " + convert);


    }
}
