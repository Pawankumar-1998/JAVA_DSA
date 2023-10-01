package com.Pawan.Recursion.Patterns;

public class Pattern_1 {
    public static void main(String[] args) {
        f(3,0);
    }
    static void f(int row , int col){
        if (row==0){
            return;
        }
        if (col<row){
            f(row,col+1);
            System.out.print("*");
        } else {
            f(row-1,0);
            System.out.println();

        }


    }
}
