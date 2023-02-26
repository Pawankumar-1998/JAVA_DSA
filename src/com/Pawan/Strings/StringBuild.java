package com.Pawan.Strings;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i=0 ; i<26 ; i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
//        System.out.println(builder);
        String s = builder.toString();
        System.out.println(s);
        builder.deleteCharAt(0);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
    }
}
