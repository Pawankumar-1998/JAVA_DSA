package com.Pawan.OOPS.Lecure2.StaticPart;

public class Human {
    int age ;
    String name;
    int salary;
    boolean married;

    static int population;

    static void message(){
        System.out.println("Hello Human");
    }
    Human(int age , String name , int salary , boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        population++;
        message();
    }
}
