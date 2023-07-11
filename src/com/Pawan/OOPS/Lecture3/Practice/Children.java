package com.Pawan.OOPS.Lecture3.Practice;

public class Children extends Parents{
    int standard;
    int age ;



    Children(){
        this.age = 10;
        this.standard = 1;
    }

    public void message() {
        System.out.println("this message if from child class ");
    }
}
