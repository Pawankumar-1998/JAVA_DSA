package com.Pawan.Recursion.Strings;

public class BasicTwo {
    public static void main(String[] args) {
        System.out.println("the ans is " + f("pawan"));
    }
    static String f(String remainingString){
        if (remainingString.isEmpty()){
            return "";
        }
        char ans = remainingString.charAt(0);
        if (ans=='a'){
            return f(remainingString.substring(1));
        } else {
            return ans + f(remainingString.substring(1));
        }
    }
}
