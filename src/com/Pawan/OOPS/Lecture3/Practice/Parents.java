package com.Pawan.OOPS.Lecture3.Practice;

public class Parents {
    int money;
    private int age;
    int vehicle;

    String name;

    Parents(){
        this.money = 20000;
        this.age = 35;
        this.vehicle = 2;
        this.name = "unknow";
    }

    Parents(int money , int age , int vehicle, String name ){
        this.money = money;
        this.age = age;
        this.vehicle = vehicle;
        this.name = name ;
    }

    public void message(){
        System.out.println("we are " + this.name);
    }
}
