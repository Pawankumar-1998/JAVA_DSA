package com.Switch_Cases;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fruit to see its speciality");
        String fruit = sc.next();

        switch (fruit) {
            case "mango":
                System.out.println("The fruit is a drupe, with an outer flesh surrounding a stone");
                break;
            case "orange" :
                System.out.println("Oranges are round orange-coloured fruit that grow on a tree which can reach 10 metres (33 ft) high");
                break;
            case "grapes":
                System.out.println("One cup of grapes, with about 100 calories, provides more than a quarter of the daily recommended values of vitamins K and C");
                break;
            case "apple" :
                System.out.println("Apple a day keeps doctor away");
                break;
            default:
                System.out.println("Enter a valid fruit");
        }
    }
}
