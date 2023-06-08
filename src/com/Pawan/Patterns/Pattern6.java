package com.Pawan.Patterns;

public class Pattern6 {
    public static void main(String[] args) {

        /*
        pattern :-
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1

         */
        pattern(4);
    }
    static void pattern(int n){
        for (int row = 1; row < 2*n ; row++) {

//            formula for total number of columns in each rows
            int totalCols = row>n ? 2 * n - row : row;

//            formula for the total number of spaces
            int spaces = n - totalCols;

//            for printing the spaces
            for(int space = 1; space<=spaces;space++){
                System.out.print(" ");
            }

//            for printing the cols (first half )
            for (int cols = totalCols; cols>=1; cols--) {
                System.out.print(cols);
            }

//            for printing the second half
            for (int i = 2; i <=totalCols ; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
