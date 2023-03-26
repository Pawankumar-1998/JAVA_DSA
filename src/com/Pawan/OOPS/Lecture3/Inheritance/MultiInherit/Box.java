package com.Pawan.OOPS.Lecture3.Inheritance.MultiInherit;

public class Box {
    double l;
    double w;
    double h;
    //default constructor
    Box(){
        super();
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }


    //parameterised constructor
    Box(double side){
        this.l = side;
        this.h=side;
        this.w=side;
    }
    //parameterised constructor
    Box(double l , double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    //copy constructor
    Box(Box object){
        this.l = object.l;
        this.w = object.w;
        this.h = object.h;
    }


}
