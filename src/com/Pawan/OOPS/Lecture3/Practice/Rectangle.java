package com.Pawan.OOPS.Lecture3.Practice;

public class Rectangle extends Box {
    double weight;

    Rectangle(){
        this.weight = -1;
    }

    Rectangle(double l , double w, double h , double weight){
        super(l,w,h);
        this.weight = weight;
    }
    public void message(){
        super.message();
        System.out.println("this message is from the child class ");
    }
}
