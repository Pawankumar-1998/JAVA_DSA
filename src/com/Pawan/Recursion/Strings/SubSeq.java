package com.Pawan.Recursion.Strings;

public class SubSeq {
    public static void main(String[] args) {
        f("","abc");
    }
    static void f(String ans , String remaining){
        if (remaining.isEmpty()){
            System.out.print(ans + " ");
            return;
        }

//        take the first char
        char temp = remaining.charAt(0);

//        left part tree contains taking the char
        f(ans+temp,remaining.substring(1));

//        right part of the tree contains ignoring the char
        f(ans,remaining.substring(1));



    }
}
