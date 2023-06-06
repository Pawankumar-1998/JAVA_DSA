package com.Pawan.Patterns;

public class Pattern5 {
    public static void main(String[] args) {

        /*
        pattern :
                     1
                    212
                   32123
                  4321234
                 543212345
         */
        pattern(4 );
    }
    static void pattern(int n){
        for (int row = 1; row <=n ; row++) {
            int totalSpaces = n - row;
            for (int space = 1; space <=totalSpaces ; space++) {
                System.out.print("  ");
            }
            for(int col = row;col>=1;col--){
                System.out.print(col + " ");
            }

            for (int i = 2; i <=row ; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
