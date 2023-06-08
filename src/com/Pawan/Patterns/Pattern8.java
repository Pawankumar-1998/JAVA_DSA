package com.Pawan.Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        patterns(3);
    }
    static void patterns(int n){
        n = 2 * n;
        for (int row = 0; row <=n ; row++) {
            for (int col = 0; col <=n ; col++) {
                int indexValue = 4 - Math.min(Math.min(row,col),Math.min(n-col,n-row));
                System.out.print(indexValue + " ");
            }
            System.out.println();
        }
    }
}
