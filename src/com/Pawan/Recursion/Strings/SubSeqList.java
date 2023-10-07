package com.Pawan.Recursion.Strings;

import java.util.ArrayList;

public class SubSeqList {
    public static void main(String[] args) {
        System.out.println(f("" , "abc"));
    }
    static ArrayList<String> f(String ans , String remaining){
        if (remaining.isEmpty()){
            ArrayList<String> ansList = new ArrayList<>();
            ansList.add(ans);
            return ansList;
        }


        char selectedChar = remaining.charAt(0);

//        left tree contains taking the selectedChar
         ArrayList<String> leftArrayList = f(ans+selectedChar , remaining.substring(1));

//         the right tree ignores the first char
        ArrayList<String> rightArrayList = f(ans,remaining.substring(1));

//        add the arrayList which came from the right to the left array list
        leftArrayList.addAll(rightArrayList);
        return leftArrayList;

    }
}
