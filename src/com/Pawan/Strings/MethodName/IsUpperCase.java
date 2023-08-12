package com.Pawan.Strings.MethodName;

public class IsUpperCase {
    public static void main(String[] args) {

        char ch1 , ch2 , ans;

        int count = 0;

        ch1 = 'k';
        ch2 = '\u0e16';

        String str = "pawankumar";

        boolean b1 = Character.isUpperCase(ch1);

        System.out.println(b1);

        System.out.println("the length of the string is : "+str.length());


        for (int i = 0; i < str.length() ; i++) {
            ans = str.charAt(i);
            if (Character.isUpperCase(ans)){
                count++;
            }
        }


        if (count!=0){
            System.out.println("There is a capital letter in the word");
        } else {
            System.out.println("this is no capital letter ");
        }


    }
}
