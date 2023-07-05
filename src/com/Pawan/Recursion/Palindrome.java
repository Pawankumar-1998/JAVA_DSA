package com.Pawan.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(121,0));
    }

    static boolean palindrome(int num , int sum){
        int original = num;

       if (num!=0){
          int rem = num % 10;
          sum = sum * 10 + rem;
          num = num / 10;
         return palindrome(num,sum);
       }

       if (sum==original){
           return true;
       } else {
           return false;
       }
    }
}
