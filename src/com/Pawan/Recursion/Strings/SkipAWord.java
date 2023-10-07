package com.Pawan.Recursion.Strings;

public class SkipAWord {
    public static void main(String[] args) {
        System.out.println("the ans is " + f("pawanappleadaykeepdoctoraway"));
    }

    static String f(String remaining){
        if (remaining.isEmpty()){
            return "";
        }

        if (remaining.startsWith("apple")){
            return f(remaining.substring(5));
        } else {
            return remaining.charAt(0) + f(remaining.substring(1));
        }
    }
}
