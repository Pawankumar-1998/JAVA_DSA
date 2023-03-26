package com.Pawan.OOPS.Lecture3.Inheritance.SingleIherit;

public class Rectangle extends Box{
    double weight;
    Rectangle(){
        this.weight = -1;
    }
    Rectangle(double side){
        super(side);
        this.weight=side;
    }

    Rectangle(double l , double w ,double h , double weight){
    super(l,w,h); //call the / use the parent class constructor (i.e Box Class )
    this.weight=weight;
    }

}
