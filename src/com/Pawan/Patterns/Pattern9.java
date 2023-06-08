package com.Pawan.Patterns;

public class Pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = n; row >=1 ; row--) {
            int totalCols = row;
            int totalSpaces = n - row;
            for (int spaces = 1; spaces <=totalSpaces ; spaces++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
