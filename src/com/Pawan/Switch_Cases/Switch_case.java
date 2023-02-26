package com.Pawan.Switch_Cases;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter a fruit to see its speciality");
        String fruit = sc.next();
//      This is the old syntax of switch statement

        switch (fruit) {
            case "mango":
                System.out.println("The fruit is a drupe, with an outer flesh surrounding a stone");
                break;
            case "orange":
                System.out.println("Oranges are round orange-coloured fruit that grow on a tree which can reach 10 metres (33 ft) high");
                break;
            case "grapes":
                System.out.println("One cup of grapes, with about 100 calories, provides more than a quarter of the daily recommended values of vitamins K and C");
                break;
            case "apple":
                System.out.println("Apple a day keeps doctor away");
                break;
            default:
                System.out.println("Enter a valid fruit");
                break;


        }

         */

        /*

        System.out.println("Enter a number to see its date ");
        int num = sc.nextInt();
//        This is the new syntax of switch
        switch (num){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

         */    // using old syntax of Switch
        /*
        System.out.println("Enter a number to see its a weekday or weekend");
        int num = sc.nextInt();
        switch (num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

         */
//        using new syntax of Switch
        System.out.println("Enter a number to see its a weekday or weekend");
        int num = sc.nextInt();
        switch (num){
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekend");
        }


    }
}
