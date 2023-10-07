package com.Pawan.Recursion.Strings;

public class BasicThree {
    public static void main(String[] args) {
        System.out.println(f("appleadaykeepdoctorawaybutappdoesnt"));
    }
    static String f(String remaining){
        if (remaining.isEmpty()){
            return "";
        }

        if (remaining.startsWith("app") && !remaining.startsWith("apple")){
            return f(remaining.substring(3));
        } else {
            return remaining.charAt(0) + f(remaining.substring(1));
        }
    }
}
