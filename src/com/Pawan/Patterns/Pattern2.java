package com.Pawan.Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        /*
         function name :- pattern
         ****
         ***
         **
         *


         function name :- pattern1
           1
           12
           123
           1234
         */



//        pattern(4);
        pattern1(4);
    }
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1 ; col <= n+1-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1 ; col <= row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }


}
