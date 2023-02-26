package com.Pawan.Linear_Search;

import java.util.Arrays;

public class Search_InString {
    public static void main(String[] args) {
        String name = "Pawan";
        char target = 'a';
        System.out.println(linearSearch(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(linearSearch2(name,target));

    }

//    iterating over array using for each loop
    static boolean linearSearch2(String str , char target){
        if (str.length()==0){
            return false;
        }
        for (char ch:str.toCharArray()){
            if (ch==target){
                return true;
            }
        }
        return false;
    }

    static boolean linearSearch(String str , char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
