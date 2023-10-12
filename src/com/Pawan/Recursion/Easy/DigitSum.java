package com.Pawan.Recursion.Easy;

public class DigitSum {
    public static void main(String[] args) {

        System.out.println(f(1342));
    }
    static int f(int number){
        if (number == 1){
            return 1;
        }

        int reminder = number % 10;
        int newNumber = number / 10;

        return reminder + f(newNumber);
    }
}
