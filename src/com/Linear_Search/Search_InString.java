package com.Linear_Search;

public class Search_InString {
    public static void main(String[] args) {
        String name = "Pawan";
        char target = 'a';
        System.out.println(linearSearch(name,target));

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
