package com.Pawan.Patterns;

public class Pattern3 {
    public static void main(String[] args) {
//        pattern(5);
        patterns(5);
    }

    static void patterns(int n){
        for (int i = 1; i <= 2*n-1 ; i++) {
            int totalCols = i>n ? 2 * n - i : i;
            for (int j = 1; j <=totalCols ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern(int n){
        for (int i = 1; i <= 2*n-1 ; i++) {
            int totalCols = i>n ? (2*n-1-i) + 1 : i;
            for (int j = 1; j <=totalCols ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
