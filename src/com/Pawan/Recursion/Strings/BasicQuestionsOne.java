package com.Pawan.Recursion.Strings;

public class BasicQuestionsOne {
    public static void main(String[] args) {

            f("","pawan");
    }
    static void f(String ans , String Remaining){
        if(Remaining.isEmpty()){
            System.out.println(ans);
            return;
        }

        char temp = Remaining.charAt(0);


        if (temp=='a'){
            f(ans,Remaining.substring(1));
        } else {
            f(ans+temp , Remaining.substring(1));
        }
    }
}
