package com.Pawan.Methods;

public class Greeting {
    public static void main(String[] args) {
//        greeting();
        String message = greet();
        System.out.println(message);
    }

    static String greet (){
        String greeting = "Hii , Hope you are doing well";
        return greeting;
    }

//    void is used to display
    static void greeting(){
        System.out.println("Hello world");
    }
}
