package com.Pawan.Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        patterns(5);
    }
    static void patterns(int n){
        for (int row = 1; row < 2 * n ; row++) {
            int totalCols = row > n ? 2 * n - row : row;
            int spaces = n - totalCols;

//            for printitng the spaces
            for(int space = 1 ; space<=spaces;space++){
                System.out.print(" ");
            }

//            for printing the colomuns
            for(int cols = 1;cols<=totalCols;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
