package com.Pawan.Array;

public class Panagram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        System.out.println(cheakPanagram(sentence));

    }
    static boolean cheakPanagram(String sentence){
        boolean[] arr = new boolean [26];
        for (int i = 0; i <sentence.length() ; i++) {
            arr[sentence.charAt(i)-97]= true;
        }

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==false){
                return false;
            }
        }
        return true;
    }
}
