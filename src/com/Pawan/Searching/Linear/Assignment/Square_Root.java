package com.Pawan.Searching.Linear.Assignment;

public class Square_Root {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(square(num));
    }
    static int square(int num){
        long y = 0;
        while (y*y<=num){
            y++;
        }
        return (int) y-1;
    }
}
