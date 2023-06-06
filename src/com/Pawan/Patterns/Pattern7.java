package com.Pawan.Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        /*

            4 4 4 4 4 4 4 4 4
            4 3 3 3 3 3 3 3 4
            4 3 2 2 2 2 2 3 4
            4 3 2 1 1 1 2 3 4
            4 3 2 1 0 1 2 3 4
            4 3 2 1 1 1 2 3 4
            4 3 2 2 2 2 2 3 4
            4 3 3 3 3 3 3 3 4
            4 4 4 4 4 4 4 4 4



         */




        pattern(4);
    }
    static void pattern(int n){
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <=n ; row++) {
            for (int col = 0; col <=n ; col++) {
                int indexValue = originalN - Math.min(Math.min(row,col) , Math.min(n-row,n-col));
                System.out.print(indexValue + " ");
            }
            System.out.println();
        }
    }
}
