package com.Pawan.Strings.Practice;

public class Palindrome {
    public static void main(String[] args) {
        String str = "aba";
        System.out.println(palindrome(str));
    }
    static boolean palindrome(String str){
        str = str.toLowerCase();
        for (int i = 0; i <=str.length()/2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start!=end){
                return false;
            }
        }
        return true;
    }
}
